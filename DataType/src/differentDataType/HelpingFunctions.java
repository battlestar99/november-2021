package differentDataType;

public class HelpingFunctions {
	
	public void expenseCalculator(int uitilities, int shopping, int insurance, int fuel) {
		int monthlyRent = 1200;
		int parking = 60;
	
		int myExpense = monthlyRent+uitilities+insurance+parking+fuel;
		
		System.out.println(myExpense);
	}
	
	
	public void tempCalculator(double celsius) {
		
		double farenhite;
		
		farenhite = (celsius*1.8) + 32; 
		System.out.println(farenhite);
	}
	

}
