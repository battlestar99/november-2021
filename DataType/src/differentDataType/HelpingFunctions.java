package differentDataType;

public class HelpingFunctions {
	int parking;
	public void expenseCalculator(int uitilities, int shopping, int insurance, int fuel) {
		int monthlyRent = 1200;
		parking = 60;
	
		int myExpense = monthlyRent+uitilities+insurance+parking+fuel;
		
		System.out.println(myExpense);
	}
	
	
	public void tempCalculator(double celsius) {
		
		double farenhite;
		parking = 10;
		farenhite = (celsius*1.8) + 32; 
//		System.out.println(farenhite);
	}
	
	public static int addTwoNumbers(int a, int b) {
				
		int sum = a + b;
		
		return sum;
	}
	
	public static String addTwoWords(String a, String b) {
		
		String sum = a + b;
		
		return sum;
	}
	
	
	
	public boolean checkEquality(int a, int b) {
		
		if(a==b) {
			return true;
		}else {
			return false;
		}
	}
	

}
