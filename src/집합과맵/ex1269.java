package 집합과맵;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex1269 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();

		for (int i = 0; i < n; i++) {
			setA.add(scanner.nextInt());
		}

		for (int i = 0; i < m; i++) {
			setB.add(scanner.nextInt());
		}

		Set<Integer> symmetricDiff = new HashSet<>(setA);
		symmetricDiff.addAll(setB);
		Set<Integer> intersection = new HashSet<>(setA);
		intersection.retainAll(setB);
		symmetricDiff.removeAll(intersection);

		System.out.println(symmetricDiff.size());

		scanner.close();
	}
}
