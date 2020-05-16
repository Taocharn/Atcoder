package AtCoderGrandContest.no014.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = getInt(sc);
		int b = getInt(sc);
		int c = getInt(sc);

		int count = 0;
		while (true) {
			if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
				System.out.println(count);
				break;
			}
			int nextA = b / 2 + c / 2;
			int nextB = a / 2 + c / 2;
			int nextC = a / 2 + b / 2;

			// ��������Ă��ς��Ȃ��ꍇ����
			if (a == nextA && b == nextB && c == nextC) {
				System.out.println(-1);
				break;
			} else {
				a = nextA;
				b = nextB;
				c = nextC;
				count++;
			}
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

}
