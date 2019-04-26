// Filename LoadedDie.java
// Written by Arthur Redmond
// Written on 2019-04-25

public class LoadedDie extends Die3
{
  public int dieValue;
  protected int HIGHEST_DIE_VALUE = 6;
  protected int LOWEST_DIE_VALUE = 2;
 
  public LoadedDie() 
  {
    dieValue = (((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE));   
  }
}