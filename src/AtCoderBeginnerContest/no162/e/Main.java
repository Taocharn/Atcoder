package AtCoderBeginnerContest.no162.e;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int seq;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		seq = Integer.parseInt(sc.next());
		int num = Integer.parseInt(sc.next());

		List<Queue<Integer>> combiList=new ArrayList<>();
		combiList=calcCombi(seq, combiList,num);

		long total=0;
		for(int i=0;i<combiList.size();i++) {
			total+=calcGCDQue(combiList.get(i));
			if(total>1000000007) {
				total=total%1000000007;
			}
		}
		System.out.println(total);
	}

	public static List<Queue<Integer>> calcCombi(int deepness, List<Queue<Integer>> list,int num) {
		if (deepness == 0) {
			return list;
		}
		for (int i = 0; i < num; i++) {
			if (i > list.size() - 1) {
				Queue<Integer> numQueue = new ArrayDeque();
				list.add(numQueue);
			}
			list.get(i)
					.add(i + 1);
		}
		return calcCombi(deepness - 1, list,num);
	}

	public static int calcGCDQue(Queue<Integer> queue) {

		while(queue.size()>1) {
			int a=queue.poll();
			int b=queue.poll();
			queue.add(calcGCD(a, b));
		}

		return queue.poll();
	}

	public static int calcGCD(int a, int b) {
		int[] numArray = { a, b };
		Arrays.sort(numArray);
		int x;
		int y;
		x = numArray[1];
		y = numArray[0];

		int tmp;
		while ((tmp = x % y) != 0) {
			x = y;
			y = tmp;
		}
		return y;
	}
}
