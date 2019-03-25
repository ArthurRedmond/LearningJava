// Filename PickTwoCards.java
// Written by Arthur Redmond
// Written on 2019-03-24

import java.util.Scanner;

// To be used in calculations:
// final int CARDS_IN_SUIT = 13;
// RandomInt = ((int)(Math.random() * 100) % CARDS_IN_SUIT + );
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
        secondCard.setCardValue(getData());
        System.out.println("Second card value: " + firstCard.getCardValue());
        //Scanner keyboard = new Scanner(System.in);
        //firstCard = getData(firstCard);
        //secondCard = getData(secondCard);
    }
    public static int getData()
    {
        final int CARDS_IN_SUIT = 13;
        RandomInt = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        return RandomInt
    }
}
