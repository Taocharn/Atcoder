package AtCoderBeginnerContest.no156.b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		int k = Integer.parseInt(sc.next());
		System.out.println(Long.toString(n, k).length());

	}

}
