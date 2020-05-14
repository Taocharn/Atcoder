package AtCoderBeginnerContest.no163.d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		int select = Integer.parseInt(sc.next());
		int[] numArr = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			numArr[i] = i + (int) Math.pow(10, 6);
		}

		Set<Integer> resultSet = new HashSet<>();
		for (int i = select; i <= num + 1; i++) {
			List<int[]> combiList = Combination.combination(numArr, i);
			for (int[] combi : combiList) {
				resultSet.add(Arrays.stream(combi).sum());
			}
		}
		System.out.println(resultSet.size() % ((int) Math.pow(10, 9) + 7));

	}

}

class Combination {

	static List<String[]> combination(String[] data, int k) {
		var result = new ArrayList<String[]>();
		combination(data, 0, new String[k], 0, result);
		return result;
	}

	static void combination(String[] data, int di, String[] comb, int ci, List<String[]> result) {
		if (ci == comb.length) {
			result.add(comb.clone());
			return;
		}
		for (; di <= data.length - (comb.length - ci); di++) {
			comb[ci] = data[di];
			combination(data, di + 1, comb, ci + 1, result);
		}
	}

	static List<int[]> combination(int[] data, int k) {
		var result = new ArrayList<int[]>();
		combination(data, 0, new int[k], 0, result);
		return result;
	}

	static void combination(int[] data, int di, int[] comb, int ci, List<int[]> result) {
		if (ci == comb.length) {
			result.add(comb.clone());
			return;
		}
		for (; di <= data.length - (comb.length - ci); di++) {
			comb[ci] = data[di];
			combination(data, di + 1, comb, ci + 1, result);
		}
	}
}