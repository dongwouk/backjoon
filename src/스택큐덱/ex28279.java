package 스택큐덱;

import java.io.*;
import java.util.*;

public class ex28279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());

			switch (command) {
			case 1: // 앞에 추가
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case 2: // 뒤에 추가
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case 3: // 앞에서 제거 후 출력
				sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
				break;
			case 4: // 뒤에서 제거 후 출력
				sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
				break;
			case 5: // 크기 출력
				sb.append(deque.size()).append("\n");
				break;
			case 6: // 비어있는지 확인
				sb.append(deque.isEmpty() ? 1 : 0).append("\n");
				break;
			case 7: // 앞의 값 출력
				sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
				break;
			case 8: // 뒤의 값 출력
				sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
				break;
			}
		}

		System.out.print(sb);
	}
}
