package 브루트포스;

import java.util.Scanner;

public class ex2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;

		while (true) {
			if (n % 5 == 0) {
				count += n / 5;
				System.out.println(count);
				break;
			}

			n -= 3;
			count++;
			if (n < 0) {
				System.out.println(-1);
				break;
			}
		}
	}
}
