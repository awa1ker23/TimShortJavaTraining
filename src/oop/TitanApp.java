package oop;

public class TitanApp {

	public static void main(String[] args) {

		TitanBasePage NewTitan = new TitanBasePage();
		TitanBasePage NewTitan2 = new TitanBasePage("Jotunn", "imps");
		TitanBasePage NewTitan3 = new TitanBasePage("help");

		System.out.println(NewTitan.CostOfATitan);
		System.out.println(NewTitan2.CostOfATitan);
		System.out.println(NewTitan3.CostOfATitan);
		System.out.println(NewTitan.AmountOfTokens);
		System.out.println(NewTitan.Numbers);

	}
}