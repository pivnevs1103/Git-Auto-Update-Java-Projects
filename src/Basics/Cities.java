package Basics;

public class Cities {
    public static void main(String[] args){

        // Declare and define an array
        String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);

        // Declare and define the array (only size)
        String[] states = new String[5];
        states[0] = "California";
        states[1] = "Ohio";
        states[2] = "New Jersey";
        states[3] = "Texas";
        states[4] = "Utah";

        System.out.println(states[0]);

        // Declare an array
        String[] countries;

        // Define an array
        countries = new String[2];
        countries[0] = "Usa";
        countries[1] = "Canada";
    }
}

