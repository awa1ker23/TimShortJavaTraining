package basics;

public class Fibanarci {

	public static void main(String[] args) {

//		fib[0] 0
//		fib[1] 1
//		fib[2] 1+0=1
//		fib[3] 1+1=2
//		fib[4] 1+2=3
//		fib[5] 2+3=5
//		fib[6] 3+5=8
//		fib[7] 5+8=13
//		fib[8] 7+13=21

		System.out.println(fib(5));

	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return (((fib(n - 1))) + (fib(n - 2)));
	}
}