public class PickTwoCards2
{
  public static void main(String[] args)
  {
    Card2 firstCard = new Card2();
    Card2 secondCard = new Card2();
    firstCard = getData(firstCard);
    secondCard = getData(secondCard);
    System.out.println("Your first card is the " + firstCard.getCardValue() + " of " + firstCard.getCardSuit());
    System.out.println("Your second card is the " + secondCard.getCardValue() + " of " + secondCard.getCardSuit());
  }
  public static Card2 getData(Card2 data)
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
