package com.example3.paw;

public class FloatingPointNumber {
    public static void main(String[] args) {
        // Tipe data float
        float iniFloat = 10.12F; // Harus ditandai dengan huruf 'F' atau 'f' di belakang angka

        // Tipe data double
        double iniDouble = 12.2424;

        // Cetak nilai variabel
        System.out.println("Float: " + iniFloat);
        System.out.println("Double: " + iniDouble);

        // Operasi aritmatika dengan tipe data floating-point
        float a = 5.5F;
        float b = 2.2F;
        float sum = a + b;
        float difference = a - b;
        float product = a * b;
        float quotient = a / b;

        System.out.println("Sum: " + sum); // Output: 7.7
        System.out.println("Difference: " + difference); // Output: 3.3
        System.out.println("Product: " + product); // Output: 12.1
        System.out.println("Quotient: " + quotient); // Output: 2.5
    }
}