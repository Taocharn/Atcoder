package AtCoderBeginnerContest.no133.b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = getInt(sc);
		int d = getInt(sc);
		int[][] points = new int[n][d];

		for (int i = 0; i < n; i++) {
			points[i] = getIntArray(sc);
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (isInteger(getDistance(points[i], points[j]))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static boolean isInteger(double distance) {

		return (int) distance == distance;
	}

	private static double getDistance(int[] is, int[] is2) {
		int distanceSquare = 0;
		for (int i = 0; i < is.length; i++) {
			distanceSquare += Math.pow(is[i] - is2[i], 2);
		}
		return Math.sqrt(distanceSquare);
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