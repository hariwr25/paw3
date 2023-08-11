package com.example3.paw;

public class Error_StackOveerflow {
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop-" + value);
            loop(value -1);
        }
    }
} 
