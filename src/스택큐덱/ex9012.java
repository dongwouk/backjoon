package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			int count = 0;
			boolean isValid = true;

			for (int k = 0; k < s.length(); k++) {
				if (s.charAt(k) == '(') {
					count++;
				} else {
					if (count == 0) {
						isValid = false;
						break;
					}
					count--;
				}
			}

			if (!isValid || count != 0) {
				sb.append("NO").append("\n");
			} else {
				sb.append("YES").append("\n");
			}
		}

		System.out.println(sb);
	}
}
