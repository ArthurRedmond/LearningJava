// Filename Card.java
// Written by Arthur Redmond
// Written on 2019-03-26

public class Card
{
  private char cardSuit;
  private int cardValue;
  
  public void setCardSuit(char suit)
  {
    cardSuit = suit;
  }
  public char getCardSuit()
  {
    return cardSuit;
  }
  public void setCardValue(int myValue)
  {
    cardValue = myValue;
  }
  public int getCardValue()
  {
    return cardValue;
  }
}
