package exercises;

import java.util.ArrayList;

public class Exercise4 {

	public static void main(String[] args) {
			question1_7();

	}
	//Create an array of Strings called courses which contains the following items: 
	//“UNIX”, ”SQL”, ”Java”, ”Python”, ”Web Apps”. 
	//Use a for each loop to display all of the courses. 
	//Modify the loop to display a sentence instead of just the course name. 
	//e.g. 	“I love learning UNIX”
	//“I love learning SQL”   
	public static void question1_1() {
		String[] courses = {"UNIX","SQL","Java","Python","Web Apps"};
		for(String c : courses){
			System.out.println("I love learning " + c);
		}
	}
	
	//Create an ArrayList of type String called coursesList. 
	//Use a for each loop to copy all the items from the courses array you created in the previous question into the ArrayList.
	public static void question1_2() {
		String[] courses = {"UNIX","SQL","Java","Python","Web Apps"};
		ArrayList<String> coursesList = new ArrayList<String>();
		for(String c : courses) {
			coursesList.add(c);
		}
		System.out.println(coursesList);
	}
	//1.7
	//Create a String containing the following text: “desrever neeb sah txet siht”. 
	//Use the String’s toCharArray() method to create an array of chars containing each of the letters from the String. 
	//Finally use a “for each” loop to create a new String which contains all the letters of the original String in reverse order.
	//Display the new String. 
	public static void question1_7() {
		String text = "desrever neeb sah txet siht";
		char[] chararray = text.toCharArray();
		String newstr = "";
		for(char i: chararray) {
			
			newstr += i;
		}
		System.out.println(newstr);
	}
}
