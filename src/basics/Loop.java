package basics;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int moneyInBank = 110;
		Boolean anthonyPaid = false;

		if (moneyInBank == 100 && (anthonyPaid == true)) {
			System.out.println("Anthony is skint");
		}

		else if (moneyInBank > 100 && (anthonyPaid == false)) {
			System.out.println("Anthony is doing fine");
		}
	}
}