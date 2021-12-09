package package1;

public class runClassOne {

	public static void main(String[] args) {
		
		// declare an object of the class
		basicClass bc; 
		
		// initialize
		bc = new basicClass();
		
		double x ; 
		x = bc.celsisusToFarenthite(12.45);
		 
		System.out.println(x);
		
		String name; 
		name = bc.getMyname();
		
		System.out.println(x);
		
		int a = 12; 
		int b = 14; 
		

		int c = bc.sum(a, b);
		
		System.out.println(c);

	}

}
