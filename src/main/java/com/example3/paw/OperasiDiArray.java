package com.example3.paw;

import java.util.Arrays;

public class OperasiDiArray {
     public static void main(String[] args) {
        int[] numbers = { 5, 10, 3, 7, 2, 15 };

        // Operasi mencari nilai maksimum dan minimum
        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum value: " + max); // Output: Maximum value: 15
        System.out.println("Minimum value: " + min); // Output: Minimum value: 2

        // Operasi menjumlahkan elemen-elemen array
        int sum = calculateSum(numbers);
        System.out.println("Sum of elements: " + sum); // Output: Sum of elements: 42

        // Operasi mencari rata-rata elemen-elemen array
        double average = calculateAverage(numbers);
        System.out.println("Average of elements: " + average); // Output: Average of elements: 7.0

        // Operasi mencari indeks suatu nilai dalam array
        int targetValue = 7;
        int index = findIndex(numbers, targetValue);
        System.out.println("Index of " + targetValue + " is " + index); // Output: Index of 7 is 3

        // Operasi mengurutkan array
        sortArray(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers)); // Output: Sorted array: [2, 3, 5, 7, 10, 15]
    }

    // Fungsi untuk mencari nilai maksimum dalam array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Fungsi untuk mencari nilai minimum dalam array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Fungsi untuk menjumlahkan elemen-elemen dalam array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Fungsi untuk mencari rata-rata elemen-elemen dalam array
    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }

    // Fungsi untuk mencari indeks suatu nilai dalam array
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Jika nilai tidak ditemukan, kembalikan -1.
    }

    // Fungsi untuk mengurutkan array menggunakan metode bubble sort
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}