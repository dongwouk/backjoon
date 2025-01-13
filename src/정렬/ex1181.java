package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Set<String> list = new HashSet<>();
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}

		List<String> word = new ArrayList<>(list);

		Collections.sort(word, (a, b) -> {
			if (a.length() == b.length()) {
				return a.compareTo(b);
			}
			return Integer.compare(a.length(), b.length());
		});

		StringBuilder sb = new StringBuilder();
		for (String a : word) {
			sb.append(a).append("\n");
		}
		System.out.print(sb.toString());
	}
}
