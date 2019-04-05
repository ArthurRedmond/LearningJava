// Filename Count21.java
// Written by Arthur Redmond
// Written on 2019-04-04

import java.util.Scanner;
public class Count21
{
    public static void main(String[] args)
    {
        String message = "Enter a number >> ";
        String message2 = "The tally is now ";
        boolean gameOver = false;
        int playerNum;
        int computerNum;
        int tally = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Let's play a game. \nLet's take turns picking numbers between 1 and 3. " +
        "\nThe first to go over 21 loses. \nYou can go first.");
        System.out.println();
        while(!gameOver)
        {
            System.out.print(message);      
            playerNum = keyboard.nextInt();
            if(playerNum < 1 || playerNum > 3)
            {
                System.out.println("Please only enter a number between 1 and 3.");
            }
            else
            {
                tally += playerNum;
                System.out.println(message2 + tally + ".");   
                System.out.println();
                if(tally > 21)
                {
                    gameOver = true;
                    System.out.println("Hah! You went over 21. You lose!");
                }
                else
                {
                    computerNum = RandomNum();
                    System.out.println("I'll add " + computerNum + ".");
                    tally += computerNum;
                    System.out.println(message2 + tally + ".");
                    System.out.println();
                    if(tally > 21)
                    {
                        gameOver = true;
                        System.out.println("Oh no! I went over 21. You win!");     
                    }
                }
            }
        }
    }
    public static int RandomNum()
    { 
        final int LOW_NUMBER = 1;
        final int HIGH_NUMBER = 3;
        int randomNumber;
        randomNumber = (((int)(Math.random() * 100) % HIGH_NUMBER + LOW_NUMBER));
        return randomNumber;
    }
}