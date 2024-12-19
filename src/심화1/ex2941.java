package 심화1;

import java.util.Scanner;

public class ex2941 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int count = 0;
		char a = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1) {
				if ((s.charAt(i) == 'c' && (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-'))) {
					i++;
				} else if (i < s.length() - 2 && s.charAt(i) == 'd' && s.charAt(i + 1) == 'z'
						&& s.charAt(i + 2) == '=') {
					i += 2;
				} else if (s.charAt(i) == 'd' && s.charAt(i + 1) == '-') {
					i++;
				} else if (s.charAt(i) == 'l' && s.charAt(i + 1) == 'j') {
					i++;
				} else if (s.charAt(i) == 'n' && s.charAt(i + 1) == 'j') {
					i++;
				} else if (s.charAt(i) == 's' && s.charAt(i + 1) == '=') {
					i++;
				} else if (s.charAt(i) == 'z' && s.charAt(i + 1) == '=') {
					i++;
				}
			}
			count++;
		}

		System.out.println(count);

	}
}
