package com.example3.paw;

public class KonsepTipeDataNumber {
        public static void main(String[] args) {
            // Tipe data integer
            byte iniByte = 100; // 8-bit signed (range: -128 to 127)
            short iniShort = 1000; // 16-bit signed (range: -32,768 to 32,767)
            int iniInt = 1000000; // 32-bit signed (range: -2^31 to 2^31 - 1)
            long iniLong = 1000000L; // 64-bit signed (range: -2^63 to 2^63 - 1)
    
            // Tipe data floating-point
            float iniFloat = 10.12F; // 32-bit IEEE 754 floating-point
            double iniDouble = 12.2424; // 64-bit IEEE 754 floating-point
    
            // Tipe data bilangan desimal
            int decimalInt = 25; // Bilangan desimal biasa
            int hexInt = 0xABCDEF; // Bilangan heksadesimal (prefix 0x)
            int binInt = 0b1010101010101; // Bilangan biner (prefix 0b)
    
            // Tipe data karakter
            char k = 'K';
            char e = 'E';
            char o = 'O';
    
            // Tipe data boolean
            boolean benar = true;
            boolean salah = false;
    
            // Tipe data string
            String firstname = "Hari";
            String lastname = "Ramadhan";
            String fullname = firstname + " " + lastname;
    
            // Cetak nilai variabel
            System.out.println("Byte: " + iniByte);
            System.out.println("Short: " + iniShort);
            System.out.println("Int: " + iniInt);
            System.out.println("Long: " + iniLong);
            System.out.println("Float: " + iniFloat);
            System.out.println("Double: " + iniDouble);
            System.out.println("Decimal Int: " + decimalInt);
            System.out.println("Hex Int: " + hexInt);
            System.out.println("Binary Int: " + binInt);
            System.out.println("Character: " + k + e + o);
            System.out.println("Boolean: " + benar + ", " + salah);
            System.out.println("String: " + fullname);
        }
    }