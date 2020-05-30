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
			//�t�̒��_
			leaf[depth]--;
			return;
		}
		
		if(depth==leaf.length-1) {
			apex--;
			return;
		}
		//�q�����݂���
		//�E
		apex++;
		depth++;
		makeTree(depth);

		//��
		apex++;
		makeTree(depth);

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

class Node {
	int num;
	Node left;
	Node right;

	public Node(int num) {
		this.num = num;
	}
}
