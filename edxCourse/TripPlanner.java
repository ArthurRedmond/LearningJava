import java.util.Scanner;

public class TripPlanner {
    
    public static void main(String[] args){
        Greeting();
        DaysAndBudget();
        TimeChange();
        CountryArea();
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
    public static void DaysAndBudget() {
        Scanner keyboard2 = new Scanner(System.in);
        int days;
        int budget;
        String currencySymbol;
        double exchangeRate;
        System.out.println();
        System.out.print("How many days are you going to spend travelling? ");
        days = keyboard2.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        budget = keyboard2.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        currencySymbol = keyboard2.next();
        System.out.print("How many " + currencySymbol + " are there in 1 USD? ");
        exchangeRate = keyboard2.nextDouble();
        System.out.println();
        int hours = days * 24;
        int mins = hours * 60;
        double dailyBudget = ((int)(budget / days) * 100.0) / 100.0;
        double convertedBudget = ((int)(budget * exchangeRate) * 100.0) / 100.0;
        double dailyConvertedBudget = ((int)(convertedBudget / days) * 100.0) / 100.0;
        System.out.println("If you are travelling for " + days + " that is the same as " +
            hours + " hours or " + mins + " munutes");
        System.out.println("If you are going to spend $" + budget + " USD that means per day you can spend " + 
            "up to $" + dailyBudget + " USD");
        System.out.println("Your total budget in " + currencySymbol + " is " + convertedBudget + 
            " " + currencySymbol + ", which per day is " + dailyConvertedBudget + " " + currencySymbol);
        System.out.println("***********");
    }
    public static void TimeChange(){
        Scanner keyboard3 = new Scanner(System.in);
        int timeDifference = 0;
        System.out.println();
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        timeDifference = keyboard3.nextInt();
        int midnight = (0 + timeDifference) % 24;
        int noon = (12 + timeDifference) % 24;
        System.out.println("That means that whin it is midnight at home it will be "
            + midnight + ":00 in your travel destination");
        System.out.println("and when it is noon at home it will be " + noon + ":00");
        System.out.println("***********");
    }
    public static void CountryArea(){
        Scanner keyboard4 = new Scanner(System.in);
        int area;
        double kiloToMiles = 0.3861;
        System.out.println();
        System.out.print("What is the square area of your destination country in km2? ");
        area = keyboard4.nextInt();
        double convertedToMiles = ((int)(area * kiloToMiles) * 100.0) / 100.0;
        System.out.println("In miles2 that is " + convertedToMiles);
        System.out.println("***********");
    }
}