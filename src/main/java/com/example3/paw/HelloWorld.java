package com.example3.paw;

public class HelloWorld {
    public static void main(String[] args) {
        // CODE PROGRAM

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000l;
        long iniLong2 = 1000000l;

        byte iniByte2 = 12;
        short iniShort_Konversi = iniByte;

        short iniShort2 = 32_767;
        int iniInt2 = 2_147_483_647;
        long iniLong3 = 923_337_203l;

        float iniFloat = 10.12F;
        long iniLong4 = (long) iniFloat;

        double iniDouble = 12.2424;

        int decimalInt = 25;
        int hexInt = 0xABCDEF;
        int binInt = 0b1010101010101;

        char k = 'K';
        char e = 'E';
        char o = 'O';

        System.out.println("Tipe data di java");
        System.out.print(e);
        System.out.print(k);
        System.out.println(o);

        System.out.println(e);
        System.out.println(k);
        System.out.println(o);

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);

        String firstname = "Hari Wahyu";
        String lastname = "Ramadhan";
        String fullname = firstname + " " + lastname;

        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(fullname);

        String name;
        name = "Hari Wahyu Ramadhan";

        int age = 30;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // final
        final String name1 = "Hari Wahyu Ramadhan";
        int age1 = 30;
        String address1 = "Indonesia";

        // name1 = "diubah"; karena final

        System.out.println(name1);
        System.out.println(age1);
        System.out.println(address1);

        // Array
        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "Hari";
        arrayString[0] = "Wahyu";
        arrayString[0] = "Ramadhan";

        int[] arrayInt = new int[] {
                        10, 90, 80, 67, 29
        };

        long[] arraylong = {
                        10, 90, 80, 67, 29
        };

        arraylong[0] = 100;

        System.out.println(arraylong[0]);
        System.out.println(arraylong[1]);
        System.out.println(arraylong.length);

        String[][] members = {
                        { "Hari", "Wahyu", "Ramadhan" },
                        { "Budi", "Andi" },
                        { "Ani", "Abdul" }
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

}
}