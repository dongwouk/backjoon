package 약수배수와소수2;

import java.util.Scanner;

public class ex4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 246912;
		boolean[] isNotPrime = new boolean[max + 1];
		isNotPrime[0] = true;
		isNotPrime[1] = true;

		for (int i = 2; i * i <= max; i++) {
			if (!isNotPrime[i]) {
				for (int j = i * i; j <= max; j += i) {
					isNotPrime[j] = true;
				}
			}
		}

		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (!isNotPrime[i]) {
					count++;
				}
			}
			System.out.println(count);
		}

		sc.close();
	}
}
