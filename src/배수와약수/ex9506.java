package 배수와약수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex9506 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            ArrayList<Integer> divisors = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    sum += i;

                    if (i != 1 && i != n / i) {
                        divisors.add(n / i);
                        sum += n / i;
                    }
                }
            }

            divisors.sort(Integer::compareTo);

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    if (i > 0) {
                        System.out.print(" + ");
                    }
                    System.out.print(divisors.get(i));
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
