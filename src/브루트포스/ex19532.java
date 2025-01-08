package 브루트포스;

import java.util.Scanner;

public class ex19532 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double d = sc.nextDouble();
	double e = sc.nextDouble();
	double f = sc.nextDouble();
	
	for (int i = -999; i < 1000; i++) {
		for (int j = -999; j < 1000; j++) {
			if (a*i+b*j==c && d*i+e*j==f) {
				System.out.println(i+" "+j);
			}
		}
		
	}
}
}
