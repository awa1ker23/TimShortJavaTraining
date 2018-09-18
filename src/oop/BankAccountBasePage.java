package oop;

public class BankAccountBasePage {

	private String name;
	private String address;
	private String phoneNumber;
	String ssn;
	String accountType;
	double balance = 0;
	double withdrawal = 3000;
	int initialDeposil;
	String accountNumber;
//	Final - this cannot be changed
	static final String routingNumber = "8888899999";

	BankAccountBasePage() {
		System.out.println("Bank Account Created");
	}

	BankAccountBasePage(String accountType) {
		System.out.println("New Account Created: " + accountType);
	}

	BankAccountBasePage(String accountType, int initialDeposit, int withdrawal) {
		System.out.println("New Account Created: " + accountType);
		System.out.println("Initial Deposit :  " + initialDeposit);
		String Msg = null;
		if (initialDeposit < 1000) {
			Msg = "ERROR: minimum deposit but be £1,000";
		} else {
			Msg = "Thanks for your initial deposit of " + initialDeposit;
		}

//		balance = initialDeposit - withdrawal;
//		int balance = initialDeposit - withdrawal;
//		System.out.println("New Balance £" + balance);

	}

// public - can be used anywhere in the 'package'
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("deposit");

	}

// void means there is no return statement
	void withdrawal(double amount) {
		balance = balance + amount;
		showActivity("withdraw");

	}

// Private can only be used in this class
	private void showActivity(String activity) {
		System.out.println("Your Recent transaction: " + activity);
		System.out.println("Your new balance is: " + balance);
	}

	void checkBalance() {

		System.out.println("The Balance: " + balance);

	}

	void getStatus() {

	}

	@override
	public String toString() {
		return "name: " + name + ", " + " Account Number: " + accountNumber + ", " + "Routing number: " + routingNumber
				+ ", " + "Balance: £" + balance;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;

	}
}
