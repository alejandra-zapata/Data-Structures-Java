
public class RecursiveMethods {
	
	//Recursive method to determine whether a String contains a 'q' not immediately followed by a 'u' (ignoring capitalization)
	public static boolean qNotFollowedByU(String word) {
		if(word.length() > 0) {
			return qNotFollowedByUHelper(word, 0);
		}
		return false;
	}
	
	private static boolean qNotFollowedByUHelper(String word, int index) {
		if(word.length() == 1 && (word.equalsIgnoreCase("q"))) { //single string 
			return true;
		}
		if(index < word.length() - 1) {
			String currentChar = word.charAt(index) + "";
			String nextChar = word.charAt(index + 1) + "";
			
			if(currentChar.equalsIgnoreCase("q") && !nextChar.equalsIgnoreCase("u")) {
				return true;
			}
			if(nextChar.equalsIgnoreCase("q") && index == word.length() -2) { //q as last character
				return true;
			}
			return qNotFollowedByUHelper(word, index + 1);
		}
		return false; //all string checked and not 'q not followed by u' found.
	}

	//Recursive void method that reverses the contents of an array:
	public static void reverseArray(int[] array) {
		if(array.length > 1) {
			reverseArrayHelper(array, 0, array.length -1);
		}
	}
	
	public static void reverseArrayHelper(int[] array, int start, int stop) {
		if(start< stop) {
			int temp = array[start];
			array[start] = array[stop];
			array[stop] = temp;
			
			reverseArrayHelper(array, start + 1, stop - 1);			
		}
	}

	//A printing method for testing purposes:
	public static void printReverse(int[] array) {
		System.out.print("[");
		for(int i=array.length-1; i>0; i--) {
			System.out.print(array[i] + ", ");
		}
		if(array.length>0) {
			System.out.print(array[0]);
		}
		System.out.println("]");
	}
	
	//Recursive method to print the values at indices that are multiple of some number:
	public static void printValuesAtMultipleIndices(int[] nums, int indexMultiple) {
		if(nums != null) {
			printValuesAtMultipleIndicesHelper(nums, indexMultiple, 0);
		}
	}
	
	private static void printValuesAtMultipleIndicesHelper(int[] nums, int indexMultiple, int index) {
		if(index >= 0 && index < nums.length) { //recursive case
			System.out.print(nums[index] + "\n");
			printValuesAtMultipleIndicesHelper(nums, indexMultiple, index + indexMultiple);	
		}//implicit base case when index >= nums.length
	}
}

	
