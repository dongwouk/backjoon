package 배수와약수;

import java.util.Scanner;

public class ex5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			 if (!sc.hasNextInt()) break;
			 
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x == 0 && y == 0) {
				break;
			}
			
			if (y % x == 0) {
				System.out.println("factor");
			} else if (x % y == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}

		}
	}
}
