package AtCoderBeginnerContest.no158.c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = getInt(sc);
		int b = getInt(sc);

		int answer=1;
		while(true) {
			int tax8=answer*8/100;
			int tax10=answer*10/100;

			if(tax8==a&&tax10==b) {
				System.out.println(answer);
				break;
			}else if(tax8>a&&tax10>b) {
				System.out.println(-1);
				break;
			}
			answer++;

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
