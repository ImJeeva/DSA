package BitManipulation;

import java.util.Scanner;

public class BinaryToDesimal {
	
	static void BToD(String  n) {
		int res = 0, powerOf2 = 1; /* 2^0 - is =1 */
		
		for(int i=n.length()-1 ; i >= 0 ; i--) {
			if(n.charAt(i)=='1') {
				res += powerOf2;
			}
			powerOf2 *= 2; /* increase the power value. */
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String  n=scan.nextLine();
		
		BToD(n);
		
	}

}
