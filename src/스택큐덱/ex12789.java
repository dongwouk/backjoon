package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex12789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] queue = new int[N];

		for (int i = 0; i < N; i++) {
			queue[i] = Integer.parseInt(st.nextToken());
		}

		Stack<Integer> stack = new Stack<>();
		int next = 1;

		for (int i = 0; i < N; i++) {
			while (!stack.isEmpty() && stack.peek() == next) {
				stack.pop();
				next++;
			}

			if (queue[i] == next) {
				next++;
			} else {
				stack.push(queue[i]);
			}
		}

		while (!stack.isEmpty() && stack.peek() == next) {
			stack.pop();
			next++;
		}

		if (next == N + 1) {
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}
	}
}
