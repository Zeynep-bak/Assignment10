package assignment10_Methods2;

public class Question29 {

	public static void main(String[] args) {
/*This method gets a string and an int, it returns a string.
 *  What it does is to limit the inputted string to a creating number of characters.
Sample Output:
     limit("abcd",2)
     returns "ab"

     limit("bla bla",3)
     returns "bla"
 */     
		limit("abcd",2);
		limit("bla bla",3);
    
	}
   public static String limit(String str,int index) {
         String  result = str.substring(0,index);
         System.out.println(result);
         return result;
}
}