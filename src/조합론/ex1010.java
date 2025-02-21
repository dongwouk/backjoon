package 조합론;

import java.math.BigInteger;
import java.util.Scanner;

public class ex1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            BigInteger result = factorial(m).divide(factorial(n).multiply(factorial(m - n)));
            
            System.out.println(result);
        }
        sc.close();
    }

    public static BigInteger factorial(int a) {
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= a; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }
}
