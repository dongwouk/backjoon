package 재귀;

import java.util.Scanner;

public class ex25501 {
	static int count; // 재귀 호출 횟수를 저장할 변수

	public static int recursion(String s, int l, int r) {
		count++; // 재귀 호출할 때마다 증가
		if (l >= r)
			return 1; // 가운데까지 도달하면 팰린드롬
		else if (s.charAt(l) != s.charAt(r))
			return 0; // 앞뒤가 다르면 팰린드롬 아님
		else
			return recursion(s, l + 1, r - 1); // 다음 문자 비교
	}

	public static int isPalindrome(String s) {
		count = 0; // 호출마다 초기화
		return recursion(s, 0, s.length() - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스 개수
		sc.nextLine(); // 개행 문자 제거

		for (int i = 0; i < T; i++) {
			String s = sc.nextLine();
			int result = isPalindrome(s);
			System.out.println(result + " " + count);
		}

		sc.close();
	}
}
