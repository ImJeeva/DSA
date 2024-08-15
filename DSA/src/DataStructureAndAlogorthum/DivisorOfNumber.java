package DataStructureAndAlogorthum;

import java.util.Scanner;

public class DivisorOfNumber {
	static void  Divisor(int n) {
		int i = 0; /* To access the i-vale from second for loop; */
		for(i = 1;i * i <= n;i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		/* Assign value ascending order and remove duplicate values */
		for( ; i >= 1;i--) {
			if(n % i == 0 && i != n % i) {
				System.out.println(n / i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Divisor(n);
		
	}

}
