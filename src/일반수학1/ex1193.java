package 일반수학1;

import java.util.Scanner;

public class ex1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = 1;
        while (n > (k * (k + 1)) / 2) {
            k++;
        }

        int startK = (k - 1) * k / 2 + 1;

        int index = n - startK;

        int x, y;
        if (k % 2 == 1) {
        	x = k - index;
        	y = 1 + index;
        } else {
            x = 1 + index;
            y = k - index;
        }

        System.out.println(x + "/" + y);
	}
}
