package 일반수학1;

import java.util.Scanner;

public class ex2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();

		int index = 0;
		int result = 0;

		int days = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0) {
            days++; 
        }
		System.out.println(days);

	}
}
