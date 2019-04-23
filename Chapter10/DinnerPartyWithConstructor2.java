public class DinnerPartyWithConstructor2 extends PartyWithConstructor2
{
  public DinnerPartyWithConstructor2(int numGuest)
  {
    super(numGuest);
  }
  private int dinnerChoice;
  public int getDinnerChoice()
  {
    return dinnerChoice;
  }
  public void setDinnerChoice(int choice)
  {
    dinnerChoice = choice;
  }
  @Override
  public void displayInvitation()
  {
    System.out.println("Please come to my dinner party!");
  }
}