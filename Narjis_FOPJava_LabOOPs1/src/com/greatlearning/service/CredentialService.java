package com.greatlearning.service;
import java.util.Random;
public class CredentialService {
	
	
	//function to generate email address
	public String generateEmailAddress(String fname, String lname, String dept)
	
	{
		
		return fname+lname+"@"+dept+".abc.com";
	}
	
	//function to generate random password
	public char[] generatePassword()
	
	{
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialChars = "!@#$%^&*";
				
		String value = capitalLetters+smallLetters+numbers+specialChars;
		
		char p[] = new char[8];
		
		Random random = new Random();
		for(int i = 0; i<8 ; i++) {
			
			p[i] = value.charAt(random.nextInt(value.length()));
		}
		
		return p;
	}
	
	//function to display credentials
	public void showCredentials(String fname, String lname, String genEmailAddress, char[] genPassword   )
	
	{
		System.out.println("Dear " + fname + ", your generated credentials are as follows");
		System.out.println("Email --> "+ genEmailAddress);
	    System.out.println("Password --> "+ genPassword);
	}
	
}
