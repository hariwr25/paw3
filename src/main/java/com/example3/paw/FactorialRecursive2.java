package com.example3.paw;

public class FactorialRecursive2 {
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    public static void main(String[] args) {
        int number = 4, result;
        //result = factorial(number);
        //System.out.println(number + " factorial = " + result);

        int datainput = 5, hasildata;
        hasildata = factorialRecursive(datainput);
        System.out.println(datainput + " factorialRec. nya = " + hasildata);
    }
    
}