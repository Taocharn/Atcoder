package nomura2020.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int apex;
	static int[] leaf;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = getInt(sc);
		leaf = getIntArray(sc);
		apex = 1;
		makeTree(0);
		System.out.println(Arrays.toString(leaf));
		for(int l:leaf) {
			if(l>0) {
				apex=-1;
				break;
			}
		}
		System.out.println(apex);

	}

	private static void makeTree(int depth) {
		if (leaf[depth] > 0) {
			//葉の頂点
			leaf[depth]--;
			return;
		}
		
		if(depth==leaf.length-1) {
			apex--;
			return;
		}
		//子が存在する
		//右
		apex++;
		depth++;
		makeTree(depth);

		//左
		apex++;
		makeTree(depth);

	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をlongで返却
	 *
	 * @return
	 */
	public static long getLong(Scanner sc) {

		return Long.parseLong(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をintで返却
	 *
	 * @return
	 */
	public static int getInt(Scanner sc) {

		return Integer.parseInt(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をStringで返却
	 *
	 * @return
	 */
	public static String getString(Scanner sc) {

		return sc.next();
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をint配列で返却
	 *
	 * @return
	 */
	public static int[] getIntArray(Scanner sc) {
		String line = "";
		// 直前にnext()を実行していると改行コードだけ取ってしまうのでその対策
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

class Node {
	int num;
	Node left;
	Node right;

	public Node(int num) {
		this.num = num;
	}
}
