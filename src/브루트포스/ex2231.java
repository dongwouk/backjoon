package 브루트포스;

import java.util.Scanner;

public class ex2231 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int result = 0;
		for (int i = 0; i < n; i++) {
			int sum = i;
			int temp = i;

			while (temp != 0) {
				sum += temp % 10; // 자릿수 더하기
				temp /= 10; // 다음 자릿수
			}

			if (sum == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
