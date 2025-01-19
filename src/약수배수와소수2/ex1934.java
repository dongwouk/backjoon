package 약수배수와소수2;

import java.util.Scanner;

public class ex1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int gcd = get(x, y);
			list[i] = (x * y) / gcd;

		}
		for (int a : list) {
			System.out.println(a);
		}

	}

	private static int get(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
