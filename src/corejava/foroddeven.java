package corejava;

public class foroddeven {

	public static void main(String[] args) {
		int esum=0;
		int osum=0;
		 for(int i=1;i<=100;i++) {
			 
			 if(i%2==0)
			 {
				 esum=esum+i;
			 }else {
				 osum = osum+i++;
			 }
			 System.out.println("Sum of Even nos.="+esum);
			 System.out.println("Sum of odd nos.="+osum);
		     System.out.println("==========");
		     System.out.println("Total sum ="+(esum+osum));
		  
	}
}
	}
