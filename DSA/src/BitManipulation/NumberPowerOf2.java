package BitManipulation;

import java.util.Scanner;

public class NumberPowerOf2 {
	/* checking the given number is power of 2 or note */
	static boolean powerOf2(int n) {
		if(n == 0) {
			return false;
		}
		return (n & (n-1))==0;
	}

	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);
		int n = scan.nextInt();
		System.out.println(powerOf2(n));
		

	}

}
