import java.util.Scanner;

import javax.print.attribute.standard.Destination;
public class TripPlanner {
    
    public static void main(String[] args){
        Greeting();
        TimeAndBudget();
    }

    public static void Greeting() {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String destination;
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        name = keyboard.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        destination = keyboard.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip");
        System.out.println("***********");
    }
    public static void TimeAndBudget() {
        Scanner keyboard = new Scanner(System.in);
        int days;
        int budget;
        String currencySymbol;
        double exchangeRate;
        System.out.println();
        System.out.print("How many days are you going to spend travelling? ");
        days = keyboard.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        budget = keyboard.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        currencySymbol = keyboard.nextLine();
        //keyboard.nextLine();
        System.out.print("How many " + currencySymbol + " are there in 1 USD? ");
        exchangeRate = keyboard.nextDouble();
        System.out.println();
        int hours = days * 24;
        int mins = hours * 60;
        double dailyBudget = budget / days;
        double convertedBudget = budget * exchangeRate;
        double dailyConvertedBudget = convertedBudget / days;
        System.out.println("If you are travelling for " + days + " that is the same as " +
            hours + " hours or " + mins + " munutes");
        System.out.println("If you are going to spend $" + budget + " USD that means per day you can spend " + 
            "up to $" + dailyBudget + " USD");
        System.out.println("Your total budget in " + currencySymbol + " is " + convertedBudget + 
            " " + currencySymbol + ", which per day is " + dailyConvertedBudget + " " + currencySymbol);
        System.out.println("***********");
    }
}