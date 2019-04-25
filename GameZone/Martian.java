// Filename Martian.java
// Written by Arthur Redmond
// Written on 2019-04-24

public class Martian extends Alien
{
  public Martian(String species, int eyes, String col, int ht)
  {
    super(species, eyes, col, ht);
  }

  public void display()
  {
    System.out.println("\nA " + alienSpecies + " alien has just materialized!" +
    "\nIt's a ghastly " + color + " color with " + numberOfEyes + " eyes and stands" + 
    " at least " + height + " feet tall!");
  }
}