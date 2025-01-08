package 브루트포스;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 행 열
		int n = sc.nextInt();
		int m = sc.nextInt();

		// 입력값
		char[][] board = new char[n][m];

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			board[i] = s.toCharArray();
		}

		// 최소값
		int result = Integer.MAX_VALUE;

		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int repaintBW = bw(board, i, j, 'B');
				int repaintWB = bw(board, i, j, 'W');
				result = Math.min(result, Math.min(repaintBW, repaintWB));
			}
		}
		System.out.println(result);

	}

	public static int bw(char[][] board, int row, int col, char color) {
		int count = 0;
		char startColor = color;

		for (int i = row; i < row + 8; i++) {
			for (int j = col; j < col + 8; j++) {
				if (board[i][j] != startColor) {
					count++;
				}
				startColor = (startColor == 'B') ? 'W' : 'B';
			}
			startColor = (startColor == 'B') ? 'W' : 'B';
		}
		return count;
	}
}
