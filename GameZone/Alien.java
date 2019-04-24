public class Alien
{
  protected String alienSpecies;
  protected int numberOfEyes;
  protected String color;
  protected int height;

  public Alien(String species, int eyes, String col, int ht)
  {
    alienSpecies = species;
    numberOfEyes = eyes;
    color = col;
    height = ht;
  }
  public void display()
  {
    System.out.println("\nA " + alienSpecies + " alien has just materialized!" +
      "\nIt's a ghastly " + color + " color with " + numberOfEyes + " eyes and stands" + 
      " at least " + height + " feet tall!");
  }
}