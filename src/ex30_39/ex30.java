package ex30_39;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex30 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

