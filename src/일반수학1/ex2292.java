package 일반수학1;

import java.util.Scanner;

public class ex2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n == 1) {
			System.out.println(1);
			return;
		}

		int layer = 1;
		int range = 1;

		while (n > range) {
			range += 6 * layer;
			layer++;
		}
		System.out.println(layer);
	}
}
