package 시간복잡도;

import java.util.Scanner;

public class ex24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt(); // a1 입력
        int a0 = sc.nextInt(); // a0 입력
        int c = sc.nextInt();  // c 입력
        int n0 = sc.nextInt(); // n0 입력

        // c <= a1이면 조건을 만족할 수 없음
        if (c < a1) {
            System.out.println(0);
        } else {
            // c > a1인 경우 조건 확인
            long threshold = (long) Math.ceil((double) a0 / (c - a1)); // 최소 n 값 계산
            if (n0 >= threshold) {
                System.out.println(1); // 조건 만족
            } else {
                System.out.println(0); // 조건 불만족
            }
        }
    }
}

