package 일차원_배열;

import java.util.Scanner;

public class ex10813 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int tmp = 0;
		int first = 0;
		int end = 0;
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}

		for (int i = 0; i < m; i++) {
			first = sc.nextInt() - 1;
			end = sc.nextInt() - 1;

			tmp = list[first];
			list[first] = list[end];
			list[end] = tmp;
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}

	}
}