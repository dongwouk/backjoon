package 약수배수와소수2;

import java.util.Scanner;

public class ex13909 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int result = (int) Math.sqrt(n);

		System.out.println(result);

		sc.close();
	}
}
