package 구구단;

import java.io.*;
import java.util.StringTokenizer;

public class ex26 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		int i = Integer.parseInt(bf.readLine());

		for (int j = 0; j < i; j++) {
			st = new StringTokenizer(bf.readLine());
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		bw.close();

	}
}
