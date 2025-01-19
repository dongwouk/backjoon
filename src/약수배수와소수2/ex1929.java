package 약수배수와소수2;

import java.util.Scanner;

public class ex1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		boolean[] isNotPrime = new boolean[N + 1];
		isNotPrime[0] = true;
		isNotPrime[1] = true;

		for (int i = 2; i * i <= N; i++) {
			if (!isNotPrime[i]) {
				for (int j = i * i; j <= N; j += i) {
					isNotPrime[j] = true;
				}
			}
		}

		for (int i = M; i <= N; i++) {
			if (!isNotPrime[i]) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
