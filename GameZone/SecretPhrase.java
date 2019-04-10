// Filename SecretPhrase.java
// Written by Arthur Redmond
// Written on 2019-04-09

import java.util.Objects;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class SecretPhrase{

    
    private final static String SECRET_PHRASE = "Horse Feathers";
    
    public static void main(String[] args)
    {
        boolean gameOver = false;
        StringBuilder gameString = new StringBuilder("***** ********");
        char playerGuess;

        System.out.println("Let's play a game...\nTry to guess the secret phrase. \nAre you ready?");

        while(!gameOver)
        {
            int stringLength;
            stringLength = SECRET_PHRASE.length();
            System.out.println("The secret phrase is " + gameString);
            playerGuess = nextTurn();
            for(int i = 0; i < SECRET_PHRASE.length(); i++)
            {
                if(SECRET_PHRASE.charAt(i) == playerGuess)
                {
                    gameString.setCharAt(i, playerGuess);
                }
            }
        }
    }
    public static char nextTurn()
    {
        Scanner keyboard = new Scanner(System.in);
        String guessString;
        System.out.print("What letter would you like to guess? >> ");
        guessString = keyboard.nextLine();
        char guess = guessString.charAt(0);
        return guess;
    }
}
