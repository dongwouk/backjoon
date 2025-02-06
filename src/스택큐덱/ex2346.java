package 스택큐덱;

import java.io.*;
import java.util.*;

public class ex2346 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		Deque<int[]> deque = new LinkedList<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			deque.add(new int[] { i, Integer.parseInt(st.nextToken()) });
		}

		while (!deque.isEmpty()) {
			int[] balloon = deque.pollFirst();
			sb.append(balloon[0]).append(" ");

			int move = balloon[1];
			if (deque.isEmpty())
				break;

			if (move > 0) {
				for (int i = 0; i < move - 1; i++) {
					deque.addLast(deque.pollFirst());
				}
			} else {
				for (int i = 0; i < Math.abs(move); i++) {
					deque.addFirst(deque.pollLast());
				}
			}
		}

		System.out.println(sb.toString().trim());
	}
}
