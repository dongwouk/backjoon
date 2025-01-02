package 기하직사각형과삼각형;

import java.util.Scanner;

public class ex9063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int minx = Integer.MAX_VALUE;
		int miny = Integer.MAX_VALUE;
		int maxx = Integer.MIN_VALUE;
		int maxy = Integer.MIN_VALUE;

		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();

			if (x[i] < minx) {
				minx = x[i];
			}
			if (x[i] > maxx) {
				maxx = x[i];
			}

			if (y[i] < miny) {
				miny = y[i];
			}
			if (y[i] > maxy) {
				maxy = y[i];
			}
		}
		System.out.println((maxx-minx)*(maxy-miny));

	}
}
