package 구구단;

import java.util.*;

public class ex8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i < a+1; i++) {
			sum += i;
		}
		System.out.println(sum);

	}
}
