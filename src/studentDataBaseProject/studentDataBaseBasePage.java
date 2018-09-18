package studentDataBaseProject;

import java.util.Random;

public class studentDataBaseBasePage {

	String firstname;
	String surname;
	String nI;
	private final String eMail = "@test.com";
	private static int studentId = 22230;
	Integer random;
	private String uniqueUserId;
	String english;
	String maths;
	String history;
	String french;

	studentDataBaseBasePage(String firstname, String surname, String nI, String english, String maths, String history,
			String french) {
		String eMAilAddress = firstname + "." + surname + eMail;
		System.out.println("email address: " + eMAilAddress + ", Student ID: " + studentId);
		studentId++;
//		System.out.println(studentId);
		int randomNumber = new Random().nextInt(9999 - 1000) + 1000;
		uniqueUserId = studentId + randomNumber + nI.substring(3, 6);
		System.out.println(firstname + "'s " + "Unique ID: " + studentId + uniqueUserId);
		System.out.println(english);
	}

	private void enroll() {
//		Grades required to enrol
	}

	private void pay() {
//			cost to join
	}

	private void checkBalance() {
//		balance in the students account
	}

	private void showCourses() {
//		course available

	}

	public void english(String englishResult) {
	}

	public void history(String historyResult) {

	}

	public void maths(String mathsResult) {

	}

	public void french(String frenchResult) {

	}
}
