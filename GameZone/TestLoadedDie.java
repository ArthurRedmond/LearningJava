// Filename TestLoadedDie.java
// Written by Arthur Redmond
// Written on 2019-04-25

public class TestLoadedDie
{
  public static void main(String[] args) 
  {
    int tallyRoundOne = 0;
    int tallyRoundTwo = 0;
       
    for(int i = 0; i < 1000; ++i)
    {
      Die3 regularDie1 = new Die3();
      Die3 regularDie2 = new Die3();      
      if(regularDie1.dieValue > regularDie2.dieValue)
        ++tallyRoundOne;
    }
    for(int j = 0; j < 1000; ++j)
    {
      Die3 regularDie = new Die3();
      LoadedDie loadedDie = new LoadedDie();
      if(regularDie.dieValue > loadedDie.dieValue)
        ++tallyRoundTwo;
    }
    System.out.println("With two regular dice, the first die won " +
      tallyRoundOne + " times out of 1000");
    System.out.println("With one die and one loaded die, the first die won " +
      tallyRoundTwo + " times out of 1000");
  }
}