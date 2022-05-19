package methods;
import java.util.Scanner;
public class MethodTriangle {

	public static void main(String[] args) {
		area();

	}
	

	static void area() {
    	 int b;
    	 System.out.println("Enter the number of b");
    	 Scanner sc=new Scanner(System.in);
    	 b=sc.nextInt();
    	 
    	 int h;
    	 System.out.println("Enter the number of h");
    	 Scanner sc1=new Scanner(System.in);
    	 h=sc.nextInt();
    	 
    	 int a=1/2 *b*h;
    	 System.out.println("Area ="+a);
    	 
     }
     
}
