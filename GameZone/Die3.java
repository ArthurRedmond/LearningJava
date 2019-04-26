// Filename Die3.java
// Written by Arthur Redmond
// Written on 2019-04-25

public class Die3
{
  public int dieValue;
  protected int HIGHEST_DIE_VALUE = 6;
  protected int LOWEST_DIE_VALUE = 1;
 
  public Die3() 
  {
    dieValue = (((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE));   
  }
}
