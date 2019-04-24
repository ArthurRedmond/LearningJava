public class CreateAlien
{
  public static void main(String[] args) 
  {
    Martian AlienOne = new Martian("Martian", 3, "red", 3);
    Jupiterian AlienTwo = new Jupiterian("Jupiterian", 6, "purple", 6, 3);
    AlienOne.display();
    AlienTwo.display();
    System.out.println("\nWhere's Will Smith and Tommy Lee Jones when you need them?!");     
  }
}