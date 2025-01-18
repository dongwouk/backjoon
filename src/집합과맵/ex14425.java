package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		ArrayList<String> arr = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			arr.add(br.readLine());
		}
		for (int i = 0; i < m; i++) {
			if (arr.contains(br.readLine())) {
				count++;
			}
		}
		System.out.println(count);

	}
}
