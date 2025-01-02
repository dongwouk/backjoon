package 배수와약수;

import java.util.Scanner;

public class ex2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int min = Integer.MAX_VALUE;

		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			if (isPrime(i)) {
				sum += i;
				if (min > i) {
					min = i;
				}
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
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
