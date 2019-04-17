// Filename Quiz.java
// Written by Arthur Redmond
// Written on 2019-04-16

import java.util.*;
public class Quiz2
{
  public static void main(String[] args)
  {
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
      System.out.println(questions[i].prompt);
      Scanner input = new Scanner(System.in);
      String playerGuess = input.nextLine();
      playerGuess.toUpperCase();
      if(playerGuess.equals("A") || playerGuess.equals("B") || playerGuess.equals("C")){
        if(playerGuess.equals(questions[i].answer))
        {
          System.out.println(correct);
        }
        else
        {
          System.out.println(incorrect + questions[i].answer);
        }             
      }
    }
  }
}