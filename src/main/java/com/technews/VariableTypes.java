package com.technews;

public class VariableTypes {
//    static allows access to the methods outside of individual objects
    public static void main(String[] args) {
        int firstNum = 4;
        double secondNum = 2.5;
        double sum = firstNum + secondNum;
        String str = "hello";
        String newSum = firstNum + str;
        System.out.println(newSum);
    }
}
