package 조건문;

import java.util.*;

public class ex2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum=b+c;
		int hour = sum/60;
		System.out.println(sum);
		System.out.println(hour);
		if(a+hour>23) {
			System.out.println((a+(hour)-24)+" "+(sum-(hour*60)));
		}else {
			System.out.println(a+(hour)+" "+(sum-(hour*60)));
		}
	}
}
