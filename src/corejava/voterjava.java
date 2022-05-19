package corejava;

import java.util.Scanner;

public class voterjava {
	 
	public static void main(String[] args) {
		
		int age ;
	
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("You are voter");
			age=sc.nextInt();
			
		}else {
			System.out.println("You are non voter");
			age=sc.nextInt();
		}
			
	}
	
	

}
