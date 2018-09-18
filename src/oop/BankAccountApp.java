package oop;

public class BankAccountApp {

	public static void main(String[] args) {

		BankAccountBasePage newAcc1 = new BankAccountBasePage();
		BankAccountBasePage newAcc2 = new BankAccountBasePage("Savings Account");
		BankAccountBasePage newAcc3 = new BankAccountBasePage("Savings Account", 1001, 300);
//		newAcc2.Withdrawal();
		newAcc3.checkBalance();
		newAcc3.hashCode();

//		System.out.println(newAcc3.toString());

		newAcc1.setName("Anthony getters and setters");
		newAcc1.setAddress("8 bexley close");
		newAcc1.setPhoneNumber("07825660409");
		System.out.println(newAcc1.getName() + ", " + newAcc1.getAddress() + ", " + newAcc1.getPhoneNumber());
		newAcc1.accountType = "Savings";
		newAcc1.accountNumber = "123456789";
		newAcc1.deposit(100);
		newAcc1.deposit(100);
		newAcc1.deposit(100);
		newAcc1.withdrawal(150);
		System.out.println(newAcc1.toString());

		/*
		 * CdAccount CdAcc1 = new CdAccount(); CdAcc1.accountType = "Premium";
		 * CdAcc1.name = "Helena"; CdAcc1.toString();
		 * System.out.println(CdAcc1.toString());
		 */
	}

}
