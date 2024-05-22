package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String meslek;
    int maas;
    String sehir;

    public Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;


    }

    public Person(String firstName, String lastName, int age, String meslek, int maas, String sehir) {
        this(firstName,lastName,age);
        this.meslek = meslek;
        this.maas = maas;
        this.sehir = sehir;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        if(this.age>=13 && this.age<=19){
            return true;
        }else{
            return false;
        }
    }
}
