Integration Project Milestone 1:
-Add your name as a comment at top of every file
Line 1>
// Stephanie Ali

-Add a description of the program as a comment at top
Line 3>
/* Choose the correct capital for each state. 
   For each question you answer correct, you gain 1 point. */
-Add a list and description of Java built-in data types within the user interface or in comments
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
-Add a greeting / introduction to the user
Line 36>
System.out.println("Choose the correct capital for each state.");
-Use a boolean variable with an appropriate name  (singular noun, lowerCamelCase)
Line 40>
boolean question1 = true;
-Use an int variable with an appropriate name (singular noun, lowerCamelCase)
Line 26>
int score = 0;
-Use an double variable with an appropriate name (singular noun, lowerCamelCase)
Line 204>
double scorePercentage = ((double)score/5)*100;
-Use a String object with an appropriate name (singular noun, lowerCamelCase)
Line 117>
String userInput = scan.next();
-Define (in English) the term "variable" as it relates to computer programming in a comment or the user interface
/* A variable is a placeholder for something. 
	On line 14, the variable score is defined as an integer that holds the number 0.
	If the variable score is used later on, it will represent the number 0. */
-Define (in English) the term "scope" as it relates to computer programming in a comment or the user interface
/* Scope refers to the accessibility of a variable. How large the scope is depends on where the variable was declared.*/
-Use casting and describe what it means in a comment (optional for 1, required for 2)
Line 204>
/*Casting: used when you want to represent a variable's data type as a different data type.
	 Ex: the variable "score" is declared as an int but then it is changed to a double*/
