package BitManipulation;

import java.util.Scanner;

public class BinaryValueOfGivenNumber {

	static void binaryValue(int n) {
		String bv = "";
		
		while(n >= 1) {
			int x = n%2;
			n = n / 2;
			bv = x + bv; /* Concatenate the remainder with the string. */
					
		}
		System.out.println(bv);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		
		binaryValue(n); 

	}


}
