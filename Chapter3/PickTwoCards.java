// Filename PickTwoCards.java
// Written by Arthur Redmond
// Written on 2019-03-24

import java.util.Scanner;

public class PickTwoCards
{
       public static void main(String[] args)
    {
        Card firstCard = new Card();
        firstCard.setCardSuit('s');
        System.out.println("First card suit: " + firstCard.getCardSuit()); 
        firstCard.setCardValue(getData());
        System.out.println("First card value: " + firstCard.getCardValue());
        Card secondCard = new Card();
        secondCard.setCardSuit('d');
        System.out.println("\nSecond card suit: " + firstCard.getCardSuit()); 
        secondCard.setCardValue(1);
        System.out.println("Second card value: " + firstCard.getCardValue());
    }
    public static int getData()
    {
        int MyValue;
        final int CARDS_IN_SUIT = 13;
        MyValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        return MyValue;
    }
}
