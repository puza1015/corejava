package corejava;

public class EnhanceFor {
		
		/*
		 * -------Enhance For loop----
		 * # is to read data from collection 
		 * 
		 * syntax :
		 * 
		 * for (data_type var:collection){
		 *   //multiple data collection
		 *  //Statements
		 *  
		 *  
		 *  
		 *  }
		 */
          
	public static void main(String[] args) {
		
		int data[] = { 50,69,46,38,60,30,30,59};
		int s=0;
		for(int x:data) {
			System.out.println(x);
			s+=x;
			
		}
	
		System.out.println("Total ="+s);
		
	}

}
