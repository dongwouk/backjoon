package 심화1;

import java.util.Scanner;

public class ex2444 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 

		// 상단 피라미드
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" "); // 공백 출력
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*"); // 별 출력
			}
			System.out.println(); // 줄 바꿈
		}

		// 하단 역피라미드
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" "); // 공백 출력
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*"); // 별 출력
			}
			System.out.println(); // 줄 바꿈
		}
	}
}
