package 문자열;

import java.util.Scanner;

public class ex10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char a = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.print(s.indexOf(a + i) + " ");
		}
	}
}
