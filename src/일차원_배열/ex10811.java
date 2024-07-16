package 일차원_배열;

import java.util.Arrays;
import java.util.Scanner;

public class ex10811 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s, e;
		int tmp;
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = i + 1;
		}
		for (int i = 0; i < m; i++) {
			s = sc.nextInt() - 1;
			e = sc.nextInt() - 1;
			int[] copy = Arrays.copyOfRange(list, s, e + 1);
			for (int j = 0; j < copy.length; j++) {
				list[s + j] = copy[copy.length - (j + 1)];
			}
		}
		for (int k = 0; k < list.length; k++) {
			System.out.print(list[k]+" ");
		}
	}
}