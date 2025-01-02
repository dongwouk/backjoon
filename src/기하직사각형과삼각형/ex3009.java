package 기하직사각형과삼각형;

import java.util.Scanner;

public class ex3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];
		int[] b = new int[3];
		int resultx = 0;
		int resulty = 0;
		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[i] = x;
			b[i] = y;
		}
		for (int num : a) {
			resultx ^= num;
		}

		for (int num : b) {
			resulty ^= num;
		}

		System.out.println(resultx + " " + resulty);
	}

}
