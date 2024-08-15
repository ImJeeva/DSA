package DataStructureAndAlogorthum;

import java.util.Scanner;

public class TrailingZero {
	static void Trailing0(int n) {
		/* Find the trailing ZEROS of given number */

		int res = 0, powerOf5 = 5;
		while (n >= powerOf5) {
			res = res + (n / powerOf5);
			powerOf5 *= 5;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		/* Taking the input from User */
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Trailing0(n);

	}
}
