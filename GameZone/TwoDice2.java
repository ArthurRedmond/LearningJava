// Filename TwoDice2.java
// Written by Arthur Redmond
// Written on 2019-04-01

public class TwoDice2
{
    public static void main(String[] args)
    {
        Die2 firstDie = new Die2();
        Die2 secondDie = new Die2();
        int dieOne = firstDie.dieValue;
        int dieTwo = secondDie.dieValue;
        
        System.out.println("Throwing dice...");
        System.out.println("Die number one: " + firstDie.dieValue);
        System.out.println("Die number two: " + secondDie.dieValue);
        if(dieOne > dieTwo)
            System.out.println("Die number one is higher!");
        if(dieOne < dieTwo)
            System.out.println("Die number two is higher!");
        if(dieOne == dieTwo)
            System.out.println("It's a tie!");
    }
}
