package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ex7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		HashSet<String> arr = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			if (s[1].equals("enter")) {
				arr.add(s[0]);
			} else {
				arr.remove(s[0]);
			}
		}
		ArrayList<String> list = new ArrayList<>(arr);
		Collections.sort(list, Collections.reverseOrder());

		for (String s : list) {
			System.out.println(s);
		}
	}
}
