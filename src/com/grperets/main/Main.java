package com.grperets.main;

import com.grperets.factorial.Factorial;
import com.grperets.sum.Sum;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Return a number: ");
        int n = 0;
        if (scanner.hasNextInt()){
            n = scanner.nextInt();
        } else throw new NumberFormatException();
        if (scanner!=null){
            scanner.close();
        }
        BigInteger facNum = Factorial.factorial(n);
        System.out.printf("%d! = %d\n",n,facNum);
        System.out.printf("The sum of digits in the number %d : %d",facNum,Sum.sum(facNum));
    }
}
