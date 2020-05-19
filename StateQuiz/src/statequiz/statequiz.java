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

/* Scope refers to the accessibility of a variable. How large the scope is depends on where the variable was declared.*/

package statequiz;

import java.util.Scanner;

public class statequiz {

	public static void main(String[] args) {
	
	int score = 0;
/* A variable is a placeholder for something. 
	On line 14, the variable score is defined as an integer that holds the number 0.
	If the variable score is used later on, it will represent the number 0. */
	
	Scanner scan = new Scanner(System.in);
	
	//Introduction
	System.out.println("States Quiz");
	System.out.println("");
	System.out.println("Choose the correct capital for each state.");
	System.out.println("For each question you answer correct, you gain 1 point.");
	System.out.println("");
	
	boolean question1 = true;
	while(question1 == true) {

		System.out.println("1. What is the capital of Alabama?");
		System.out.println("");
		System.out.println("A. Connecticut");
		System.out.println("B. Georgia");
		System.out.println("C. Montgomery");
		System.out.println("D. Texas");
		
		System.out.println("");
		System.out.println("Type in the letter choice.");
		
		String userInput = scan.next();
		
		if((userInput.toUpperCase()).equals("C")){
			System.out.println("Correct\n");
			question1 = false;
			score += 1;
		}else if((userInput.toUpperCase()).equals("A")) {
			System.out.println("Incorrect\n");		
			question1 = false;
		}else if((userInput.toUpperCase()).equals("B")) {
			System.out.println("Incorrect\n");		
			question1 = false;
		}else if((userInput.toUpperCase()).equals("D")) {
			System.out.println("Incorrect\n");	
			question1 = false;
		}else {
			System.out.println("Wrong entry. Choose A, B, C, or D.\n");
		}
	}
	Boolean question2 = true;
	while(question2 == true) {
		
		System.out.println("2. What is the capital of Alaska?");
		System.out.println("");
		System.out.println("A. Juneau");
		System.out.println("B. New York");
		System.out.println("C. Oklahoma City");
		System.out.println("D. Charleston");
		
		System.out.println("");
		System.out.println("Type in the letter choice.");
		
		String userInput = scan.next();
		
		if((userInput.toUpperCase()).equals("A")){
			System.out.println("Correct\n");
			question2 = false;
			score += 1;
		}else if((userInput.toUpperCase()).equals("B")) {
			System.out.println("Incorrect\n");		
			question2 = false;
		}else if((userInput.toUpperCase()).equals("C")) {
			System.out.println("Incorrect\n");		
			question2 = false;
		}else if((userInput.toUpperCase()).equals("D")) {
			System.out.println("Incorrect\n");	
			question2 = false;
		}else {
			System.out.println("Wrong entry. Choose A, B, C, or D.\n");
		}
	}
	Boolean question3 = true;
	while(question3 == true) {
		
		System.out.println("3. What is the capital of Arizona?");
		System.out.println("");
		System.out.println("A. Sacramento");
		System.out.println("B. Denver");
		System.out.println("C. Phoenix");
		System.out.println("D. Cheyenne");
		
		System.out.println("");
		System.out.println("Type in the letter choice.");
		
		String userInput = scan.next();
		
		if((userInput.toUpperCase()).equals("C")){
			System.out.println("Correct\n");
			question3 = false;
			score += 1;
		}else if((userInput.toUpperCase()).equals("B")) {
			System.out.println("Incorrect\n");		
			question3 = false;
		}else if((userInput.toUpperCase()).equals("A")) {
			System.out.println("Incorrect\n");		
			question3 = false;
		}else if((userInput.toUpperCase()).equals("D")) {
			System.out.println("Incorrect\n");	
			question3 = false;
		}else {
			System.out.println("Wrong entry. Choose A, B, C, or D.\n");
		}
	}
	Boolean question4 = true;
	while(question4 == true) {
		
		System.out.println("4. What is the capital of Arkansas?");
		System.out.println("");
		System.out.println("A. Trenton");
		System.out.println("B. Little Rock");
		System.out.println("C. Raleigh");
		System.out.println("D. Cheyenne");
		
		System.out.println("");
		System.out.println("Type in the letter choice.");
		
		String userInput = scan.next();
		
		if((userInput.toUpperCase()).equals("B")){
			System.out.println("Correct\n");
			question4 = false;
			score += 1;
		}else if((userInput.toUpperCase()).equals("A")) {
			System.out.println("Incorrect\n");		
			question4 = false;
		}else if((userInput.toUpperCase()).equals("C")) {
			System.out.println("Incorrect\n");		
			question4 = false;
		}else if((userInput.toUpperCase()).equals("D")) {
			System.out.println("Incorrect\n");	
			question4 = false;
		}else {
			System.out.println("Wrong entry. Choose A, B, C, or D.\n");
		}
	}
	Boolean question5 = true;
	while(question5 == true) {
		
		System.out.println("5. What is the capital of California?");
		System.out.println("");
		System.out.println("A. Bismarck");
		System.out.println("B. Nashville");
		System.out.println("C. Salt Lake City");
		System.out.println("D. Sacramento");
		
		System.out.println("");
		System.out.println("Type in the letter choice.");
		
		String userInput = scan.next();
		
		if((userInput.toUpperCase()).equals("D")){
			System.out.println("Correct\n");
			question5 = false;
			score += 1;
		}else if((userInput.toUpperCase()).equals("A")) {
			System.out.println("Incorrect\n");		
			question5 = false;
		}else if((userInput.toUpperCase()).equals("B")) {
			System.out.println("Incorrect\n");		
			question5 = false;
		}else if((userInput.toUpperCase()).equals("C")) {
			System.out.println("Incorrect\n");	
			question5 = false;
		}else {
			System.out.println("Wrong entry. Choose A, B, C, or D.\n");
		}
	}
	
	//Score Result
	System.out.println("\n\n\n\n\n\n\n\n");
	System.out.println("Your score is " + (score) + "/5");
	double scorePercentage = ((double)score/5)*100;
	System.out.println((int)scorePercentage + "%");	
	System.out.println("\n\n\n\n\n\n\n\n");

  }
}
