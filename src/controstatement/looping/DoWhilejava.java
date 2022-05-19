package controstatement.looping;

import java.util.Scanner;

public class DoWhilejava {

	public static void main(String[] args) {
		
		
		int n;
		
		System.out.println("Enter the number of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int i;
		System.out.println("Enter the number of i");
		Scanner sc1=new Scanner(System.in);
		i=sc.nextInt();
		
		do {
     	   
     	   System.out.println(n+ " x" +i+" ="+(n*i));
     	     
     	   i++;

	}while(i<=10);
		

	}

}
