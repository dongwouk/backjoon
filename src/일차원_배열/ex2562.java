package 일차원_배열;

import java.io.*;
import java.util.StringTokenizer;

public class ex2562 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int index = 0;
		int count = 0;
		
		for(int v : arr) {
			count++;
			if(v > max) {
				max = v;
				index = count;
			}
		}
		System.out.println(max);
		System.out.println(index);

	}
}