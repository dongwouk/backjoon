package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[][] point = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			point[i][0]=Integer.parseInt(st.nextToken());
			point[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(point, (a,b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]); // y 기준 정렬
            }
            return Integer.compare(a[1], b[1]); // x 기준 정렬
        });
		
		StringBuilder sb = new StringBuilder();
        for (int[] num : point) {
            sb.append(num[0]).append(" ").append(num[1]).append("\n");
        }
        System.out.print(sb.toString());
		
	}
}
