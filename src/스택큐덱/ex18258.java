package 스택큐덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class ex18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Queue<Integer> queue = new LinkedList<>();
		int last = 0;

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String command = br.readLine();

			if (command.startsWith("push")) {
				last = Integer.parseInt(command.split(" ")[1]);
				queue.offer(last);
			} else if (command.equals("pop")) {
				bw.write((queue.isEmpty() ? -1 : queue.poll()) + "\n");
			} else if (command.equals("size")) {
				bw.write(queue.size() + "\n");
			} else if (command.equals("empty")) {
				bw.write((queue.isEmpty() ? 1 : 0) + "\n");
			} else if (command.equals("front")) {
				bw.write((queue.isEmpty() ? -1 : queue.peek()) + "\n");
			} else if (command.equals("back")) {
				bw.write((queue.isEmpty() ? -1 : last) + "\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
