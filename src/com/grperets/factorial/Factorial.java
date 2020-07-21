package com.grperets.factorial;

import java.math.BigInteger;

public class Factorial {
    /**
     *
     * @param n
     * @return
     */
    public static BigInteger factorial(int n){
        if (n==0) return BigInteger.valueOf(1);
        return factorial(n-1).multiply(BigInteger.valueOf(n));
    }
}
