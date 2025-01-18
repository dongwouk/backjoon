package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ex10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		HashMap<Integer, Integer> countMap = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		int m = Integer.parseInt(br.readLine());

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int query = Integer.parseInt(st1.nextToken());
			sb.append(countMap.getOrDefault(query, 0)).append(" ");
		}

		System.out.println(sb.toString());
	}
}
