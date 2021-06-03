package com.company;


import java.util.Scanner;

public class InputHelper {

    private String prompt = "Enter a Number:";
    private Scanner sc = new Scanner(System.in);

//CONSTRUCTOR THAT TAKES STRING PARAMETER
    public InputHelper(String prompt) {
        this.prompt = prompt;
    }
//CONSTRUCTOR THAT TAKES NO PARAMETER
    public InputHelper() {
        this.prompt = "Enter a Number";
    }


    public int  getInteger(){
        System.out.println(prompt);
        return sc.nextInt();
    }

    public int  getInteger(String p){
        System.out.println(p);
        return sc.nextInt();
    }
}
