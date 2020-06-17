// Stephanie Ali

/*
 * Choose the correct capital for each state. For each question you answer correct, you gain 1
 * point.
 */

/*
 * Primitive Data Types byte: holds a whole number > only takes 1 byte > -128 to 127 short: holds a
 * whole number > takes up 2 bytes > -32768 to 32767 int: holds a whole number > takes up 4 bytes
 * long: supports bigger numbers > takes up 8 bytes float: holds a decimal value > stores up to 6-7
 * digits double: holds a decimal value > stores up to 15 digits boolean: declares a variable true
 * or false char: holds letter characters > ASCII
 */

/*
 * Scope refers to the accessibility of a variable. How large the scope is depends on where the
 * variable was declared.
 */

// Operator precedence determines the order operators in an expression are evaluated

/*
 * Inheritance is a mechanism in java that allows classes to inherit (or use) other classes fields &
 * methods. It is very beneficial because instead of writing the same code over and over for each
 * class, you can just inherit all the features you need from a parent class. It saves up more
 * space.
 */

/*
 * Polymorphism is when objects take on many forms. For example, the parent class sets attributes
 * for all of it's child classes. Polymorphism is when a class changes attributes that the parent
 * class had already set.
 */

// super is a reference to the base (parent) class
package statequiz;

import java.util.Random;
import java.util.Scanner;

public class StateQuiz {

  public static void main(String[] args) {
    Score s = new Score();
    Questions q = new Questions();

    int playerScore = 0;
    String[] choiceArray = new String[] {"Albany", "Annapolis", "Atlanta", "Augusta", "Austin",
        "Baton Rouge", "Bismarck", "Boise", "Boston", "Carson City", "Cheyenne", "Columbia",
        "Columbus", "Concord", "Denver"};
    String[][] stateAndCapitalsArray = {{"Alabama", "Alaska", "Arizona", "Arkansas", "California"},
        {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento"}};
    /*
     * A variable is a placeholder for something. On line 14, the variable score is defined as an
     * integer that holds the number 0. If the variable score is used later on, it will represent
     * the number 0.
     */

    // Introduction
    System.out.println("States Quiz");
    System.out.println("");
    System.out.println("Choose the correct capital for each state.");
    System.out.println("For each question you answer correct, you gain 1 point.");
    System.out.println("");

    // Questions


    /*
     * method call is getQuestion and the argument is what is inside the parentheses the state will
     * be a string, the score an int, the answer a string, and choiceArray in string
     */


    q.setQuestion(stateAndCapitalsArray[0][0], stateAndCapitalsArray[1][0], choiceArray, s);
    q.prompt();
    q.setQuestion(stateAndCapitalsArray[0][1], stateAndCapitalsArray[1][1], choiceArray, s);
    q.prompt();
    q.setQuestion(stateAndCapitalsArray[0][2], stateAndCapitalsArray[1][2], choiceArray, s);
    q.prompt();
    q.setQuestion(stateAndCapitalsArray[0][3], stateAndCapitalsArray[1][3], choiceArray, s);
    q.prompt();
    q.setQuestion(stateAndCapitalsArray[0][4], stateAndCapitalsArray[1][4], choiceArray, s);
    q.prompt();

    System.out.println("Your score is " + s.getScoreString());

    if (s.getScore() == 5) {
      String end = "Perfect Score!";
      for (int i = 0; i < end.length(); i++) {
        System.out.print(end.charAt(i));
        sleep(200);
        continue; // continue jumps to the conditional statement for the loop
      }
    }
  }


  public static void sleep(int time) {
    try {
      Thread.sleep(time);
    } catch (Exception e) {
    }

  }

}

/*
 * "Albany", "Annapolis", "Atlanta", "Augusta", "Austin", "Baton Rouge", "Bismarck", "Boise",
 * "Boston", "Carson City", "Charleston", "Cheyenne", "Columbia", "Columbus", "Concord", "Denver",
 * "Des Moines", "Dover", "Frankfort", "Harrisburg", "Hartford", "Helena", "Honolulu",
 * "Indianapolis", "Jackson", "Jefferson City", "Juneau", "Lansing", "Lincoln", "Little Rock",
 * "Madison", "Montgomery", "Montepelier", "Nashville", "Oklahoma City", "Olympia", "Phoenix",
 * "Pierre", "Providence", "Raleigh", "Richmond", "Sacramento", "Salem", "Salt Lake City",
 * "Santa Fe", "Springfield", "St. Paul", "Tallahassee", "Topeka", "Trenton",
 */
