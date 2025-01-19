package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex28278 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] stack = new int[N];
		int top = -1;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());

			switch (command) {
			case 1:
				int X = Integer.parseInt(st.nextToken());
				stack[++top] = X;
				break;

			case 2:
				if (top >= 0) {
					sb.append(stack[top--]).append("\n");
				} else {
					sb.append("-1\n");
				}
				break;

			case 3:
				sb.append(top + 1).append("\n");
				break;

			case 4:
				if (top == -1) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				break;

			case 5:
				if (top >= 0) {
					sb.append(stack[top]).append("\n");
				} else {
					sb.append("-1\n");
				}
				break;
			}
		}

		System.out.print(sb);
	}
}
