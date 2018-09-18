package oop;

class Titans {

	String name;
	String email;

	void walk() {
		System.out.println(name + " walk");
	}

	void run() {
		System.out.println(name + " run");
	}

	public static void main(String[] args) {

		Titans person1 = new Titans();
		person1.email = "email@email.com";
		person1.name = "anthony";

		person1.walk();
		person1.run();

	}
}