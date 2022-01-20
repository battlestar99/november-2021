package conditionalStatement;

public class ConditionalStatement {

	public static void main(String[] args) {

//		String light = "yellow";
//
//		boolean light = false;
//
//		if (light == true) {
//			System.out.println("Start driving");
//		} else if (light == false) {
//			System.out.println("stop driving");
//		}

		/**
		 * 
		 * you are a customer you went a dealer location you choose a car which base
		 * price is 30000 sales person will add 7% tax on 30000 tax = basePrice*7% he
		 * will also add admin fee 500 totalPrice = 30000 + 500 + (30000*7%) 
		 * totalPrice = basePrice + adminFee + tax
		 * 
		 * totalAfterDownPayment = 32600 - 5000 = 27600 you are going to pay that amount
		 * in 60 months apr = 1 if(creditScore >= 700){ apr = 3; }else if(creditScore >=
		 * 650 && creditScore <= 699){ apr = 4; }else if(creditScroe >= 600 &&
		 * creditScore <= 649){ apr = 5; }else{ System.out.println("you are not
		 * qualified for purchase"); } after adding apr to the price = 27600 * 4% =
		 * 28704 now monthly payment will be = 28704 / 60 = 478.40
		 * 
		 */
		
		
		int apr = 1;
		int creditScore = 6;

		if (creditScore >= 700) {
			apr = 3;
		} else if (creditScore >= 650 && creditScore <= 699) {
			apr = 4;
		} else if (creditScore >= 600 && creditScore <= 649) {
			apr = 5;
		} else {
			System.out.println("you are not qualified for purchase");
		}

		System.out.println(apr);
	}

}
