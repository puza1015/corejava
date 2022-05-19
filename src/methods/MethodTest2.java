package methods;


public class MethodTest2 {
	

	public static void main(String[] args) {
		
   printTable(70);
	}
	//no.return type with arguments
	
	static void printTable(int n) {
		
		
		for(int i=1; i<=10;i++) {
			System.out.println(n+"x"+i+" = "+(n*i));
		}
		
			
	}
	
	

}
