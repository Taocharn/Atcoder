package AtCoderBeginnerContest.no156.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());

		if (n < 10) {
			System.out.println(r + (100 * (10 - n)));
		} else {
			System.out.println(r);
		}
	}
}
