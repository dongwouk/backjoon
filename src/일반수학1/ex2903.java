package 일반수학1;

import java.util.Scanner;

public class ex2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt()-1;

		long result = (long) Math.pow(2, n + 1) - 1;

		System.out.println((int)Math.pow(result+2,2));
	}
}
