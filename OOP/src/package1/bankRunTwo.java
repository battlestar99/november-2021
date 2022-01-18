package package1;

public class bankRunTwo {

	public static void main(String[] args) {
		
		checkingAccount michael = new checkingAccount("dflfj"); 
		
	//	bankAccount ba = new bankAccount("dfhdk");
		
		savingAccount jim = new savingAccount("dfhdfk");
		
		
		
		jim.savingAmount=6700;
		
		michael.name="Michael";
		
		michael.setUpCheckingAccount();
		
		michael.transferMoney();
		
		

	}

}
