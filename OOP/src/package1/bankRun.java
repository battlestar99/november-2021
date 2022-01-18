package package1;

public class bankRun {

	public static void main(String[] args) {
		
		bankAccount john = new bankAccount("john4566");
		
		bankAccount mike =new bankAccount("mikemike");
		
		bankAccount dave =new bankAccount("Dave123");
		
		System.out.println(dave.name);
		System.out.println(john.name);
		System.out.println(mike.name);
		
		john.address="fairfax";
		
		mike.address="DC";
		
		System.out.println(mike.address);
		
		System.out.println(john.amountOfmoney);
		
		mike.depositMoney();
		
		mike.depositMoney(12);
		
		
		

	}

}
