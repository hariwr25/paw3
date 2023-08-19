package com.example3.paw;

public class TipeDataBukanPrimitif {
     public static void main(String[] args) {
        // Tipe data bukan primitif String
        String name = "Hari Wahyu Ramadhan";

        // Tipe data bukan primitif Integer
        Integer age = Integer.valueOf(22); // atau bisa ditulis sebagai Integer age = 30;

        // Tipe data bukan primitif Double
        Double salary = 2021.02; // atau bisa ditulis sebagai Double salary = Double.valueOf(2500.50);

        // Tipe data bukan primitif Character
        Character grade = 'A'; // atau bisa ditulis sebagai Character grade = Character.valueOf('A');

        // Tipe data bukan primitif Boolean
        Boolean isActive = true; // atau bisa ditulis sebagai Boolean isActive = Boolean.valueOf(true);

        // Mengakses nilai dari tipe data bukan primitif
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Active: " + isActive);

        // Menggunakan metode atau properti dari tipe data bukan primitif
        int ageInt = age.intValue(); // Mengambil nilai int dari Integer
        double salaryDouble = salary.doubleValue(); // Mengambil nilai double dari Double
        char gradeChar = grade.charValue(); // Mengambil nilai char dari Character
        boolean isActiveBool = isActive.booleanValue(); // Mengambil nilai boolean dari Boolean

        System.out.println("Age (as int): " + ageInt);
        System.out.println("Salary (as double): " + salaryDouble);
        System.out.println("Grade (as char): " + gradeChar);
        System.out.println("Is Active (as boolean): " + isActiveBool);
    }
}