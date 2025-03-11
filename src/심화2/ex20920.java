package 심화2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class ex20920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Map<String, Integer> wordCount = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			if (word.length() < m)
				continue;

			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}

		List<String> words = new ArrayList<>(wordCount.keySet());

		words.sort((o1, o2) -> {
			if (!wordCount.get(o1).equals(wordCount.get(o2))) {
				return wordCount.get(o2) - wordCount.get(o1);
			}
			if (o1.length() != o2.length()) {
				return o2.length() - o1.length();
			}
			return o1.compareTo(o2);
		});

		for (String word : words) {
			bw.write(word + "\n");
		}

		bw.flush();
		br.close();
		bw.close();
	}

}
