package 집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class ex10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Set<Integer> num = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		while (st.hasMoreElements()) {
			num.add(Integer.parseInt(st.nextToken()));
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		while (st.hasMoreElements()) {
			int q = Integer.parseInt(st.nextToken());
			bw.write(num.contains(q) ? "1 " : "0 ");
		}
		bw.flush();

	}
}
