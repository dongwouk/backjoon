package ex30_39;

import java.io.*;
import java.util.StringTokenizer;

public class ex31 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(bf.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) {
				break;
			}
			sb.append((a+b)).append('\n');
		}
		System.out.println(sb);
		

	}
}