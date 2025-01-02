package 이차원배열;

import java.util.Scanner;

public class ex2566 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] nums = new int[9][9];
		int x = 0, y = 0, max = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				nums[i][j] = sc.nextInt();
				if (max < nums[i][j]) {
					x = i;
					y = j;
					max = nums[i][j];
				}
			}
		}
		System.out.println(max + "\n" + (x + 1) + " " + (y + 1));
	}
}
