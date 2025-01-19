package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String input = br.readLine();
			if (input.equals("."))
				break;

			if (input.equals(".")) {
				sb.append("yes").append("\n");
				continue;
			}

			if (isBalanced(input)) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}

		System.out.print(sb);
	}

	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();

		for (char c : input.toCharArray()) {
			if (c == '(' || c == '[') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			} else if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
