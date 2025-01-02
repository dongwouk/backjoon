package 기하직사각형과삼각형;

import java.util.Arrays;
import java.util.Scanner;

public class ex14215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] list = { sc.nextInt(), sc.nextInt(), sc.nextInt() };

		Arrays.sort(list);

		if (list[2] >= list[1] + list[0]) {
			list[2] = list[1] + list[0] - 1;
		}
		System.out.println(list[0] + list[1] + list[2]);
	}
}
