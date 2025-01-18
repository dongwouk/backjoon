package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ex1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 첫 번째 줄 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// 듣도 못한 사람을 저장할 HashSet
		HashSet<String> unheard = new HashSet<>();
		for (int i = 0; i < n; i++) {
			unheard.add(br.readLine());
		}

		// 결과 리스트
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			if (unheard.contains(name)) { // 듣도 못한 사람에 포함된 경우
				result.add(name);
			}
		}

		// 결과 리스트를 사전순으로 정렬
		Collections.sort(result);

		// 출력
		System.out.println(result.size());
		for (String name : result) {
			System.out.println(name);
		}
	}
}
