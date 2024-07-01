package 반복문;

import java.util.*;

public class ex25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum=0;
		for (int i = 0; i < b; i++) {
			sum += sc.nextInt() * sc.nextInt();
			
		}
		if (a==sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
