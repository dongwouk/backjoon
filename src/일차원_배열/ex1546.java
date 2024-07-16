package 일차원_배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex1546 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n1 = 0;
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		for (int i = 0; i < list.size(); i++) {
			n1 += (double) list.get(i) / (double) Collections.max(list) * 100;
		}
		System.out.println(n1 / n);
	}
}