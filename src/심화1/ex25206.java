package 심화1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex25206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0.0; // 학점 * 점수의 합
		double sum = 0.0; // 학점의 합

		// 학점과 등급을 저장할 Map
		Map<String, Double> map = new HashMap<>();

		// 학점 배열
		String[] grades = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" };
		double[] points = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0 };

		// 반복문으로 Map에 추가
		for (int i = 0; i < grades.length; i++) {
			map.put(grades[i], points[i]);
		}

		for (int i = 0; i < 20; i++) {
			String[] list = sc.nextLine().split(" ");

			double credit = Double.parseDouble(list[1]); // 학점 값 (list[1])
			String grade = list[2]; // 등급 (list[2])

			// "P" 등급은 계산에서 제외
			if (grade.equals("P")) {
				continue;
			}

			// map에서 해당 등급의 점수를 가져오기
			if (map.containsKey(grade)) {
				double point = map.get(grade); // 등급에 해당하는 점수
				sum += credit; // 유효한 학점의 합
				total += credit * point; // 학점 * 점수의 합
			}
		}
		System.out.printf("%.6f%n", total / sum);
	}
}
