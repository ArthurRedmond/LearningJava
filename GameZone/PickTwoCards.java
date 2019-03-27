// Filename PickTwoCards.java
// Written by Arthur Redmond
// Written on 2019-03-26

public class PickTwoCards
{
  public static void main(String[] args)
  {
    Card firstCard = new Card();
    Card secondCard = new Card();
    firstCard = getData(firstCard);
    secondCard = getData(secondCard);
    System.out.println("Your first card is the " + firstCard.getCardValue() + " of " + firstCard.getCardSuit());
    System.out.println("Your second card is the " + secondCard.getCardValue() + " of " + secondCard.getCardSuit());
  }
  public static Card getData(Card data)
  {
    char suit;
    int myValue;
    data.setCardSuit('S');
        final int CARDS_IN_SUIT = 13;
    myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT +1);
    data.setCardValue(myValue);
    return data;
  }
}
