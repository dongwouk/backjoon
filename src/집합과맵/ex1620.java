package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class ex1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);

		HashMap<String, Integer> name = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String pokemon = br.readLine();
			name.put(pokemon, i + 1);
			list.add(pokemon);
		}

		for (int i = 0; i < m; i++) {
			String query = br.readLine();
			if (Character.isDigit(query.charAt(0))) {
				int number = Integer.parseInt(query);
				sb.append(list.get(number - 1)).append("\n");
			} else {
				sb.append(name.get(query)).append("\n");
			}
		}

		System.out.print(sb.toString());

	}
}
