package packageTwo;

public class arraytest {

	public static void main(String[] args) {
		int myNumber = 4;
		int x [] = new int[5];
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;
		x[4] = 5;
		boolean isNumber = true;
		for (int i = 0; i<x.length; i++) {
			if(x[i]== myNumber) {		
				isNumber = true;
				break;
			}
			else {
				
				isNumber = false;
			}
		}
		if(isNumber == true) {
			System.out.println("I found my number");
		}else {
			System.out.println("my number is not in the list");
		}
		
	}

}
