package com.company;

public class CompareHelper {

    static int equal(int n1 , int n2){
        if (n1 > n2){
            return 1;
        } else if (n1 == n2)
            return 0;
        else {
            return -1;
        }
    }
}
