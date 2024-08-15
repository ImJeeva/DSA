package DataStructureAndAlogorthum;

import java.util.Scanner;

public class HCFandLCM {
	static int EuclidsAlogorthum(int a,int b){
	/* Optimized ECULIDS ALOGORTHUM */
		
	 while(a != 0 && b != 0) {
		if(a > b) {
			a = a % b;
		}
		else {
			b = b % a;
		}
	}
		if(a != 0) {
			return a;
		}
		else {
			return b;
		}

		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(EuclidsAlogorthum(a,b));
		
		/* Finding the LCM */ 
		System.out.println((a*b)/EuclidsAlogorthum(a,b));
		
	}

}
