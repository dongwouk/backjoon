package 일차원_배열;

import java.io.*;
import java.util.*;

public class ex10871 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			int v = Integer.parseInt(st.nextToken());

			if (v < x)
				sb.append(v).append(" ");

		}
		System.out.println(sb);

	}
}