package 기하직사각형과삼각형;

import java.util.Scanner;

public class ex1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int min = Integer.MAX_VALUE;

		System.out.println(Math.min(Math.min(x, y), Math.min(w - x, h - y)));
	}
}
