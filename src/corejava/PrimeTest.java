package corejava;

public class PrimeTest {

	public static void main(String[] args) {
		 
		//int n =89;
		int cnt=0;
		for(int n=100; n<=500;n++) {
		boolean isPrime=true;
		
		for(int i=2; i<n; i++) {
			
			if(n%i==0) {
				isPrime = false;
			}
		}
       
		
	if(isPrime) {
		System.out.println(n+"is prime number");
	
		//System.out.println(n);
		cnt++;
	}else { 
		System.out.println(n+"is not prime number");
	}

	}

		System.out.println("Total prime numbers="+cnt);
	}
}
