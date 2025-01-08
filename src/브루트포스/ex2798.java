package 브루트포스;

import java.util.Scanner;

public class ex2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int target = sc.nextInt();
		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}

		int maxSum = 0;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = list[i] + list[j] + list[k];
					if (sum <= target && sum > maxSum) {
						maxSum = sum;
					}
				}
			}
		}
		System.out.println(maxSum);
	}
}
