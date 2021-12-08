package differentDataType;

import javax.rmi.CORBA.Util;

public class FunctionsLearning {

	public static void main(String[] args) {
		
		
		
//		int mySum = add.addTwoNumbers(10, 50)+100;
//		
//		System.out.println(mySum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		add.addTwoNumbers(20, 30);
//
//		add.addThreeNumbers(10, 20, 30);
//		
//		add.addFourNumbers(10, 20, 30, 40);
//		
//		Multiplication mult = new Multiplication();
//		
//		mult.multiplicationTwoNumbers(10, 20);
//		
//		mult.multiplicationThreeNumbers(50, 44, 54);
		
		Addition add = new Addition();
		
		int sumOfTwoNumbers = add.addTwoNumbers(50, 50);
		int sumOfThreeNumbers = add.addThreeNumbers(10, 20, 30);
		
		int sum = sumOfTwoNumbers+sumOfThreeNumbers;
		
		System.out.println(sumOfTwoNumbers);
		System.out.println(sumOfThreeNumbers);
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

