package 문자열;

import java.util.Scanner;

public class ex2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int max = 0;
		for (int i = 0; i < 2; i++) {
			n=sc.nextInt();
			int result = 0;
			while (n != 0) {
				result = result * 10 + n % 10;
				n /= 10;
			}
			
			max = (max>result) ? max : result;
		}
		System.out.println(max);
	}
}
