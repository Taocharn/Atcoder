package hitachi2020.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = getInt(sc);
		int b = getInt(sc);
		int m = getInt(sc);

		int[] freezer = new int[a];
		int[] microwave = new int[b];

		int minFreezer = Integer.MAX_VALUE;
		int minMicrowave = Integer.MAX_VALUE;

		for (int i = 0; i < a; i++) {
			int price = getInt(sc);
			freezer[i] = price;
			if (price < minFreezer) {
				minFreezer = price;
			}
		}

		for (int i = 0; i < b; i++) {
			int price = getInt(sc);
			microwave[i] = price;
			if (price < minMicrowave) {
				minMicrowave = price;
			}
		}

		// �������s�g�p
		int min = minFreezer + minMicrowave;

		// �������g�p
		for (int i = 0; i < m; i++) {
			int couponF = getInt(sc);
			int couponM = getInt(sc);
			int discount = getInt(sc);
			int price = freezer[couponF - 1] + microwave[couponM - 1] - discount;
			if (price < min) {
				min = price;
			}
		}
		System.out.println(min);

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
