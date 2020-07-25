package com.grperets.sum;

import java.math.BigInteger;

public class Sum {
    /**
     *This method finds the sum of the digits of a number
     * @param bigInt
     * @return Sum of the digits of a number
     */
    public static BigInteger sum(BigInteger bigInt){
        BigInteger [] plus = bigInt.divideAndRemainder(BigInteger.valueOf(10));
        if (plus[0].compareTo(BigInteger.valueOf(0))==0) return plus[1];
        return sum(plus[0]).add(plus[1]);
    }
}
