package carPaymentCalculator;

import java.util.Scanner;

public class carPaymentCalV2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner sc = new Scanner(System.in);
		
		carUtility utility = new carUtility();
		
		System.out.println("Enter the base price of the car...");
		double basePrice = sc.nextDouble(); 
		
		Thread.sleep(3000);
		System.out.println("Enter the down payment amount...");
		double downPayment = sc.nextDouble(); 
		
		double taxPercent; 
		double adminFee; 
		double titleFee; 
		double apr=1;
		
		System.out.println("Enter your credit score...");
		int creditScore = sc.nextInt(); 
		
		System.out.println("Enter number of months for finance...");
		int months = sc.nextInt(); 
		
		
		double totalPriceOfCar; 
		double totalPricewithTax; 
		double taxToPay;
		double financeAmount; 
		double totalfinanceAmount;
		double interestToPay; 
		double monthlyPayment; 
		
		
		
		downPayment = 10000; 
		taxPercent = 6; 
		adminFee = 500 ; 
		months = 60; 
		titleFee = 250; 
		
		 
		// create a function to find the total price 
		// 
		
		totalPriceOfCar = utility.getTotalPrice(basePrice, adminFee, titleFee);
		
		
		//System.out.println("Total price of the car ...");
		//System.out.println(totalPriceOfCar);
		
		taxToPay = totalPriceOfCar*(taxPercent/100);
		
		//System.out.println("Tax to be paid ...");
		//System.out.println(taxToPay);
		
		totalPricewithTax = totalPriceOfCar + taxToPay;
		
		//System.out.println("Total price with Tax ...");
		//System.out.println(totalPricewithTax);
		
		financeAmount = totalPricewithTax - downPayment;
		
		//System.out.println("Financing amount for the car ...");
		//System.out.println(financeAmount);
		
		
		// finding apr function - parameter integer value credit score 
		// return type will be double which is apr 

		
		
		apr = utility.getApr(creditScore);
		
		
		
		/*
		 * if(creditScore>700) {
		 * 
		 * apr = 1;
		 * 
		 * }
		 * 
		 * else if(creditScore<=700 && creditScore>600) {
		 * 
		 * apr = 4;
		 * 
		 * }
		 * 
		 * else if(creditScore<=600 && creditScore>500) {
		 * 
		 * apr = 6;
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * System.out.println("you are not eligible to buy a car");
		 * 
		 * }
		 */

	interestToPay = financeAmount *(apr/100);
	
	
	totalfinanceAmount = financeAmount + interestToPay;
	
	monthlyPayment=totalfinanceAmount/months; 
	
	System.out.println("Monthly payment for the car...");
	System.out.println(monthlyPayment);

	}

}
