package com.example3.paw;

public class TanpaVariableArgument {
    static void sayCongrats(String name, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    public static void main(String[] args) {
        int[] scoresJohn = { 80, 85, 90 };
        int[] scoresJane = { 70, 65, 80 };

        sayCongrats("Hari", scoresJohn);
        sayCongrats("Wahyu", scoresJane);
    }
}