package com.example3.paw;

public class ForEach {
    public static void main(String[] args) {
        String[] array = {
            "Eko", "Kurniawan", "Khannedy",
            "Programmer", "Zaman", "Now"
        };

        for (var value : array) {
            System.out.println(value);
        }
}
}