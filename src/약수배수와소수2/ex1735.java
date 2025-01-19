package 약수배수와소수2;

import java.util.Scanner;

public class ex1735 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int x = sc.nextInt();
		int k = sc.nextInt();
		int y = sc.nextInt();
		int bot = (x * y) / get(x, y);
		int top = bot / x * i + bot / y * k;

		int gcd = get(top, bot);
		top /= gcd;
		bot /= gcd;

		System.out.println(top + " " + bot);

	}

	public static int get(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
