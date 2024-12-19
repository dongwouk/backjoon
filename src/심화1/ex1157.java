package 심화1;

import java.util.Scanner;

public class ex1157 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next().toUpperCase();

		int[] list = new int[26];
		int count = 0;
		int max = 0;
		char result = ' ';

		for (int i = 0; i < s.length(); i++) {
			list[s.charAt(i) - 'A']++;
		}


		for (int i = 0; i < list.length; i++) {
			if (list[i] > max) {
				max = list[i];
				count = 1;
				result = (char) (i + 65);
			} else if (list[i] == max) {
				count++;
			}
		}
		System.out.println(count > 1 ? '?' : result);

	}
}
