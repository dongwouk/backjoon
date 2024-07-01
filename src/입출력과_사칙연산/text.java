package 입출력과_사칙연산;

import java.util.Scanner;
import java.util.Stack;

public class text {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		System.out.println(s);
		s.add(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		
	}
}
