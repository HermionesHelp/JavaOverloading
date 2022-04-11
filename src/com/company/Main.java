package com.company;

public class Main {

    public static void main(String[] args) {
        // invoking the constructor that has two arguments (String, String)
        Person personOne = new Person("Edna", "Mode");
        System.out.println(personOne.getFullName());
        System.out.println(personOne.getInitials());

        // invoking the constructor that has three arguments (String, String, String)
        Person personTwo = new Person("Mary", "Katherine", "Gallagher");
        System.out.println(personTwo.getFullName());
        System.out.println(personTwo.getInitials());

//        System.out.println(Person.sayHi(personOne));

    }
}