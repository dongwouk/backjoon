package 심화1;

import java.util.Scanner;

public class ex10988 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int start = 0;
		int end = s.length() - 1;
		int tf = 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				tf = 0;
				break;
			}
			start++;
			end--;
		}
		System.out.println(tf);
	}
}
