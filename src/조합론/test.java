package 조합론;

import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        System.out.println(fact(29).divide(fact(13).multiply(fact(16))));
    }

    public static BigInteger fact(int a) {
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= a; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }
}
