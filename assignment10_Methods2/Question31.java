package assignment10_Methods2;

import utilities.Palindrome;
import utilities.StringUtility;

public class Question31 {

	public static void main(String[] args) {
/*Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
So method isPalindrome checks that and returns true if check is palindrome and false if it is not.
- make your conditions case insensitive. ex: Civic and civic are both palindromes
- make your conditions space insensitive. Race car is a palindrome even though there is space in between.
Sample Output:
     isPalindrome("Noon") ==> true
     isPalindrome("I am not palindrome") ==> false
     isPalindrome("wooden") ==> false
     isPalindrome("Nurses Run") ==> true
 */
		 isPalindrome("Noon");
		 isPalindrome("I am not palindrome");
		 isPalindrome("Nurses Run");
	}
  public static void isPalindrome(String str) {

		String dummy = "";  //for space
		
		for(int i=str.length()-1; i>=0;i--) {
			
			dummy=dummy +str.charAt(i);
			
		}
		if(str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		return ;
  }
  
}
