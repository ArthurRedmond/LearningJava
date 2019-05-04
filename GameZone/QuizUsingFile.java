// Filename QuizUsingFile.java
// Written by Arthur Redmond
// Written on 2019-05-01

import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static java.nio.file.StandardOpenOption.*;
import java.util.*;

public class QuizUsingFile
{
  public static void main(String[] args)
  {
    Path file = Paths.get("HighScores.txt");
    String s = "00,   " + System.getProperty("line.separator");
    byte[] data = s.getBytes();
    ByteBuffer buffer = ByteBuffer.wrap(data);
    final int NUMRECS = 11;
    Scanner keyboard = new Scanner(System.in);
    String name;
    System.out.print("Please enter your initials >> ");
    name = keyboard.nextLine();
    try
    {
      OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
      for(int count = 0; count < NUMRECS; ++count)
        writer.write(s, 0, s.length());
      writer.close();
    }
    catch(Exception e)
    {
      System.out.println("Error message: " + e);
    }
    String[] array = new String[1];
    int score;
    String stringScore;
    String delimeter = ",";
    String player;
    try
    {
      System.out.println("*** High Scores ***");
      InputStream input = new BufferedInputStream(Files.newInputStream(file));
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      System.out.println();
      s = reader.readLine();
      while(s != null)
      {
        array = s.split(delimeter);
        stringScore = array[0];
        score = Integer.parseInt(array[0]);
        player = array[1];
        s = reader.readLine();      
      }
      reader.close();
    }
    catch(Exception e)
    {
      System.out.println("Message: " + e);
    }
        
    int tally = 0;
    
    String question1 = "How many days are in April?\n" +
      "A: 28\nB: 30\nC: 31";
    String question2 = "Who was the first president of the United Sates?\n" +
      "A: George Washington\nB: Thomas Jefferson\nC: John Addams";
    String question3 = "What is the tallest animal in the world?\n" +
      "A: Bumble Bee\nB: Blue Whale\nC: Giraffe";
    String question4 = "What is a baby cow called?\n" +
      "A: Kid\nB: Calf\nC: Bull";
    String question5 = "Lot was the nephew of?\n" + 
      "A: Noah\nB: Lot\nC: Adam";
    String question6 = "How many rings are in the Olympic logo?\n" +
      "A: 4\nB: 5\nC: 6";
    String question7 = "Who wrote A Christmas Carol?\n" +
      "A: Charlse Dickens\nB: William Shakespeare\nC: Mark Twain";
    String question8 = "What is the chemical formula for water?\n" +
      "A: CO2\nB: HO2\nC: H2O";
    String question9 = "Who was the first person to step on the moon?\n" + 
      "A: Neil Armstrong\nB: Buzz Aldrin\nC: Jim Lovell";
    String question10 = "How many keys are there on a piano?\n" +
      "A: 72\nB: 88\nC: 100";

    QuizQuestion [] questions = 
    { new QuizQuestion(question1, "B"),
      new QuizQuestion(question2, "A"),
      new QuizQuestion(question3, "C"),
      new QuizQuestion(question4, "B"),
      new QuizQuestion(question5, "B"),
      new QuizQuestion(question6, "B"),
      new QuizQuestion(question7, "A"),
      new QuizQuestion(question8, "C"),
      new QuizQuestion(question9, "A"),
      new QuizQuestion(question10, "B")
    };

    String correct = "Correct!";
    String incorrect = "The correct answer is ";
      
    for(int i = 0; i < questions.length; i++){
      System.out.println(questions[i].question);
      System.out.print("Enter A B or C >> ");
      Scanner input = new Scanner(System.in);
      String playerGuess = input.nextLine().toUpperCase();
      System.out.println();
      try
      {
        if(!(playerGuess.equals("A") || playerGuess.equals("B") || playerGuess.equals("C")))
        {
          throw(new InvalidAnswerChoiceExcpetion());
        }  
        else
        {
          if(playerGuess.equals(questions[i].answer))
          {
            System.out.println(correct + "\n");
            ++tally;
          }
          else
          {
            System.out.println(incorrect + questions[i].answer + "\n");
          }     
        }
      }
      catch(InvalidAnswerChoiceExcpetion e)
      {
        System.out.println(e);
        --i;
      }
    }
    System.out.println("Your score is: " + tally);
  }
}
