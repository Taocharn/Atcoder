package AtCoderBeginnerContest.no132.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = getString(sc);

		String[] sArr = s.split("");
		Arrays.sort(sArr);
		if (sArr[0].equals(sArr[1]) && sArr[2].equals(sArr[3]) && !sArr[1].equals(sArr[2])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
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

	/**
	 * *�ėp���\�b�h <br>
	 * �X�L���i�[����̓��͒l��int�ŕԋp
	 *
	 * @return
	 */
	public static int getInt(Scanner sc) {

		return Integer.parseInt(sc.next());
	}

	/**
	 * *�ėp���\�b�h <br>
	 * �X�L���i�[����̓��͒l��String�ŕԋp
	 *
	 * @return
	 */
	public static String getString(Scanner sc) {

		return sc.next();
	}

}
