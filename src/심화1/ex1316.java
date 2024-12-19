package 심화1;

import java.util.Scanner;

public class ex1316 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (isGroup(s)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean isGroup(String s) {
		boolean[] seen = new boolean[26];
		char prevChar = ' ';

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			int index = current - 'a';

			if (current != prevChar) {
				if (seen[index]) {
					return false;
				}
				seen[index] = true;
			}
			prevChar = current;
		}
		return true;
	}
}
