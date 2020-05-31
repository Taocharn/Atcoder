package AtCoderBeginnerContest.no141.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = getInt(sc);
		int k = getInt(sc);
		int q = getInt(sc);

		Map<Integer, Integer> answerMap = new HashMap<>();
		for (int i = 0; i < q; i++) {
			int responder = getInt(sc);
			if (answerMap.containsKey(responder)) {
				answerMap.replace(responder, answerMap.get(responder) + 1);
			} else {
				answerMap.put(responder, 1);
			}
		}
		for (int i = 1; i <= n; i++) {
			int point = 0;
			if (answerMap.containsKey(i)) {
				point = answerMap.get(i);
			}

			if (point > q - k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	/**
	 * *�ėp���\�b�h<br>
	 * ���͂����z��ɑ΂��鏇����擾
	 *
	 * @param numArray
	 * @return
	 */
	private static List<Integer[]> getPermutation(int[] numArray) {
		List<Integer[]> permutation = new ArrayList<>();
		Integer[] ans = new Integer[numArray.length];
		boolean[] used = new boolean[numArray.length];

		return buildPermutaion(permutation, numArray, ans, used, 0);
	}

	/**
	 * *�ėp���\�b�h(����)<br>
	 * ���͂����z��ɑ΂��鏇����쐬
	 *
	 * @param list
	 * @param numArray
	 * @param ans
	 * @param used
	 * @param depth
	 * @return
	 */
	private static List<Integer[]> buildPermutaion(List<Integer[]> list, int[] numArray, Integer[] ans, boolean[] used,
			int depth) {

		// �S���g���؂�����=>�ł��������Ԃ�
		if (depth == numArray.length) {
			list.add(ans.clone());
			return list;
		}
		// �g���؂��Ă��Ȃ��ꍇ

		for (int i = 0; i < numArray.length; i++) {
			if (used[i]) {
				continue;
			}
			ans[depth] = numArray[i];
			used[i] = true;
			list = buildPermutaion(list, numArray, ans, used, depth + 1);

			used[i] = false;
		}

		return list;
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

class Status {
	int row = 0;
	int col = 0;
	int candies = 0;

	public Status(int row, int col, int candies) {
		this.row = row;
		this.col = col;
		this.candies = candies;
	}
}