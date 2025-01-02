package 일반수학1;

import java.util.Scanner;

public class ex2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 0.25, 0.1, 0.05, 0.01

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int q = 0, d = 0, ni = 0, p = 0;
			int result = sc.nextInt();
			while (result != 0) {
				if (result > 24) {
					q = result / 25;
					result -= q * 25;
				} else if (result > 9) {
					d = result / 10;
					result -= d * 10;
				} else if (result > 4) {
					ni = result / 5;
					result -= ni * 5;
				} else {
					p = result / 1;
					result -= p * 1;
				}
			}
			System.out.println(q + " " + d + " " + ni + " " + p);
		}
	}
}
