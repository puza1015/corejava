package corejava;

import java.util.Scanner;

public class ladderifjava {

	public static void main(String[] args) {
	  
		int marks;
		System.out.println("Enter your marks");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		
		
		if (marks>=87) {
			System.out.println("A+");
	}else if (marks>=80)
	{
		System.out.println("B+");
	}
	else if(marks>=60) {
			System.out.println("C+");
		
	}else if(marks>=50) {
		System.out.println("D+");
	}
	else {
		System.out.println("Fail");
	}
	}
}