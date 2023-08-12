package com.example3.paw;

import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();

        String grade = hitungGrade(nilai);

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String hitungGrade(double nilai) {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 77.5 && nilai < 80) {
            return "A-";
        } else if (nilai >= 75 && nilai < 77.5) {
            return "A/B";
        } else if (nilai >= 72.5 && nilai < 75) {
            return "B+";
        } else if (nilai >= 70 && nilai < 72.5) {
            return "B";
        } else if (nilai >= 67.5 && nilai < 70) {
            return "B-";
        } else if (nilai >= 65 && nilai < 67.5) {
            return "B/C";
        } else if (nilai >= 62.5 && nilai < 65) {
            return "C+";
        } else if (nilai >= 60 && nilai < 62.5) {
            return "C";
        } else if (nilai >= 55 && nilai < 60) {
            return "C-";
        } else if (nilai >= 50 && nilai < 55) {
            return "C/D";
        } else if (nilai >= 45 && nilai < 50) {
            return "D+";
        } else if (nilai >= 40 && nilai < 45) {
            return "D";
        } else {
            return "E";
        }
    }
}