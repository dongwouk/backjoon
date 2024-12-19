package 문자열;

import java.util.Scanner;

public class ex9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s ;
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			s=sc.next();
			System.out.print(s.charAt(0));
			System.out.print(s.charAt(s.length()-1)+"\n");
		}
	}
}
