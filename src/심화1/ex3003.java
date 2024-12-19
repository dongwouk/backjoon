package 심화1;

import java.util.Scanner;

public class ex3003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] list = { 1, 1, 2, 2, 2, 8 };
		for (int i = 0; i < list.length; i++) {
			System.out.print(-(sc.nextInt() - list[i])+" ");
		}
	}
}
