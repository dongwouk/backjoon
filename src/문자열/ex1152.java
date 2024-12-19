package 문자열;

import java.util.Scanner;

public class ex1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  		String s = sc.nextLine().trim();
  		System.out.println(s.length());
		int count = (s.length() == 0) ? 0 : 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
