package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class ex10989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * 10 5 2 3 1 4 2 3 5 1 7
		 */
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append("\n");
        }
        System.out.print(sb.toString());
	}
}
