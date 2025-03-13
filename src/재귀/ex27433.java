package 재귀;

import java.util.Scanner;

public class ex27433 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	long sum=1;
	for (int i = 1; i <= n; i++) {
		sum*=i;
	}
	System.out.println(sum);
}
}
