package ex30_39;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex35 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int i = 0;
		int[] arr = new int[n];
		
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1]);

	}
}