package AtCoderBeginnerContest.no166.d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = Long.parseLong(sc.next());
		// A^5=X+B^5
		for (int i = 0;; i++) {
			// X+B^5‚Ì•”•ª‚ğ‰¼‚Åo‚·
			long rs = (long) Math.pow(i, 5);
			long pow5b = rs - x; // b^5‚Ì’l
			if (isInteger(pow5b)) { // pow5b‚ª®”‚Ì5æ‚Ì‚Æ‚«
				long b = (long) calc5root(pow5b);
				long a = (long) calc5root(rs);
				print(a, b);
				break;
			}

			// i‚ğ•‰‚É”½“]‚³‚¹‚ÄŒvZ
			rs = (long) Math.pow(-i, 5);
			pow5b = rs - x;
			if (isInteger(pow5b)) { // pow5b‚ª®”‚Ì5æ‚Ì‚Æ‚«
				long b = (long) calc5root(pow5b);
				long a = (long) calc5root(rs);
				print(a, b);
				break;
			}
		}

	}

	private static void print(long a, long b) {
		System.out.println(a + " " + b);

	}

	private static boolean isInteger(long pow5b) {
		// ®”‚©‚Ç‚¤‚©
		double root = calc5root(pow5b);
		return root == (long) root;
	}

	private static double calc5root(long base) {
		// 5æª‚ğŒvZ
		if (base > 0) {
			return Math.pow(Math.E, Math.log((double) base) / 5.0);
//			return Math.pow(base, 1.0 / 5.0);
		} else {
			return -Math.pow(Math.E, Math.log((double) -base) / 5.0);
//			return -Math.pow(-base, 1.0 / 5.0);
		}

	}

}
