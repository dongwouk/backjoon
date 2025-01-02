package 일반수학1;

import java.util.Scanner;

public class ex2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b = sc.next();
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < b.length(); i++) {
            int num;
            char ch = b.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = ch - '0'; 
            } else {
                num = ch - 'A' + 10; 
            }

            sum += num * (int) Math.pow(n, b.length() - 1 - i);
        }

        System.out.println(sum);
    }
}