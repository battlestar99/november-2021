package package1;

public class bankAccount {
	
	// global variable are the properties or attributes of the class
	String name; 
	String address; 
	int amountOfmoney; 
	String ssn; 
	
	static int countClient; 
	
	 public bankAccount() {
			
			this.name=name; 
			System.out.println("An object is created with name");
			
		}
	
   public bankAccount(String name) {
		
		this.name=name; 
		System.out.println("An object is created with name");
		
	}
	
	public static void countClientsNumber() {
		
		
		
	}
	
   public static void closeAccount() {
		
		System.out.println("closing account");
		
	}
	
	
	public void transferMoney() {
		System.out.println("transferring money");
		depositMoney();
		
	}
	
	
	
	
	 void depositMoney() {
		
	System.out.println("depositing money");
		
	}
	
	
	public void depositMoney(int x) {
		
		System.out.println("depositing money in ATM");
		
		 
		
	}
	
	
	
	
	
	public void withdrawMoney() {
		
		System.out.println("withdrawing money");
		
	}
	
	
	
	
	
	
	
	
	

}
