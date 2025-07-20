package exercises;

public class MockAssessment {

	public static void main(String[] args) {
		// Method to return prime number or not
		//Prime Number = not divided by any number except 1 or itself
		boolean y = IsPrimeNumber(11);
		System.out.println(y);
		
		//Counter
		String inputString = "This is Swapnil. Swapnil the count of the selected word test.";
        String selectedWord = "Swapnil";

        int occurrences = countWordOccurrences(inputString, selectedWord);
        System.out.println("The word \"" + selectedWord + "\" occurs " + occurrences + " times.");
		

	}
	public static boolean IsPrimeNumber(int x){
	    for(int i=2; i< x; i++){
	       if(x % i == 0){
	           return false;
	       }
	       
	    }
	    return true;
	    
}
	
	    public static int countWordOccurrences(String inputString, String selectedWord) {
	        int count = 0;
	        String[] words = inputString.split("\\s+"); // Split the input string into individual words

	        for (String word : words) {
	            if (word.equals(selectedWord)) {
	                count++;
	            }
	        }

	        return count;
	    }

	   
	

	
	


}
