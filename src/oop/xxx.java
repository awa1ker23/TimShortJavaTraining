package oop;

public class xxx {

	public static void main(String[] args) {
		bankAccount acc1 = new bankAccount("323234324");
		bankAccount acc2 = new bankAccount("323234324");
		bankAccount acc3 = new bankAccount("323234324");
		bankAccount acc4 = new bankAccount("323234324");

	}

}

class bankAccount {

	private String snn;
	private static int iD = 1000;

	public bankAccount(String ssn) {
		System.out.println("New Account Created");
		iD++;
		System.out.println(iD);

	}
}