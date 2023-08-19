package com.example3.paw;

public class FactorialRecursive {
     public static void main(String[] args) {
        
    }
    
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
    
}