package AtCoderBeginnerContest.no158.b;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		long n = getLong(sc);
		long a = getLong(sc);
		long b = getLong(sc);

		long blueBall = 0;
		blueBall += n / (a + b)*a;
		n = n % (a + b);
		if (n < a) {
			blueBall += n;
		} else {
			blueBall += a;
		}
		System.out.println(blueBall);
	}

	/**
	 * *�ėp���\�b�h <br>
	 * �X�L���i�[����̓��͒l��long�ŕԋp
	 *
	 * @return
	 */
	public static long getLong(Scanner sc) {

		return Long.parseLong(sc.next());
	}

}
