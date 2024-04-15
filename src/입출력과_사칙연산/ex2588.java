package 입출력과_사칙연산;

import java.util.*;

public class ex2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String b = sc.next();
		System.out.println(a*Character.getNumericValue(b.charAt(2)));
		System.out.println(a*Character.getNumericValue(b.charAt(1)));
		System.out.println(a*Character.getNumericValue(b.charAt(0)));
		System.out.println(a*Integer.parseInt(b));
		System.out.println("test" + b.charAt(2));
	}

}
