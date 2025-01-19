package 약수배수와소수2;

import java.util.Scanner;

public class ex17103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 1_000_000;
		boolean[] isPrime = new boolean[max + 1];

		for (int i = 2; i <= max; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i * i <= max; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= max; j += i) {
					isPrime[j] = false;
				}
			}
		}

		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int count = 0;

			for (int p = 2; p <= n / 2; p++) {
				if (isPrime[p] && isPrime[n - p]) {
					count++;
				}
			}

			System.out.println(count);
		}

		sc.close();
	}
}
