public class Jupiterian extends Alien
{
  int numberOfHeads;
  public Jupiterian(String species, int eyes, String col, int ht, int heads)
  {
    super(species, eyes, col, ht);
    numberOfHeads = heads;
  }
  @Override
  public void display()
  {
    System.out.println("\nA " + alienSpecies + " alien has just materialized!" +
      "\nIt's a ghastly " + color + " color with " + numberOfHeads + " heads, " 
      + numberOfEyes + " eyes, and stands at least " + height + " feet tall!");    
  }
}