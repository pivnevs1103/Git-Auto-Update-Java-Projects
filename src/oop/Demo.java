package oop;

// This will serve as a template or a blueprint with attributes of a persons name, email and phone number
class Person{

    String name;
    String email;
    String phone;

    void name(){
        System.out.println("The persons name is: " + name);
    }

    void email(){
        System.out.println("Their email address is: " + email);
    }

    void phone(){
        System.out.println("Their phone is: " + phone);
    }
}

public class Demo {
    public static void main(String[] args){

        // Person -

        // Attributes, variables, adjectives, descriptors
        String name = "Connor Bedard";
        String email = "connorbedard@testmail.com";
        String phone = "7181234567";

        System.out.println(name + " email is: " + email + " and his number is: " + phone);

        // But what if we wanted to do this for another person?
        //      1) Well we could copy this exact code and change the information
        //      2) We can create a method and pass info there
        personInfo("Matvei Michkov","matveimichkov@testmail.com", "3475461234");

        // What about binding attributes and properties together?
        //      3) Create a class

        //Instantiating an object
        Person person1 = new Person();

        // Defining some properties
        person1.name = "Alexander Ovechkin";
        person1.email = "alexanderovechkin@testmail.com";
        person1.phone = "6461234567";

        //Abstraction
        person1.name();
        person1.email();
        person1.phone();

        // And we can create another person and that person will have their features
    }

    //Enhance by adding functions to minimize code
    static void personInfo(String name, String email, String phone){
        System.out.println(name + " email is: " + email + " and his number is: " + phone);
    }
}
