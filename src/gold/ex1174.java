package gold;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex1174 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // N번째 줄어드는 수

		// 줄어드는 수를 저장할 리스트
		ArrayList<Long> decreasingNumbers = new ArrayList<>();

		// 줄어드는 수 생성
		for (int bit = 1; bit < (1 << 10); bit++) { // 1부터 2^10-1까지
			long num = 0;
			ArrayList<Integer> digits = new ArrayList<>();
			for (int i = 0; i < 10; i++) {
				if ((bit & (1 << i)) != 0) {
					digits.add(i);
				}
			}
			// 자리수를 줄어드는 순서로 정렬
			Collections.sort(digits, Collections.reverseOrder());
			for (int digit : digits) {
				num = num * 10 + digit;
			}
			decreasingNumbers.add(num);
		}

		// 정렬
		Collections.sort(decreasingNumbers);

		// N번째 줄어드는 수 출력
		if (n > decreasingNumbers.size()) {
			System.out.println(-1);
		} else {
			System.out.println(decreasingNumbers.get(n - 1));
		}
	}
}
