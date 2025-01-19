package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] stack = new int[n];
		int index = 0;

		for (int i = 0; i < stack.length; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x != 0) {
				stack[index++] = x;
			} else {
				stack[--index] = 0;
			}
		}

		int sum = 0;
		for (int i : stack) {
			sum += i;
		}
		System.out.println(sum);

	}
}
