package methods;

public class MethodTest {
	
 
	public static void main(String[] args) {
		sum();

	}
	
	//1. no return type with no arguments
	static void sum( ) {
		
		int a= 700;
		int b= 500;
		
		int s=a+b;
		System.out.println("Total sum ="+s);
	}

}
