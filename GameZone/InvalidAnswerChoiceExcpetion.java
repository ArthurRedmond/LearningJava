// Filename InvalidAnswerChoiceException.java
// Written by Arthur Redmond
// Written on 2019-05-01

public class InvalidAnswerChoiceExcpetion extends Exception
{
  public InvalidAnswerChoiceExcpetion()
  {
    super("Please only enter \"A\", \"B\", or \"C\"\n");
  }
}