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
        int winningDie;
        String message;




        System.out.println("Throwing dice...");
        if(dieOne > dieTwo)
        {
          winningDie = 1;
            if(firstDie.dieValue < secondDie.dieValue)
                winningDie = 2;
        }
          else
          winningDie = 3;
        System.out.println("Die number one: " + firstDie.dieValue);
        System.out.println("Die number two: " + secondDie.dieValue);
        switch(winningDie)
        {
            case 1:
            System.out.println("Die number one is higher!");
            break;
            case 2:
            System.out.println("Die number two is higher!");
            break;
            case 3:
            System.out.println("It's a tie!");
            break;
        }
    }
}