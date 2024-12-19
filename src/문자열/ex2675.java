package 문자열;

import java.util.Scanner;

public class ex2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String sum = "";
			int r = sc.nextInt();
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					sum += Character.toString(s.charAt(j));
				}
			}
			System.out.println(sum);
		}
	}
}
