package ex30_39;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex36 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n+1];
		for (int o = 1; o <= m; o++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			for (int x = i; x <= j; x++) {
				arr[x] = k;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb);
	}
}