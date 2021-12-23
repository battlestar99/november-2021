package differentDataType;

public class ConditionalStatement {

	public static void main(String[] args) {
				
		
		System.out.println("First Line");
		
		try {
		int a = 50/0;
		System.out.println(a);
		}catch(Exception e) {
			System.out.println("No numbers can be devide by zero");
		}
		
		System.out.println("Last Line");
	
		String[] name = new String[3];
		
		System.out.println(name[3]);
		
		
		
//		int value = 1000;
//		
//		if(value >= 90) {
//			System.out.println("Grade is A");
//		}else if (value <= 89 && value >= 80) {
//			System.out.println("Grade is B");
//		}else if (value <= 79 && value >= 70) {
//			System.out.println("Grade is C");
//		}else {
//			System.out.println("Fail");
//		}

		

		/*
		 * Create a marking system
		 * you should have a variable for "mark"
		 * then you have to write a conditional statement for marking system
		 * 
		 * for 90 my output should be A
		 * for 80 my output should be B
		 * C
		 * D
		 * Fail
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
//		int myFirstValue = 30;
//		int mySecondValue = 10;
//		
//		if(myFirstValue == mySecondValue) {
//			System.out.println("My first value is less than second value");
//		}else if(myFirstValue >= mySecondValue) {
//			System.out.println("My first value is greater than second value");
//		}else {
//			System.out.println("both are equal");
//		}

	}

}
