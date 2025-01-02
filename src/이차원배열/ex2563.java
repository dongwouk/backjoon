package 이차원배열;

import java.util.Scanner;

public class ex2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int area = 0;

		boolean[][] paper = new boolean[100][100];

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int j2 = y; j2 < y + 10; j2++) {
					paper[j][j2] = true;
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (paper[i][j])
					area++;
			}
		}
		System.out.println(area);
	}
}
