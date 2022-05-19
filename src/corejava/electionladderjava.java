package corejava;

import java.util.Scanner;

public class electionladderjava {

	public static void main(String[] args) {
	
		int age;
		String Nationality ="Nepali";
		System.out.println("Enter Your age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		System.out.println("Enter Your Nationality");
		Nationality=sc.next();
		
	    
	    
	    if(age>=18) {
	    	if(Nationality.equals("Nepali")) {
	    		System.out.println("You are voter");
	    	}
	    	else {
	    		System.out.println("You are not Nepali");
	    	}
	    	
	    }
	    else {
	    	System.out.println("You are not voter");
	    }
	    
	 

	}

}
