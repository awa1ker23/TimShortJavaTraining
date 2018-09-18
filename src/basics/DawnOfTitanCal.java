package basics;

public class DawnOfTitanCal {

	public static void main(String[] args) {

//		p = paramater
//		v = veriable
//		mn = method name

		int pbasicSoulsValue = 10;
		int pgems = 28;
		int pcostPerAttack = 3;
		int pSoulsTokenCount = 8;

		int pValueOfOneStarToken = 300;
		int pValueOfTwoStarToken = 450;
		int pValueOFThreeStarToken = 600;
		int pValueOfAFourStarToken = 850;

		int vAttacksRemaining = mnTotalAttacksRemaining(pgems, pcostPerAttack);
		int vOneStarAttack = mnSoulsGainedFromAOneStarAttack(pValueOfOneStarToken);
		int vTwoStarAttack = mnSoulsGainedFromATwoStarAttack(pValueOfTwoStarToken);
		int vThreeStarAttack = mnSoulsGainedFromAThreeStarAttack(pValueOFThreeStarToken);
		int vFourStarAttack = mnsoulsGainedFromAFourStarAttack(pValueOfAFourStarToken);
		int vOneStarsReceived = mnTotalSoulsReceivedForAOneStarAttack(pValueOfOneStarToken, pSoulsTokenCount);
		int vTwoStarsReceived = mnTotalSoulsReceivedForATwoStarAttack(pValueOfTwoStarToken, pSoulsTokenCount);
		int vThreeStarReceived = mnTotalSoulsReceivedForAThreeStarAttack(pValueOFThreeStarToken, pSoulsTokenCount);
		int vFourStarReceived = mnTotalSoulsReceivedForAFourStarAttack(pValueOfAFourStarToken, pSoulsTokenCount);

		System.out.println("Attacks remaining is " + vAttacksRemaining);
		System.out.println("Souls gained from a one star attack is " + vOneStarAttack);
		System.out.println("Souls gained from a two star attack is " + vTwoStarAttack);
		System.out.println("Souls gained from a three star attack is " + vThreeStarAttack);
		System.out.println("Souls gained from a four star attack is " + vFourStarAttack);

		System.out.println("Total Souls received for a one star attack is " + vOneStarsReceived);
		System.out.println("Total Souls received for a two star attack is " + vTwoStarsReceived);
		System.out.println("Total Souls received for a three star attack is " + vThreeStarReceived);
		System.out.println("Total Souls received for a four star attack is " + vFourStarReceived);

	}

//	attacks remaining 
	public static int mnTotalAttacksRemaining(int pgems, int pcostPerAttack) {
		return pgems / pcostPerAttack;
	}

//	souls gained from a one star attack
	public static int mnSoulsGainedFromAOneStarAttack(int pValueOfOneStarToken) {
		return pValueOfOneStarToken / 10;
	}

//	vaue of a two star attack
	public static int mnSoulsGainedFromATwoStarAttack(int pValueOfATwoStarToken) {
		return pValueOfATwoStarToken / 10;
	}

// 	value of a three star attack
	public static int mnSoulsGainedFromAThreeStarAttack(int pValueOfThreeStarToken) {
		return pValueOfThreeStarToken / 10;
	}

//	value of a 4 star attack
	public static int mnsoulsGainedFromAFourStarAttack(int pValueOfAFourStarToken) {
		return pValueOfAFourStarToken / 10;
	}

//	points earned for a 1 star attack
	public static int mnTotalSoulsReceivedForAOneStarAttack(int pValueOfOneStarToken, int pSoulsTokenCount) {
		return pValueOfOneStarToken / 10 * pSoulsTokenCount;
	}

//	points earned for a 2 star attack
	public static int mnTotalSoulsReceivedForATwoStarAttack(int pValueOfTwoStarToken, int pSoulsTokenCount) {
		return pValueOfTwoStarToken / 10 * pSoulsTokenCount;
	}

//	points earned for a 3 star attack
	public static int mnTotalSoulsReceivedForAThreeStarAttack(int pValueOfThreeStarToken, int pSoulsTokenCount) {
		return pValueOfThreeStarToken / 10 * pSoulsTokenCount;
	}

//	points earned for a 4 star attack
	public static int mnTotalSoulsReceivedForAFourStarAttack(int pValueOfAFourStarToken, int pSoulsTokenCount) {
		return pValueOfAFourStarToken / 10 * pSoulsTokenCount;
	}
//	Plus titan bonus

}