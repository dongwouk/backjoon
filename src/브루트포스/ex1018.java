package 브루트포스;

import java.util.Scanner;

public class ex1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] board = new char[n][m];

		for (int i = 0; i < n; i++) {
			String line = sc.next();
			board[i] = line.toCharArray();
		}

		int result = Integer.MAX_VALUE;

		for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                // 현재 8x8 보드에 대해 다시 칠해야 하는 칸의 수 계산
                int repaintBW = calculateRepaint(board, i, j, 'B');
                int repaintWB = calculateRepaint(board, i, j, 'W');
                result = Math.min(result, Math.min(repaintBW, repaintWB));
            }
        }

        // 결과 출력
        System.out.println(result);
        
        
	}
	private static int calculateRepaint(char[][] board, int startRow, int startCol, char startColor) {
        int repaintCount = 0;
        char currentColor = startColor;

        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if (board[i][j] != currentColor) {
                    repaintCount++;
                }
                // 다음 칸 색깔 변경
                currentColor = (currentColor == 'B') ? 'W' : 'B';
            }
            // 다음 행의 첫 번째 칸 색깔 변경
            currentColor = (currentColor == 'B') ? 'W' : 'B';
        }

        return repaintCount;
    }
}
