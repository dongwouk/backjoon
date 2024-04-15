package 구구단;

import java.io.*;
import java.util.StringTokenizer;

public class ex28 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		int i = Integer.parseInt(bf.readLine());

		for (int j = 0; j < i; j++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+(j+1)+":"+" "+a+" + "+b+" = "+(a+b)+"\n");
		}
		bw.close();

	}
}
