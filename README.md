# States & Capitals Quiz

## Milestone 1

**Add your name as a comment at top of every file**  
Line 1>
// Stephanie Ali

**Add a description of the program as a comment at top**  
Line 3>
/* Choose the correct capital for each state. 
   For each question you answer correct, you gain 1 point. */
   
**Add a list and description of Java built-in data types within the user interface or in comments**  
Line 6>
/* Primitive Data Types
   byte: holds a whole number > only takes 1 byte > -128 to 127
   short: holds a whole number > takes up 2 bytes > -32768 to 32767
   int: holds a whole number > takes up 4 bytes
   long: supports bigger numbers > takes up 8 bytes 
   float: holds a decimal value > stores up to 6-7 digits
   double: holds a decimal value > stores up to 15 digits
   boolean: declares a variable true or false
   char: holds letter characters > ASCII */
   
**Add a greeting / introduction to the user**  
Line 36>
System.out.println("Choose the correct capital for each state.");

**Use a boolean variable with an appropriate name  (singular noun, lowerCamelCase)**  
Line 40>
boolean question1 = true;

**Use an int variable with an appropriate name (singular noun, lowerCamelCase)**  
Line 26>
int score = 0;

**Use an double variable with an appropriate name (singular noun, lowerCamelCase)**  
Line 204>
double scorePercentage = ((double)score/5)*100;

**Use a String object with an appropriate name (singular noun, lowerCamelCase)**  
Line 117>
String userInput = scan.next();

**Define (in English) the term "variable" as it relates to computer programming in a comment or the user interface**  
Line 27>
/* A variable is a placeholder for something. 
	On line 14, the variable score is defined as an integer that holds the number 0.
	If the variable score is used later on, it will represent the number 0. */
	
**Define (in English) the term "scope" as it relates to computer programming in a comment or the user interface**  
Line 16>
/* Scope refers to the accessibility of a variable. How large the scope is depends on where the variable was declared.*/

**Use casting and describe what it means in a comment (optional for 1, required for 2)**  
Line 204>
/*Casting: used when you want to represent a variable's data type as a different data type.
	 Ex: the variable "score" is declared as an int but then it is changed to a double*/

## Milestone 2
**Create a method with arguments and return values**  
Line 79>
public static int getQuestion(String state, int score, String answer, String[] choiceArray) {

**Identify a method call and argument in comments**  
 Line 47> Line 52>
 playerScore = getQuestion("Alabama", playerScore, "Montgomery", choiceArray);
 
**Identify a header and parameter in comments**  
Line 77>
// This next line is the header for the method
	public static int getQuestion(String state, int score, String answer, String[] choiceArray) {

**Use the Random class**  
Line 56 in Questions.java>
int randChoiceOne = rand.nextInt(14) + 1;
int randChoiceTwo = rand.nextInt(14) + 1;
int randChoiceThree = rand.nextInt(14) + 1;
int randPosition = rand.nextInt(3) + 1;

**Use the Math class**  


**Create if/else constructs**  
Line 126>
if ((userInput.toUpperCase()).equals(correctChoice)) {
	System.out.println("Correct\n");
	score += 1;
	break;
	// == method checks for the instances of the two objects not the actual value
	// while equals does check for the value
	} else if (!(userInput.toUpperCase()).equals(correctChoice)) {
	System.out.println("Incorrect");
	break; // break takes you out of a loop
	} else {
	System.out.println("Wrong entry. Choose A, B, C, or D.\n");
	}

**Create ternary constructs**  


**Use a switch statement**  
Line 91>
switch (randPosition) {

**Compare two String objects by using the compareTo and equals methods and make a comment describing how == works with objects**  
Line 130>
// == method checks for the instances of the two objects not the actual value while equals does check for the value
} else if (!(userInput.toUpperCase()).equals(correctChoice)) {

**Use +, -, *, /, %, ++, --, +=**  
Throughout

**Use relational operators**  
Line 62>
for (int i = 0; i < end.length(); i++) {

**Use conditional operators**  
Line 131>
} else if (!(userInput.toUpperCase()).equals(correctChoice)) {

**Describe operator precedence as a comment**  
Line 18>
// Operator precedence determines the order operators in an expression are evaluated

**Create and use while loops**  
Line 79>
while (true) {

**Create and use for loops**  
Line 62>
for (int i = 0; i < end.length(); i++) {

**Create and use do/while loops**  


**Use break in a loop with a comment describing what it does**  
Line 133>
break; // break takes you out of a loop

**Use continue in a loop with a comment describing what it does**  
Line 65>
continue; // continue jumps to the conditional statement for the loop

## Milestone 3

**Make a class in a separate file with private fields, public getters and setters, a constructor with and without parameters**  
Score.java & Questions.java

**Overload a method**  
line 11>  
public String getScoreString() {
    return Integer.toString(Score) + scoreString;
   
**Describe inheritance and its benefits**  
line 23>  
/*
 * Inheritance is a mechanism in java that allows classes to inherit (or use) other classes fields &
 * methods. It is very beneficial because instead of writing the same code over and over for each
 * class, you can just inherit all the features you need from a parent class. It saves up more
 * space.
 */
   
**Describe polymorphism**  
line 30>  
/*
 * Polymorphism is when objects take on many forms. For example, the parent class sets attributes
 * for all of it's child classes. Polymorphism is when a class changes attributes that the parent
 * class had already set.
 */

**Declare, instantiate, initialize and use a one-dimensional array**  
line 49>  
 String[] choiceArray = new String[] {"Albany", "Annapolis", "Atlanta", "Augusta", "Austin",
        "Baton Rouge", "Bismarck", "Boise", "Boston", "Carson City", "Cheyenne", "Columbia",
        "Columbus", "Concord", "Denver"};

**Declare, instantiate, initialize and use multi-dimensional arrays**  
line 52>  
  String[][] stateAndCapitalsArray = {{"Alabama", "Alaska", "Arizona", "Arkansas", "California"},
        {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento"}};
    /*

**Effectively utilize exception handling for user input of an int**  
line 103>  
public static void sleep(int time) {
    try {
      Thread.sleep(time);
    } catch (Exception e) {
    }
