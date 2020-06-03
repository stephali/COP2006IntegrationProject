// Stephanie Ali

/* Choose the correct capital for each state. 
   For each question you answer correct, you gain 1 point. */

/* Primitive Data Types
   byte: holds a whole number > only takes 1 byte > -128 to 127
   short: holds a whole number > takes up 2 bytes > -32768 to 32767
   int: holds a whole number > takes up 4 bytes
   long: supports bigger numbers > takes up 8 bytes 
   float: holds a decimal value > stores up to 6-7 digits
   double: holds a decimal value > stores up to 15 digits
   boolean: declares a variable true or false
   char: holds letter characters > ASCII */

// Scope refers to the accessibility of a variable. How large the scope is depends on where the variable was declared.

// Operator precedence determines the order operators in an expression are evaluated

package statequiz;

import java.util.Random;
import java.util.Scanner;

public class StateQuiz {

	public static void main(String[] args) {

		int playerScore = 0;
		/*
		 * A variable is a placeholder for something. On line 14, the variable score is
		 * defined as an integer that holds the number 0. If the variable score is used
		 * later on, it will represent the number 0.
		 */

		// Introduction
		System.out.println("States Quiz");
		System.out.println("");
		System.out.println("Choose the correct capital for each state.");
		System.out.println("For each question you answer correct, you gain 1 point.");
		System.out.println("");

		// Questions

		String[] choiceArray = new String[] { "Albany", "Annapolis", "Atlanta", "Augusta", "Austin", "Baton Rouge",
				"Bismarck", "Boise", "Boston", "Carson City", "Cheyenne", "Columbia", "Columbus", "Concord", "Denver" };
		/*
		 * method call is getQuestion and the argument is what is inside the parentheses
		 * the state will be a string, the score an int, the answer a string, and
		 * choiceArray in string
		 */
		playerScore = getQuestion("Alabama", playerScore, "Montgomery", choiceArray);
		playerScore = getQuestion("Alaska", playerScore, "Juneau", choiceArray);
		playerScore = getQuestion("Arizona", playerScore, "Phoenix", choiceArray);
		playerScore = getQuestion("Arkansas", playerScore, "Little Rock", choiceArray);
		playerScore = getQuestion("California", playerScore, "Sacramento", choiceArray);

		System.out.println("Your score is " + playerScore + "/5");

		if (playerScore == 5) {
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

	// This next line is the header for the method
	public static int getQuestion(String state, int score, String answer, String[] choiceArray) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			Random rand = new Random();

			int randChoiceOne = rand.nextInt(14) + 1;
			int randChoiceTwo = rand.nextInt(14) + 1;
			int randChoiceThree = rand.nextInt(14) + 1;
			int randPosition = rand.nextInt(3) + 1;

			System.out.println("What is the capital of " + state + "?\n");
			String correctChoice = "";

			switch (randPosition) {
			case 0:
				System.out.println("A. " + answer);
				System.out.println("B. " + choiceArray[randChoiceOne]);
				System.out.println("C. " + choiceArray[randChoiceTwo]);
				System.out.println("D. " + choiceArray[randChoiceThree]);
				correctChoice = "A";
				break;
			case 1:
				System.out.println("A. " + choiceArray[randChoiceOne]);
				System.out.println("B. " + answer);
				System.out.println("C. " + choiceArray[randChoiceTwo]);
				System.out.println("D. " + choiceArray[randChoiceThree]);
				correctChoice = "B";
				break;
			case 2:
				System.out.println("A. " + choiceArray[randChoiceOne]);
				System.out.println("B. " + choiceArray[randChoiceTwo]);
				System.out.println("C. " + answer);
				System.out.println("D. " + choiceArray[randChoiceThree]);
				correctChoice = "C";
				break;
			case 3:
				System.out.println("A. " + choiceArray[randChoiceOne]);
				System.out.println("B. " + choiceArray[randChoiceTwo]);
				System.out.println("C. " + choiceArray[randChoiceThree]);
				System.out.println("D. " + answer);
				correctChoice = "D";
				break;
			}

			System.out.println("\nType in the letter choice.");

			String userInput = scan.next();

			if ((userInput.toUpperCase()).equals(correctChoice)) {
				System.out.println("Correct\n");
				score += 1;
				break;
				// == method checks for the instances of the two objects not the actual value while equals does check for the value
			} else if (!(userInput.toUpperCase()).equals(correctChoice)) {
				System.out.println("Incorrect");
				break; // break takes you out of a loop
			} else {
				System.out.println("Wrong entry. Choose A, B, C, or D.\n");
			}
		}
		return score;
	}
}

/*
 * "Albany", "Annapolis", "Atlanta", "Augusta", "Austin", "Baton Rouge",
 * "Bismarck", "Boise", "Boston", "Carson City", "Charleston", "Cheyenne",
 * "Columbia", "Columbus", "Concord", "Denver", "Des Moines", "Dover",
 * "Frankfort", "Harrisburg", "Hartford", "Helena", "Honolulu", "Indianapolis",
 * "Jackson", "Jefferson City", "Juneau", "Lansing", "Lincoln", "Little Rock",
 * "Madison", "Montgomery", "Montepelier", "Nashville", "Oklahoma City",
 * "Olympia", "Phoenix", "Pierre", "Providence", "Raleigh", "Richmond",
 * "Sacramento", "Salem", "Salt Lake City", "Santa Fe", "Springfield",
 * "St. Paul", "Tallahassee", "Topeka", "Trenton",
 */
