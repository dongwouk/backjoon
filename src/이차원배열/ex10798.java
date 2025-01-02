package 이차원배열;

import java.util.Scanner;

public class ex10798 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[][] c = new char[5][15];
		for (int i = 0; i < c.length; i++) {
			String s = sc.next();
			for (int j = 0; j < Math.min(c[i].length, s.length()); j++) {
				if (j < s.length()) {
					c[i][j] = s.charAt(j);
				} else {
					break;
				}
			}
		}
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if (c[i][j] != '\0') { 
					System.out.print(c[i][j]);
				}
			}
		}
	}
}
