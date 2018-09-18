package oop;

public class TitanBasePage {

	String TitanName;
	String UnitType;
	String Element;
	static String CostOfATitan = "1234567";
	static final String AmountOfTokens = "100000";
	String Numbers = "2222222";

	TitanBasePage() {
		System.out.println("This is the Default");
	}

	TitanBasePage(String TitanName, String UnitType) {
		System.out.println("the titan is " + TitanName + "The unit buffed is " + UnitType);
	}

	TitanBasePage(String CostOfATitan) {
		System.out.println(CostOfATitan);

	}

	void totalGems() {

	}

	void totalGold() {

	}

	void totalFood() {

	}
}