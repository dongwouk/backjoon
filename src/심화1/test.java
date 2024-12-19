package 심화1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int count = 0;
		char a = ' ';
		int i = 0;

		while (i <= s.length()-1 ) {
			a = s.charAt(i);
			if (a == 'c' & a == 's' & a == 'z' & i != s.length() - 1) {
				if (s.charAt(i + 1) == '=') {
					i++;
				} else if (a == 'c' & s.charAt(i + 1) == '-') {
					i++;
				}
			}else if(a == 'd' & i != s.length() - 1) {
				if (s.charAt(i + 1) == '-') {
					i++;
				} else if (s.charAt(i + 1) == 'z' & s.charAt(i + 2) == '=') {
					i=i+2;
				}
			}else if (a == 'l' & i != s.length() - 1) {
				if (s.charAt(i + 1) == 'j') {
					i++;
				}
			}else if (a == 'n' & i != s.length() - 1) {
				if (s.charAt(i + 1) == 'j') {
					i++;
				}
			}
			count++;
			i++;
		}

		System.out.println(count);

	}
}
