// Filename TwoDice.java
// Written by Arthur Redmond
// Written on 2019-03-27

public class TwoDice
{
    public static void main(String[] args)
    {
        Die firstDie = new Die();
        Die secondDie = new Die();
        System.out.println("Throwing dice...");
        System.out.println("Die number one: " + firstDie.getDieValue());
        System.out.println("Die number two: " + secondDie.getDieValue());
    }
}