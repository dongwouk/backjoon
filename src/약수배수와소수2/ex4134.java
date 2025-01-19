package 약수배수와소수2;

import java.util.Scanner;

public class ex4134 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			long n = sc.nextLong();
			System.out.println(nextPrime(n));
		}

		sc.close();
	}

	private static long nextPrime(long n) {
		if (n <= 1)
			return 2;
		if (n == 2)
			return 2;

		if (n % 2 == 0)
			n++;

		while (!isPrime(n)) {
			n += 2;
		}
		return n;
	}

	private static boolean isPrime(long num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;

		for (long i = 3; i * i <= num; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
