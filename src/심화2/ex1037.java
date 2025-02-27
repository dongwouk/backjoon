package 심화2;

import java.util.Arrays;
import java.util.Scanner;

public class ex1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int[] divisors = new int[d];

		for (int i = 0; i < d; i++) {
			divisors[i] = sc.nextInt();
		}

		Arrays.sort(divisors);
		int N = divisors[0] * divisors[d - 1]; 

		System.out.println(N);
	}
}
