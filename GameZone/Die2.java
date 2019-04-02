// Filename Die2.java
// Written by Arthur Redmond
// Written on 2019-04-01

public class Die2
{
  public int dieValue;
  private final int HIGHEST_DIE_VALUE = 6;
  private final int LOWEST_DIE_VALUE = 1;

  public Die2()
  {
    dieValue = (((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE));   
  }    
}
