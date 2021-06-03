package com.company.utilities;

public class MathHelper {
    public static int  sum (int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static int  diff (int num1, int num2){
        int diff = num1 - num2;
        return diff;
    }

    public static int  product (int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    public static double  div (int num1, int num2) throws ArithmeticException{
       return num1 / num2;
    }
}
