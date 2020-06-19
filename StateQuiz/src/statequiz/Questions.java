package statequiz;

import java.util.Random;
import java.util.Scanner;

/**
 * This class sets up the layout of the questions and sets the order in which the answer choices are
 * printed out.
 * 
 * @author Stephanie Ali
 *
 */
public class Questions {
  /**
   * This is the form the states will be laid out.
   */
  private String state;
  /**
   * This is the form the answers will be laid out.
   */
  private String answer;
  /**
   * The answer choices will be stored in this as strings.
   */
  private String[] choiceArray;
  /**
   * An object for Score named s It's used to set and get the score.
   */
  private Score scoreObject;

  /**
   * Sets all the parameters from main to be saved in this file to be able to run.
   * 
   * @param state sent in from main to be assigned in Questions class
   * @param answer sent in from main to be assigned in Questions class
   * @param choiceArray sent in from main to be assigned in Questions class
   * @param s sent in from main to be assigned in Questions class
   */
  public void setQuestion(String state, String answer, String[] choiceArray, Score s) {
    this.state = state;
    this.answer = answer;
    this.choiceArray = choiceArray;
    this.scoreObject = s;
  }

  /**
   * This method randomizes the answer choices and sets up the layout of the question prompt and the
   * layout of the answer choices.
   */
  public void prompt() {

    Scanner scan = new Scanner(System.in, "UTF-8");
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
        default:
          break;
      }

      System.out.println("\nType in the number choice.");
      while (true) {
        try {
          int userInput = scan.nextInt();
          if (userInput == correctChoice) {
            System.out.println("Correct\n");
            scoreObject.setScore(1, "/5!");
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
          System.out.println("Please type the corresponding number.");
          break;
        }
      }
      break;

    }

  }

}
