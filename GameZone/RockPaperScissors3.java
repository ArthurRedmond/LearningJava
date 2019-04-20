// Filename RockPaperScissors3.java
// Written by Arthur Redmond
// Written on 2019-04-19

import java.util.Scanner;

public class RockPaperScissors3
{
  enum RPS {ROCK, PAPER, SCISSORS};
  public static void main(String[] args) 
  {
    RPS playerSelction;
    String playerString;
    RPS computerRPS;
    System.out.print("Are you ready to play?" + 
      "\nEnter Rock, Paper, or Scissors then press enter >> ");
    Scanner input = new Scanner(System.in);
    playerString = input.nextLine().toUpperCase();
    System.out.println();
    playerSelction = RPS.valueOf(playerString);
    computerRPS = randNum();
    gamePlay(playerSelction, computerRPS);     
  }

  public static RPS randNum()
  {
    RPS computerRPS;
    int randomNum = (1 + (int)(Math.random() * 3));
    switch(randomNum)
    {
      case 1:
        computerRPS = RPS.ROCK;
        break;
      case 2:
        computerRPS = RPS.PAPER;
        break;
      default:
        computerRPS = RPS.SCISSORS;
    }
    return computerRPS; 
  }

  public static void gamePlay(RPS player, RPS computer)
  {
    RPS playr = player;
    RPS comp = computer;
    System.out.println("Rock... Paper... Scissors... Shoot!"); 
    if(playr.equals(RPS.ROCK) && comp.equals(RPS.SCISSORS) ||
      playr.equals(RPS.PAPER) && comp.equals(RPS.ROCK) ||
      playr.equals(RPS.SCISSORS) && comp.equals(RPS.PAPER))
      System.out.println("I chose " + comp + "! You win!");
    else if(playr.equals(comp))
      System.out.println("We both chose " + comp + "! It's a tie!");
    else 
      System.out.println("I chose " + comp +"! I win!");    
  }
}
