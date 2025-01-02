package 기하직사각형과삼각형;

import java.util.Scanner;

public class ex5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			System.out.println(sam(a, b, c));
		}

	}

	public static String sam(int a, int b, int c) {
		int max = Math.max(a, Math.max(b, c));
		int sum = a + b + c;

		if (sum - max <= max) {
			return "Invalid"; 
		}

		if (a == b && b == c) {
			return "Equilateral";
		}

		if (a == b || b == c || a == c) {
			return "Isosceles";
		}

		return "Scalene";
	}
}
