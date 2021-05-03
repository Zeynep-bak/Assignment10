package assignment10_Methods2;

public class Question27 {

	public static void main(String[] args) {
		 
		
		
		
		coverString("java methods", "me")  ;// ==> "java [me]thods"


	}
	
	
	public static void  coverString(String str1, String str2) {
		
		if(str1.contains(str2)) {
			String cover= str1.replace(str2, "["+str2+"]");
			System.out.println(cover);
		}else {
			System.out.println("["+str1+"]");
		}
		
		
		
	}
	
	
	
	
	
	
	
/*coverString method will take 2 string parameters from the caller.
Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.
Sample Output:
     coverString("java methods", "me") ) ; ==> "java [me]thods"

     coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

     coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

     coverString("apples", "pears") ) ; ==> "[apples]"
 * 
 */
}
