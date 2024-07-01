package 일차원_배열;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex10818 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int v = Integer.parseInt(st.nextToken());
			if(v>max) {
				max = v;
			}
			if(v<min) {
				min = v;
			}
		}
		System.out.println(min + " " + max);
		
	}
}