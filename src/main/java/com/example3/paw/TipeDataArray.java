package com.example3.paw;

public class TipeDataArray {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        int[] numbers = { 10, 20, 30, 40, 50 };
        String[] fruits = { "Apple", "Banana", "Orange", "Mango" };
        double[] prices = new double[5]; // Array kosong dengan panjang 5

        // Mengakses elemen array
        int firstNumber = numbers[0]; // Mendapatkan elemen pertama dari array numbers
        String secondFruit = fruits[1]; // Mendapatkan elemen kedua dari array fruits

        // Mengubah nilai elemen array
        numbers[3] = 60; // Mengubah elemen keempat dari array numbers menjadi 60

        // Menghitung panjang array
        int lengthNumbers = numbers.length; // Panjang array numbers (hasilnya 5)

        // Mengisi array dengan nilai
        prices[0] = 2.5;
        prices[1] = 1.8;
        prices[2] = 3.0;
        prices[3] = 2.2;
        prices[4] = 4.5;

        // Menampilkan isi array menggunakan loop
        System.out.println("Numbers:");
        for (int i = 0; i < lengthNumbers; i++) {
            System.out.print(numbers[i] + " "); // Output: 10 20 30 60 50
        }

        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.print(fruit + " "); // Output: Apple Banana Orange Mango
        }

        System.out.println("\nPrices:");
        for (double price : prices) {
            System.out.print(price + " "); // Output: 2.5 1.8 3.0 2.2 4.5
        }

        // Array multidimensi
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Mengakses elemen array multidimensi
        int value = matrix[1][2]; // Mendapatkan elemen kedua dari baris ketiga (nilai: 6)
    }
}