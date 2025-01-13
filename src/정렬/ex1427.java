package 정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] arr = sc.nextLine().toCharArray();

		Character[] charArr = new Character[arr.length];
		for (int i = 0; i < arr.length; i++) {
			charArr[i] = arr[i];
		}
		
		Arrays.sort(charArr, Collections.reverseOrder());
		
		for (char num : charArr) {
			System.out.print(num);
		}
	}
}
