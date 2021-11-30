package carPaymentCalculator;

public class carPaymentCalV1 {

	public static void main(String[] args) {
		
		double basePrice; 
		double downPayment; 
		double taxPercent; 
		double adminFee; 
		double titleFee; 
		double apr=1;
		int creditScore = 650; 
		int months = 70; 
		double totalPriceOfCar; 
		double totalPricewithTax; 
		double taxToPay;
		double financeAmount; 
		double totalfinanceAmount;
		double interestToPay; 
		double monthlyPayment; 
		
		
		basePrice = 40000; 
		downPayment = 10000; 
		taxPercent = 6; 
		adminFee = 500 ; 
		months = 60; 
		titleFee = 250; 
		
		 
		
		totalPriceOfCar = basePrice+adminFee+titleFee;
		
		System.out.println("Total price of the car ...");
		System.out.println(totalPriceOfCar);
		
		taxToPay = totalPriceOfCar*(taxPercent/100);
		
		System.out.println("Tax to be paid ...");
		System.out.println(taxToPay);
		
		totalPricewithTax = totalPriceOfCar + taxToPay;
		
		System.out.println("Total price with Tax ...");
		System.out.println(totalPricewithTax);
		
		financeAmount = totalPricewithTax - downPayment;
		
		System.out.println("Finacing amount for the car ...");
		System.out.println(financeAmount);
		
		

		
		if(creditScore>700) {
			
			apr = 1;
			
		}

	else if(creditScore<=700 && creditScore>600) {
			
			apr = 4;
			
		}
     
	else if(creditScore<=600 && creditScore>500) {
			
			apr = 6;
			
		}
	
	else {
		
		System.out.println("you are not eligible to buy a car");
		
	}


	interestToPay = financeAmount *(apr/100);
	
	
	totalfinanceAmount = financeAmount + interestToPay;
	
	monthlyPayment=totalfinanceAmount/months; 
	
	System.out.println("Monthly payment for the car...");
	System.out.println(monthlyPayment);

	}

}
