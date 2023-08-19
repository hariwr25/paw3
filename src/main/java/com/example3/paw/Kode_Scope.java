package com.example3.paw;

public class Kode_Scope {
     static void sayHello(String name) {
            String hello = "Hello" + name;
            if (!name.isBlank()) {
                String hi = "Hi " + name;
                System.out.println(hi);
            }

            System.out.println(hello);
            //System.out.println(hi); 
        }
    }
    