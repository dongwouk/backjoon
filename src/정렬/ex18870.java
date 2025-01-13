package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ex18870 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int[] arr = new int[n];
	        int[] sortedArr = new int[n];

	        // 입력 배열 저장
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for (int i = 0; i < n; i++) {
	            arr[i] = Integer.parseInt(st.nextToken());
	            sortedArr[i] = arr[i];
	        }

	        // 정렬된 배열 생성 (중복 허용)
	        Arrays.sort(sortedArr);

	        // 압축 좌표를 저장할 Map 생성
	        Map<Integer, Integer> map = new HashMap<>();
	        int rank = 0;

	        // 중복 제거하면서 압축 좌표 부여
	        for (int value : sortedArr) {
	            if (!map.containsKey(value)) {
	                map.put(value, rank++);
	            }
	        }

	        // 결과 작성
	        StringBuilder sb = new StringBuilder();
	        for (int value : arr) {
	            sb.append(map.get(value)).append(" ");
	        }

	        // 결과 출력
	        System.out.println(sb.toString().trim());
	    }
}
