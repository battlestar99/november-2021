package package2;

public class sampleClass {

	public static void main(String[] args) {
	
		int x = 56; 
		int y = 0; 
		
		try {
			
		int div = x/y; 
		
		} 
		
		catch(ArithmeticException e) {
		
			System.out.println(e.getMessage());
			System.out.println("Provide right input - exception happended");
			
		}
		
		
		
		
		
		System.out.println("after the exception");
		
		
		

	}

}
