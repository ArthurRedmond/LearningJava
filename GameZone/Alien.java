// Filename Alien.java
// Written by Arthur Redmond
// Written on 2019-04-24

public abstract class Alien
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
}