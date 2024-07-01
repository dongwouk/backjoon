package 반복문;

import java.util.*;

public class ex2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			int sum = a*i;
			System.out.println(a+" * "+i+" = "+sum);
		}

	}
}
