package basics;

public class NumbersCalcReturn {

	public static void main(String[] arga) {
		int crisps = 20;
		int pot = 50;
		int plumb = 60;
		System.out.println(foodCost(crisps, pot, plumb));
	}

	static int foodCost(int crisps, int potato, int fruit) {
		int totalCost = crisps + potato + fruit;
		return totalCost + 200;
	}

}