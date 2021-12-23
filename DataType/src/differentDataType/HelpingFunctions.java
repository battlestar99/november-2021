package differentDataType;

public class HelpingFunctions {
	private int abc = 100;

	public void setAbc(int abc) {
		this.abc = abc;
	}

	public int getAbc(int a, int b) {
		return addTwoNumbers(a, b);
	}
	
	private int addTwoNumbers(int a, int b) {
		int sum = a + b;

		System.out.println(sum);
		return sum;
	}

	public void expenseCalculator(int uitilities, int shopping, int insurance, int fuel) {
		int monthlyRent = 1200;
		int parking = 60;

		int myExpense = monthlyRent + uitilities + insurance + parking + fuel;

		System.out.println(myExpense);
	}

	public void tempCalculator(double celsius) {
		abc = 123;
		double farenhite;
		int parking = 10;
		farenhite = (celsius * 1.8) + 32;
//		System.out.println(farenhite);
	}

	

	public String addTwoWords(String a, String b) {
		abc = 12;
		String sum = a + b;

		return sum;
	}

	public static boolean checkEquality(int a, int b) {

		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

}
