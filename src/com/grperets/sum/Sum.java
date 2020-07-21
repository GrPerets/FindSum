package com.grperets.sum;

import java.math.BigInteger;

public class Sum {
    /**
     *
     * @param bigInt
     * @return
     */
    public static BigInteger sum(BigInteger bigInt){
        BigInteger [] plus = bigInt.divideAndRemainder(BigInteger.valueOf(10));
        if (plus[0].compareTo(BigInteger.valueOf(0))==0) return plus[1];
        return sum(plus[0]).add(plus[1]);
    }
}
