package com.example3.paw;

public class MethodOverloading2 {
    static String sayHello(String firstName){
            //System.out.printIn("Hello " + fisrtName);
            return firstName;
        }
        static String sayHello(String firstName, String lastName){
            //System.out.printIn("Hello " + fisrtName + " " + lastName);
            return firstName + lastName;
        }


        static int tambah(int var1, int var2){
            return var1 + var2;
        }

        static String tambah(String var1, String var2){
            return var1 + " tambah " + var2;
        }
           
        public static void main(String[] args) {
            
            System.out.println(sayHello("Rania", "Gisela"));
            System.out.println(sayHello("Hello"));

                System.out.println(tambah(1, 2));
                System.out.println(tambah("satu", "dua"));
        }
    }