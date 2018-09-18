package bankingAppPractice;

import java.util.Random;

import basics.iInterest;

public class BankAppFrontEnd {

	public static void main(String[] args) {

		BankAccount newUser1 = new BankAccount("jl886886l", "14101980", 100);
		BankAccount newUser2 = new BankAccount("ab987678n", "30051985", 101);
		BankAccount newUser3 = new BankAccount("fg768954l", "25121980", 99);
		Random number = new Random();
		newUser1.setName("Anthony");
		newUser1.setMoneyInn(100);
		newUser1.setMoneyOut(-100);
		System.out.println(newUser1.getName() + " money out: " + newUser1.getMoneyInn());
		System.out.println(newUser1.getName() + " money in: " + newUser1.getMoneyOut());
	}

}

// Class
class BankAccount implements iInterest {
	private String name;
	private String NI;
	private int dob;
	private String Adress;
	private static Integer accountNumber = 1000;
	int moneyInn;
	int moneyOut;
	int random;
	int deposit;
	int balance;

	// constructor
	public BankAccount(String NI, String dob, int firstDeposit) {
//		System.out.println("AccountNumber: " + accountNumber);
//		accountNumber++;
		int randomAccountNumber = (int) (Math.random() * 10000 + 1);
//		System.out.println("National Insurance Number: " + NI.substring(3, 7));
//		System.out.println("dob: " + dob.substring(6, 8));
		String bankAccountNumber = accountNumber.toString() + randomAccountNumber + NI.substring(3, 7)
				+ dob.substring(6, 8);
		System.out.println("Bank Account Number: " + bankAccountNumber);
		if (firstDeposit > 99) {
			System.out.println("Congratulations " + name + " you now have an account open with us, your balance is: £"
					+ firstDeposit + " and your account number is: " + bankAccountNumber);
		} else if (firstDeposit < 100) {
			System.out.println(name + " unfortuantely your initaial balance of " + firstDeposit
					+ " is not enough to open an account");

			deposit = firstDeposit;
			balance();
		}

	}

	private int balance() {
		balance = (int) ((deposit + moneyInn - moneyOut) + (interestRate * 100));
		System.out.println("balance " + balance);
		interestRate();
		return balance;
	}

	public void interestRate() {
		double balancePlusInterestRate = balance * interestRate;
		System.out.println("balance plus interest rate: " + balancePlusInterestRate);

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public int getMoneyInn() {
		return moneyInn;
	}

	public void setMoneyInn(int moneyInn) {
		this.moneyInn = moneyInn;
	}

	public int getMoneyOut() {
		return moneyOut;
	}

	public void setMoneyOut(int moneyOut) {
		this.moneyOut = moneyOut;

	}

}
