package AtCoderBeginnerContest.no165.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.next());
		int max = Integer.parseInt(sc.next());
		int[] array = new int[length];
		array[length - 1] = max;
		int rules = Integer.parseInt(sc.next());
		List<Rule> ruleList = new ArrayList<>();
		for (int i = 0; i < rules; i++) {
			int start = Integer.parseInt(sc.next());
			int end = Integer.parseInt(sc.next());
			int dif = Integer.parseInt(sc.next());
			int point = Integer.parseInt(sc.next());
			for (Rule rule : ruleList) {
				if (rule.getStart() == start && rule.getEnd() == end && rule.getPoint() >= point) {
				} else {
					ruleList.add(new Rule(start, end, dif, point));
				}
			}

		}
		

	}

}

class Rule {
	private int start;
	private int end;
	private int dif;
	private int point;

	public Rule(int start, int end, int dif, int point) {
		this.start = start;
		this.end = end;
		this.dif = dif;
		this.point = point;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public int getDif() {
		return dif;
	}

	public int getPoint() {
		return point;
	}
}
