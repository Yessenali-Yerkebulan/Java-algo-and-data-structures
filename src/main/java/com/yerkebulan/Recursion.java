package com.yerkebulan;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    private static int factorial(int num){
        if(num<1) return 1;
        return num * factorial(num-1);
    }

    private static int power(int i, int j){
        if(j<1) return 1;
        return i*power(i, j-1);
    }
}
