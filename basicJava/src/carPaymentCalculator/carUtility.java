package carPaymentCalculator;

public class carUtility {
	
	
	public double getTotalPrice(double baseprice, double adminfee, double title) {
		
		double totalprice = baseprice+adminfee+title; 
		return totalprice; 
		
		
	}
	
	
	public double getApr(int creditScore) {
		
		double apr = 0; 

		
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

		
	return apr; 	
		
		
	}

}
