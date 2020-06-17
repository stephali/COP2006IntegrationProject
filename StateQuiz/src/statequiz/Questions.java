package statequiz;

import java.util.Random;
import java.util.Scanner;

public class Questions {
  String state;
  String answer;
  String[] choiceArray;
  Score s;

  public void setQuestion(String state, String answer, String[] choiceArray, Score s) {
    this.state = state;
    this.answer = answer;
    this.choiceArray = choiceArray;
    this.s = s;
  }


  public void prompt() {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    while (true) {
      int randChoiceOne = rand.nextInt(14) + 1;
      int randChoiceTwo = rand.nextInt(14) + 1;
      int randChoiceThree = rand.nextInt(14) + 1;
      int randPosition = rand.nextInt(3) + 1;

      System.out.println("What is the capital of " + state + "?\n");
      int correctChoice = 0;

      switch (randPosition) {
        case 0:
          System.out.println("1." + answer);
          System.out.println("2." + choiceArray[randChoiceOne]);
          System.out.println("3. " + choiceArray[randChoiceTwo]);
          System.out.println("4. " + choiceArray[randChoiceThree]);
          correctChoice = 1;
          break;
        case 1:
          System.out.println("1. " + choiceArray[randChoiceOne]);
          System.out.println("2. " + answer);
          System.out.println("3. " + choiceArray[randChoiceTwo]);
          System.out.println("4. " + choiceArray[randChoiceThree]);
          correctChoice = 2;
          break;
        case 2:
          System.out.println("1. " + choiceArray[randChoiceOne]);
          System.out.println("2. " + choiceArray[randChoiceTwo]);
          System.out.println("3. " + answer);
          System.out.println("4. " + choiceArray[randChoiceThree]);
          correctChoice = 3;
          break;
        case 3:
          System.out.println("1. " + choiceArray[randChoiceOne]);
          System.out.println("2. " + choiceArray[randChoiceTwo]);
          System.out.println("3. " + choiceArray[randChoiceThree]);
          System.out.println("4. " + answer);
          correctChoice = 4;
          break;
      }

      System.out.println("\nType in the number choice.");
      while (true) {
        try {
          int userInput = scan.nextInt();
          if (userInput == correctChoice) {
            System.out.println("Correct\n");
            s.setScore(1, "/5!");
            break;
            // == method checks for the instances of the two objects not the actual value while
            // equals
            // does check for the value
          } else if (!(userInput == correctChoice)) {
            System.out.println("Incorrect");
            break; // break takes you out of a loop
          } else {
            System.out.println("Wrong entry. Choose 1, 2, 3, or 4.\n");
          }
          break;
        } catch (Exception e) {
          break;
        }
      }
      break;


    }

  }



}
