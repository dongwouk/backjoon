package 심화2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex25192 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = 0;
		Set<String> list = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (s.equals("ENTER")) {
				sum += list.size();
				list.clear();
				continue;
			}
			list.add(s);
		}
		
		System.out.println(sum+list.size());
	}
}
