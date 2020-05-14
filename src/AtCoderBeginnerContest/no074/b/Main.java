package AtCoderBeginnerContest.no074.b;

import java.util.Scanner;

public class Main {
	static int[][] bingo = new int[3][3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		int total=0;
		for(int i=0;i<n;i++) {
			int ball = Integer.parseInt(sc.next());
			if(ball<k-ball) {	//A‚Ì•û‚ª’Z‚¢
				total+=ball*2;
			}else {
				total+=(k-ball)*2;
			}
		}
		System.out.println(total);
	}


}
