package com.company;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private static String species = "Homo Sapien";

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person (String firstName){
        this.firstName = firstName;
        this.lastName = "Smith";
    }

    public String getFullName() {
        if(this.middleName == null) {
            return this.firstName + " " + this.lastName;
        }
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }

    public String getInitials() {
        String initals = this.firstName.substring(0,1);
        if (this.middleName != null){
            initals += "." + this.middleName.substring(0,1) + "." + this.lastName.substring(0,1);
        } else{
            initals += "." + this.lastName.substring(0,1) + ".";
        }
        return initals;

//        return this.firstName.substring(0, 1) + "." + ((this.middleName != null) ? this.middleName.substring(0, 1) + "." : "") + this.lastName.substring(0, 1) + ".";
    }

    public static String getSpecies(){
        return species;
    }

    //    public static String sayHi (Person person){
//        return "Hi " + person.getFullName();
//    }
}