package 스택큐덱;

import java.util.*;

public class ex2346 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<int[]> balloons = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			balloons.add(new int[] { i + 1, sc.nextInt() }); // 풍선 번호와 이동값 저장
		}

		StringBuilder result = new StringBuilder();
		int index = 0; // 현재 터뜨릴 풍선의 인덱스

		while (!balloons.isEmpty()) {
			int[] current = balloons.remove(index);
			result.append(current[0]).append(" ");

			if (balloons.isEmpty())
				break;

			int move = current[1];
			if (move > 0) {
				index = (index + (move - 1)) % balloons.size();
			} else {
				index = (index + move) % balloons.size();
				if (index < 0)
					index += balloons.size();
			}
		}

		System.out.println(result.toString().trim());
	}
}
