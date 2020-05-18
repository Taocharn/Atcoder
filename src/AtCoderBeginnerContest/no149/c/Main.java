package AtCoderBeginnerContest.no149.c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = getInt(sc);
		while (!isPrime(x)) {
			x++;
		}
		System.out.println(x);
	}

	private static boolean isPrime(int x) {
		if (x == 2) {
			return true;
		}
		for (int i = 3; i < x; i = i + 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
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

	/**
	 * *�ėp���\�b�h <br>
	 * �X�L���i�[����̓��͒l��int�z��ŕԋp
	 *
	 * @return
	 */
	public static int[] getIntArray(Scanner sc) {
		String line = "";
		// ���O��next()�����s���Ă���Ɖ��s�R�[�h��������Ă��܂��̂ł��̑΍�
		while (line.equals("")) {
			line = sc.nextLine();
		}

		String[] strArray = line.split(" ");
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}
