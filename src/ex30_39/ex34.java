package ex30_39;

import java.io.*;
import java.util.StringTokenizer;

public class ex34 {
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