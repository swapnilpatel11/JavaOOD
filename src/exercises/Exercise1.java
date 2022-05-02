package exercises;

public class Exercise1 {

	public static void main(String[] args) {
		//1.1)Store a message in a String, and then display that message.
		System.out.println("Start OOD1");
		
		//1.2)
		//Store your first name in a String variable called firstName. 
		//Store your second name in another String variable called secondName. 
		//Create a third String variable called fullName, 
		//it’s value should be the value of the firstName variable followed by a space followed by the value of the lastName variable. 
		//Display the value of the fullName variable.
		
		String firstName = "Swapnil";
		String lastName = "Patel";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		//1.3) 
		//Store a person’s name in a variable, and print a message to that person. 
		//Your message should be simple, 
		//such as, “Hello Eric, would you like to learn some Java today?”
		String name = "Swap";
		System.out.println("Hello " +name+ ", would you like to learn some Java today?");
		
		//1.4)
		//Store your name in a String. 
		//Now use String methods to display 
		//each of the following pieces of information:
			//The length of your name
			//Your name in upper case
			//The first letter of your name
			//The last letter of your name
		String myName = "Swapnil";
		System.out.println(myName.length());
		System.out.println(myName.toUpperCase());
		System.out.println(myName.charAt(0));
		System.out.println(myName.charAt(6));
		
		//1.5)
		//Create a String which contains the following text: “this is a sentence”. 
		//Now use String methods to display each of the following pieces of information:
		//Display the position of the first space (should be 4)
		//Display the position of the last space (should be 9)
		//Display the position of the first letter x (should be -1)
		//Display the first 4 characters of the String (should show “this”)
		//Display the characters of the String from position 10 onwards (should show “sentence”)
		//Display the characters in positions 5,6,7 & 8 (should show “is a”)
		//Does the sentence contain the letter “a”? Display true or false.
		//Does the sentence contain the letter “x”? Display true or false.
		//Add the text “is “ to the start of the String and “?” to the end of the String and display the new value of the String
		//Replace the first letter “t” with the letter “T” and display the new value of the String
			
		String quote = "this is a sentence";
		System.out.println(quote.indexOf(" "));
		System.out.println(quote.lastIndexOf(" "));
		System.out.println(quote.indexOf('x'));
		System.out.println(quote.substring(0, 4));
		System.out.println(quote.substring(10));
		System.out.println(quote.substring(5,9));
		System.out.println(quote.contains("a"));
		System.out.println(quote.contains("x"));
		System.out.println("is "+quote+"?");
		System.out.println(quote.replaceFirst("t","T"));
		
		//2.1
		//Store your favorite number in an int. 
		//Then, using that variable, create a message that reveals your favorite number. 
		//Display that message.
		int favNum = 11;
		System.out.println("My favorite number is "+favNum);
		
		//2.2
		//Create two int variables. 
		//One should store the number 5 and the other should store the number 3. 
		//Display the value of the two variables added together (i.e. 8).
		int p =5;
		int q =3;
		System.out.println(p+q);
		
		//2.3
		//Create an int variable called counter and give it the value 0;
		//Now do the following:
		//Increment counter (i.e. increase it’s value by one)
		//Add 5 to counter.
		//Decrement counter (i.e. decrease it’s value by one)
		//Subtract 2 from counter.
		//Double counter’s value.
		//Display the value of counter (it should be 6)
		int counter = 0;
		counter ++;
		counter +=5;
		counter --;
		counter -=2;
		counter *= 2;
		System.out.println(counter);
		
		//2.4
		//Create the following int variables:
		//a with a value of 5, b with a value of 2.
		//Create the following double variables.
		//c with a value of 5, d with a value of 2.
		//Display the values of the following:
		//a divided by b
		//c divided by d
		//c divided by b
		//a divided by d
		//What do you notice? How might this affect calculating percentages?
		int a = 5;
		int b = 2;
		double c = 5;
		double d = 2;
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(c/b);
		System.out.println(a/d);
		//int just consider whole number while double gives you decimal points remainder
		
		//3.1
		//Create a char called letter and give it the value of ‘a’.
		//Create an int called code and give it the value of 98.
		//Display the value of the letter variable cast to an int (should be 97)
		//Display the value of the code variable cast to a char (should be ‘b’)
		//Display the value of the number 36 cast to a char (should be a $)
		char letter = 'a';
		int code = 98;
		System.out.println((int)letter);
		System.out.println((char)code);
		System.out.println((char)36);
		
		//3.2
		//Display the value of ‘c’ minus ‘a’ (should be 2)
		//Display the value of ‘z’ minus ‘a’ (should be 25)
		System.out.println('c'-'a');
		System.out.println('z'-'a');
		
		//3.3
		//Create a char called char1 and give it the value ‘x’
		//Create a char called char2 and give it the value ‘y’
		//Create a char called char3 and give it the value ‘z’
		//Create a String called string1 and give it the value “z”
		//Create a String called string2 and give it the value “y”
		//Display the following:
		//char1 + char2 + char3
		//char1 + char2 + string2
		//char1 + string1 + char3
		//What do you notice?
		char char1 = 'x';
		char char2 = 'y';
		char char3 = 'z';
		String string1 = "z";
		String string2 = "y";
		System.out.println(char1+char2+char3);
		System.out.println(string1+string2+char3);
		
		//4.1
		//Create a String called number1 and give it the value “5”.
		//Create a String called number2 and give it the value “3”.
		//Use the parseInt() method of the Integer class to convert the Strings into ints.
		//Add the ints together and display the result (should show 8)
		String number1 = "5";
		String number2 = "3";
		System.out.println(Integer.parseInt(number1)+Integer.parseInt(number2));
		
		//4.2
		//Create a String called number1 and give it the value “5.3”.
		//Create a String called number2 and give it the value “3.2”.
		//Use the parseDouble() method of the Double class to convert the Strings into doubles.
		//Add the doubles together and display the result (should show 8.5)
		String number3 = "5.3";
		String number4 = "3.2";
		System.out.println(Double.parseDouble(number3)+Double.parseDouble(number4));
		
		//4.3
		//Create a String called string1 and give it the value “abc11”.
		//Create a String called string2 and give it the value “9xyz”.
		//Create a String called string3 and give it the value “abc7xyz”.
		//Extract the numbers from the strings, convert them into ints and
		//display the value of them added together (should show 27)
		String str1 = "abc11";
		String str2 = "9xyz";
		String str3 = "abc7xyz";
		int first = Integer.parseInt(str1.substring(3));
		int second = Integer.parseInt(str2.substring(0,1));
		int third = Integer.parseInt(str3.substring(3,4));
		System.out.println(first+second+third);
		
		
		
		
		
	}

}
