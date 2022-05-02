package exercises;

public class Exercise3 {

	public static void main(String[] args) {
		question2_1();

	}
	//1.1
	//Imagine an alien was just shot down in a game. 
	//Create a variable called alienColour and assign it a value of 'green', 'yellow', or 'red'.
	//Write an if statement to test whether the alien’s color is green.
	//If it is, display a message that the player just earned 5 points.
	//Try changing the value of the alienColour variable and check that it only displays the message when the value is green. 
	//In all other cases it should display nothing.
	public static void question1_1() {
	String alienColour = "green";
		if(alienColour == "green") {
		System.out.println("Player just earned 5 points");
		}
	}
	//1.2
	//Create two more if statements to deal with red and yellow:
	//•Red - display a message that the player just earned 10 points.
	//•Yellow - display a message that the player just earned 15 points.
	//Try changing the value of the alienColour variable and check that the code in the relevant if statement runs.
	public static void question1_2(){
		String alienColour = "Yellow";
		if(alienColour == "green") {
		System.out.println("Player just earned 5 points");
		}else if (alienColour == "Red") {
			System.out.println("Player just earned 10 points");
		}else if (alienColour == "Yellow"){
			System.out.println("Player just earned 15 points");
		}
	}
	//1.3
	//Merge your 3 if statements from the previous exercise into a single if – else if – else statement. 
	//You should display an extra message of “invalid colour” if the variable alienColour is not set to red, green or yellow.
	//Try changing the value of the alienColour variable and check that the code in the relevant part of the if statement runs.
	public static void question1_3() {
		String alienColour = "green";
		if(alienColour == "green") {
		System.out.println("Player just earned 5 points");
		}else if (alienColour == "Red") {
			System.out.println("Player just earned 10 points");
		}else if (alienColour == "Yellow"){
			System.out.println("Player just earned 15 points");
		}else
		{
			System.out.println("Invalid colour");
		}
	}
	
	//2.1
	//A valid account number will have 8 digits ranging from 10000000 to 99999999.
	//Create an int called accountNumber and put a number in it. 
	//Now write an if statement which checks if the account number is valid or not.
	//It should display either “valid account number” or “invalid account number”.
	//Test your if statements by feeding it valid and invalid account numbers.
	public static void question2_1() {
		int accountNumber = 12548569;
		if(accountNumber >= 10000000 && accountNumber <= 99999999) {
			System.out.println("Valid account number");
		}else
			System.out.println("Invalid account number");
	}
	
	
	



}
