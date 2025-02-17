package 조합론;

import java.util.Scanner;

public class ex10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 1;
		if (n == 0 || n == 1) {
			System.out.println(1);
		} else {
			for (int i = 1; i <= n; i++) {
				sum*=i;
			}
			System.out.println(sum);
		}

	}
}
