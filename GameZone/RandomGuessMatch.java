// Filename RandomGuessMatch.java
// Written by Arthur Redmond
// Written on 2019-03-20

import javax.swing.JOptionPane;
public class RandomGuessMatch
{
    public static void main(String[] args)
    {
        int randomNumber;
        int guess;
        int differece;
        
        randomNumber = 1 + (int)(Math.random() * 5);
        guess = Integer.parseInt (JOptionPane.showInputDialog(null, "Guess the number I'm thinking between 1 and 5", "Enter a number", JOptionPane.QUESTION_MESSAGE));
        if (randomNumber == guess)
        {
            JOptionPane.showMessageDialog(null, "You're right!");
        } 
        else
        {
            differece = randomNumber - guess;
            JOptionPane.showMessageDialog(null, "You were off by " + Math.abs(differece));
        }
        boolean wasCorrect = (randomNumber == guess);
        JOptionPane.showMessageDialog(null, "The secret number was " + randomNumber + "\nYour guess was " + wasCorrect);     
    }
}