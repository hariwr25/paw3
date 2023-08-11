package com.BelajarOOP;

public class AppPerson {
  public static void main(String[] args) {
        var person = new Person("P", "p");
        //AppPerson person2 = new AppPerson();

        //AppPerson person3;
        //person3 = new AppPerson();

        person.name = "Hari";
        //person.address = "yog";
        // person.country = "Tidak Bisa diubah"

        //System.out.println(person.name);
        //System.out.println(person.address);
        //System.out.println(person.country);

        person.sayHello("Wahyu");
    }
}