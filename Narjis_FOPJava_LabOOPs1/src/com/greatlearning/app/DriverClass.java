package com.greatlearning.app;
import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {
//main method
	public static void main(String[] args) {
		
		
		//name input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your First Name");
		String fn = sc.next();
		
		System.out.println("Enter your Last Name");
		String ln = sc.next();
		
		//creating employee object
		Employee e1 = new Employee(fn, ln);// parameterized constructor
		
		//creating cred-service object
		CredentialService cs = new CredentialService();
		
		//creating local variables 
		String genEmailAddress = "";
		char[] genPassword = null;
		
		
		//begin do-while loop
		do 
		{	
			
		//display menu 
		System.out.println("Please choose your department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("5. Exit");
		
		//department choice input	
		int choice = sc.nextInt();
		
		//begin switch statement
		switch(choice)
		
		{
		case 1: 
			
			genEmailAddress = cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "tech");
			genPassword = cs.generatePassword();
			break;
			
        case 2: 
			
			genEmailAddress = cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "admin");
			genPassword = cs.generatePassword();
			break;
        
        case 3: 
			
			genEmailAddress = cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "hr");
			genPassword = cs.generatePassword();
			break;
			
        case 4: 
			
			genEmailAddress = cs.generateEmailAddress(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(), "legal");
			genPassword = cs.generatePassword();
			break;
			
        case 5: 
        	
        	System.exit(0);
        	
        default:
        	
        	System.out.println("Please enter a valid choice");
        	
		    } //end switch statement
	
	//calling display function
	cs.showCredentials(e1.getFirstName(), e1.getLastName(), genEmailAddress, genPassword);
		
		} while(true); //end do while loop
	
	}

}
