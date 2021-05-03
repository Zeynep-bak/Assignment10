package assignment10_Methods2;

public class Question28 {

	public static void main(String[] args) {
/*This method gets two strings (text and badWord) and returns a string. 
 *  Basicly what it does is take out all the occurrences of badWord in text.
Sample Output:
     clean ("one two three","two")
     returns "one three"

     clean ("foo bar","foo")
     returns "bar"

     clean ("he said bla bla bla","bla")
     returns "he said "
 */       
		badWord("one two tree","two");
		badWord("he said bla bla bla","bla");
	}
public static void badWord(String str1, String str2) {
	
	if(str1.contains(str2)) {
		String s=str1.replaceAll(str2, "");
	System.out.println(s);
	}
		
}
}
