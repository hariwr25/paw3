package com.example3.paw;

public class DenganVariableArgument {
   public static void main(String[] args) {
        sayCongrats("Eko", 80, 90, 79, 48);
    }

    static void sayCongrats(String name, int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            
        }
    }
}