package Basics;

public class Weather {
    public static void main(String[] agrs){
        // This program will give suggestions of what to wear based on the weather

        int tempature = 60;
        String sunCondition = "Sunny";

        if(tempature > 80){
            System.out.println("Its nice outside. Wear shorts and t-shirts");
        }
        else if(tempature > 60 && sunCondition == "Sunny"){
            System.out.println("Its a bit cooler. Wear a long sleeve shirt and jeans");
            System.out.println("Wear a hat to keep the sun out of your eyes");
        }
        else if(tempature > 50 || sunCondition == "Cloudy"){
            System.out.println("Its on the colder side, wear a sweater");
        }
        else
            System.out.println("Its very cold day. Wear a jacket");

    }
}

