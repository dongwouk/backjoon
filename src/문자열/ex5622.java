package 문자열;

import java.util.Scanner;

public class ex5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch < 68) {
				sum += 3;
			} else if (ch < 71) {
				sum += 4;
			} else if (ch < 74) {
				sum += 5;
			} else if (ch < 77) {
				sum += 6;
			} else if (ch < 80) {
				sum += 7;
			} else if (ch < 84) {
				sum += 8;
			} else if (ch < 87) {
				sum += 9;
			} else {
				sum += 10;
			}
		}
		System.out.println(sum);
	}
}
