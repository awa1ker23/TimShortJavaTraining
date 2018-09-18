package basics;

public class Favtorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1=1*1=1
//		2=2*1=2
//		3=3*2*1=6
//		4=4*3*2*1=24
		System.out.println(fav(5));
	}

	public static int fav(int n) {
		if (n == 1) {
			return 1;

		}
		return ((fav(n - 1) * n));

	}

}