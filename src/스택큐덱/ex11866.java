package 스택큐덱;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		Queue<Integer> queue = new LinkedList<>();
		StringBuilder result = new StringBuilder();
		result.append("<");

		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		while (!queue.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				queue.offer(queue.poll());
			}
			result.append(queue.poll());
			if (!queue.isEmpty()) {
				result.append(", ");
			}
		}

		result.append(">");
		System.out.println(result);
	}
}
