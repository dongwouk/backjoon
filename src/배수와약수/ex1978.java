package 배수와약수;

import java.util.Scanner;

public class ex1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (isPrime(a)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
