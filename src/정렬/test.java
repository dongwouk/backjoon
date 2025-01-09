package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 정렬
		Arrays.sort(arr);

		// 출력
		StringBuilder sb = new StringBuilder();
		for (int num : arr) {
			sb.append(num).append("\n");
		}

		System.out.print(sb);
	}
}
