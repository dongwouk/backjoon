package 조합론;

import java.util.Scanner;

public class ex11050 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(two(1,n)/(two(1, n-k)*two(1,k)));

	}

	public static int two(int a, int b) {
		int sum = 1;
		for (int i = a; i <= b; i++) {
			sum *= i;
		}
		return sum;
	}
}
