// Filename Die.java
// Written by Arthur Redmond
// Written on 2019-03-27

public class Die
{
  private int dieValue;
  private final int HIGHEST_DIE_VALUE = 6;
  private final int LOWEST_DIE_VALUE = 1;

  public Die()
  {
    setDieValue(((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE));   
  }    
  public int getDieValue() 
  {
		return dieValue;
	}
  public void setDieValue(int dieValue) 
  {
		this.dieValue = dieValue;
	}
 }
