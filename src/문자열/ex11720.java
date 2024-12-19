package 문자열;

import java.util.Scanner;

public class ex11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		String s = sc.next();
		int sum = 0;
		char ch = '0';
		for (int i = 0; i < n; i++) {
			sum+=(s.charAt(i)-ch);
		}
		System.out.println(sum);
	}
}
