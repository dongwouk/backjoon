package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 회원 정보를 저장할 배열
		String[][] members = new String[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			members[i][0] = st.nextToken(); // 나이
			members[i][1] = st.nextToken(); // 이름
		}

		// 정렬: 나이를 기준으로 오름차순
		Arrays.sort(members, (a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

		// 결과 출력
		StringBuilder sb = new StringBuilder();
		for (String[] member : members) {
			sb.append(member[0]).append(" ").append(member[1]).append("\n");
		}
		System.out.print(sb.toString());
	}
}
