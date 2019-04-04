// Filename Count21.java
// Written by Arthur Redmond
// Written on 2019-04-04

import java.util.Scanner;
public class Count21
{
    public static void main(String[] args)
    {
        String message = "Enter a number >> ";
        String message2 = "The tally is ";
        int playerNum;
        int computerNum;
        int tally = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Let's play a game. \nLet's take turn picking numbers between 1 and 3. " +
        "\nThe first to go over 21 loses. \nYou can go first.");
        do
        {
            System.out.print(message);
            playerNum = keyboard.nextInt();
            tally += playerNum;
            System.out.println(message2 + tally + ".");
            computerNum = RandomNum();
            System.out.println("I'll add " + computerNum + ".");
            tally += computerNum;
            System.out.println(message2 + tally + ".");
            System.out.println();

        } while (tally < 21);
        

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