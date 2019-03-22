// Filename RandomGuess.java
// Written by Arthur Redmond
// Written on 2019-03-19

import javax.swing.JOptionPane;

public class RandomGuess
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10");
        JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random() * 10)));
    }
}