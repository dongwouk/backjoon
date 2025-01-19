package 약수배수와소수2;

import java.util.Scanner;

public class ex2485 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] trees = new int[n];
		for (int i = 0; i < n; i++) {
			trees[i] = sc.nextInt();
		}

		int[] gaps = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			gaps[i] = trees[i + 1] - trees[i];
		}

		int gcd = gaps[0];
		for (int i = 1; i < gaps.length; i++) {
			gcd = getGCD(gcd, gaps[i]);
		}

		int additionalTrees = 0;
		for (int gap : gaps) {
			additionalTrees += (gap / gcd) - 1;
		}

		System.out.println(additionalTrees);
	}

	private static int getGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
