package 일차원_배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5597 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>(30);
		for (int i = 0; i < 30; i++) {
			list.add(i+1);
		}
		
		
		for (int i = 0; i < 28; i++) {
			list.remove(Integer.valueOf(sc.nextInt()));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}