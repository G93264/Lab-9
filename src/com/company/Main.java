package com.company;

import com.company.utilities.MathHelper;

public class Main {

    public static void main(String[] args) {
	// write your code here
        InputHelper ih = new InputHelper("Enter an Integer: ");

        int num1 = ih.getInteger();
        int num2 = ih.getInteger();
        int isequal = CompareHelper.equal(num1, num2);

        switch(isequal){
            case 1:
                System.out.println("First Number larger than second number");
                break;
            case 0:
                System.out.println("First Number is equal to second number");
                break;
            case -1:
                System.out.println("First Number is less than second number.");
                break;
        }


        try{
            System.out.println(MathHelper.div(num1, num2));
        }
        catch (ArithmeticException e) {
            System.err.println(e);
        }

//        System.out.println(MathHelper.div(num1, num2));
        System.out.println(MathHelper.sum(num1, num2));
        System.out.println(MathHelper.diff(num1, num2));
        System.out.println(MathHelper.product(num1, num2));


    }
}
