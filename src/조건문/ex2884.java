package 조건문;

import java.util.*;

public class ex2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (b>44) {
			System.out.println((a)+" "+(b-45));
		}else if (a==0){
			System.out.println((a+23)+" "+(b+15));
		}else {
			System.out.println((a-1)+" "+(b+15));
		}
	}
}
