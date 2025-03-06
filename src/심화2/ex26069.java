package 심화2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex26069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		Set<String> infected = new HashSet<>();
		infected.add("ChongChong");

		for (int i = 0; i < n; i++) {
			String a = sc.next();
			String b = sc.next();

			if (infected.contains(a) || infected.contains(b)) {
				infected.add(a);
				infected.add(b);
			}
		}

		System.out.println(infected.size());
		sc.close();
	}

}
