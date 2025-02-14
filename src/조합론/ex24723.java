package 조합론;

import java.util.Scanner;

public class ex24723 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 시간 t 입력
		int result = (int) Math.pow(2, t); // 2^t 계산
		System.out.println(result);
	}

}
