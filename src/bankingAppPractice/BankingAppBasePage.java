package bankingAppPractice;

public class BankingAppBasePage {

	String dob; // first two numbers
	int nIN; // 3rd to 5th number
	static int bankNumber = 1000000;
	String bankAccountNumber;

	BankingAppBasePage(int bankNumber, int nationalInsuranceNumber, int iD) {

		System.out.println("New Account Created: ");
		bankNumber++;
		System.out.println(bankNumber);

		System.out.println("bank account number: " + dob);
		System.out.println("new dob amount: " + "" + dob.substring(0, 2));
//		bankAccountNumber = dob.substring(0, 2) + nIN.
//		int bN = bankNumber
		System.out.println("Date Of Birth =" + dob);

//		int accountNumber = dateOfBirth + nationalInsuranceNumber + iD;
//		System.out.println(accountNumber);
//		System.out.println(dateOfBirth);
//		System.out.println(nationalInsuranceNumber);
//		System.out.println(iD);

	}

	public void dob(int i) {
		// TODO Auto-generated method stub

	}

}
