package com.example3.paw;

public class Variable {
     public static void main(String[] args) {
            // Deklarasi variabel
            int age;
            double salary;
            String name;
            boolean isEmployed;
    
            // Inisialisasi variabel
            age = 21;
            salary = 2021.02;
            name = "Hari Wahyu Ramadhan";
            isEmployed = true;
    
            // Mengakses dan menggunakan variabel
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Is Employed: " + isEmployed);
    
            // Mengubah nilai variabel
            age = 22;
            salary = 2800.75;
    
            System.out.println("Updated Age: " + age);
            System.out.println("Updated Salary: " + salary);
    
            // Deklarasi dan inisialisasi variabel dalam satu baris
            int x = 10, y = 12, sum;
            sum = x + y;
    
            System.out.println("Sum of x and y: " + sum);
        }
    }
    