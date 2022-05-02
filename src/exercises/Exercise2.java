package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise2 {

	public static void main(String[] args) {
		//Call Methods for answers
		question2_2();
	}
	
	//Create an array containing the names of your five best friends.
	//Now do the following with your array:
	//a.Display the number of friends in the array.
	//b.Display each name in the array on a separate line.
	//c.You’re no longer friends with the fifth person in the array. Replace their name with a new friend.
	//d.Sort the array.
	//e.Display the first person in the array.
	//f.Display the last person in the array.
	//g.You’re no longer friends with the second person in the array. Remove their name from the array by replacing it with null. 

	
	
	
	public static void question1_1() {
		String[] bestFriends = {"Swapnil","Jimmy","Ritesh","Nitin","Chirag"};
		System.out.println(bestFriends.length);
		for(int i=0;i<bestFriends.length;i++)
		{
			System.out.println(bestFriends[i]);
			
		}
		bestFriends[4] = "Smit";
		
		Arrays.sort(bestFriends);
		System.out.println(Arrays.toString(bestFriends));
		System.out.println(bestFriends[0]);
		System.out.println(bestFriends[4]);
		bestFriends[1] = "NULL";
		System.out.println(bestFriends.length);
	}
	
	//1.2
	//Create an empty array of Strings called pokerHand with 5 elements.
	//Now do the following with your array.
	//1.	Add the String “Queen of hearts” into the first position in your array.
	//2.	Add the String “3 of spades” into the second position in your array.
	//3.	Add the String “3 of diamonds” into the third position in your array.
	//4.	Add the String “9 of hearts” into the fourth position in your array.
	//5.	Add the String “6 of clubs” into the fifth position in your array.
	public static void question1_2() {
		String[] pokerHand = new String[5];
		pokerHand[0] = "Queen of hearts";
		pokerHand[1] = "3 of spades";
		pokerHand[2] = "3 of diamonds";
		pokerHand[3] = "9 of hearts";
		pokerHand[4] = "6 of clubs";
	}
	
	//2.1
	//Create an ArrayList of type String and call it shoppingBasket.
	//Now do the following with your ArrayList:
	//1.Add the following 5 items into your shopping basket one by one: 
	//milk, cereals, apples, oranges, bread
	//2.Display the number of items in the shopping basket.
	//3.Display the first item in the shopping basket.
	//4.Display the 5th item in the shopping basket.
	//5.Remove bread from the shopping basket then display the number of items in the basket.
	//6.Remove the third item from the shopping basket. Now display the names of all items left in the basket. (should display milk, cereals & oranges)
	//7.Add the following 3 items into the basket: potatoes, olive oil, chicken
	//8.Sort the basket then display the first item and the last item. (should be cereals & potatoes) 
	public static void question2_1() {
		ArrayList<String> shoppingBasket = new ArrayList<String>();
		shoppingBasket.add("milk");
		shoppingBasket.add("cereals");
		shoppingBasket.add("apples");
		shoppingBasket.add("oranges");
		shoppingBasket.add("bread");
		
		System.out.println(shoppingBasket);
		System.out.println(shoppingBasket.get(0));
		System.out.println(shoppingBasket.get(4));
		shoppingBasket.remove("bread");
		System.out.println(shoppingBasket);
		shoppingBasket.remove(2);
		System.out.println(shoppingBasket);
		shoppingBasket.add("potatoes");
		shoppingBasket.add("olive oil");
		shoppingBasket.add("chicken");
		Collections.sort(shoppingBasket);
		System.out.println(shoppingBasket.get(0));
		System.out.println(shoppingBasket.get(5));
	}
	//Create an ArrayList of type Integer and call it salaries.
	//Now do the following with your ArrayList:
	//1.Add the following numbers into salaries: 75000, 25000, 42000, 30000, 55000, 42000, 39000
	//2.Without sorting the salaries show the following information:
	//a.The highest salary 
	//b.The lowest salary 
	//c.The number of people earning 42000 
	//3.Sort the salaries and display the median salary (i.e. the one in the middle)
	//4.Reverse the salaries then display the first and last items.
	public static void question2_2() {
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		salaries.add(75000);
		salaries.add(25000);
		salaries.add(42000);
		salaries.add(30000);
		salaries.add(55000);
		salaries.add(42000);
		salaries.add(39000);
		System.out.println(Collections.max(salaries));
		System.out.println(Collections.min(salaries));
		System.out.println(Collections.frequency(salaries, 42000));
		Collections.sort(salaries);
		System.out.println(salaries.get(3));
		Collections.reverse(salaries);
		System.out.println(salaries);
		System.out.println(salaries.get(0));
		System.out.println(salaries.get(6));
		
		
	}

}
