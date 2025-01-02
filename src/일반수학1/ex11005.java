package 일반수학1;

import java.util.Scanner;

public class ex11005 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt(); 
        int base = sc.nextInt();   

        StringBuilder result = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % base;

            if (remainder < 10) {
                result.append(remainder); 
            } else {
                result.append((char) ('A' + (remainder - 10)));
            }

            decimal /= base; 
        }

        System.out.println(result.reverse().toString());
    }
}
