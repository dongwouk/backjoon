package 약수배수와소수2;

import java.util.Scanner;

public class ex13241 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextInt();
		long y = sc.nextInt();

		System.out.println((x * y) / get(x,y));
	}
	private static long get(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
