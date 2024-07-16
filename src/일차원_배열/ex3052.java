package 일차원_배열;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(sc.nextInt() % 42);
		}
		System.out.println(set.size());
	}
}