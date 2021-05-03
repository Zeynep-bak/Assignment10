package assignment10_Methods2;

public class Question26 {

	public static void main(String[] args) {
		
		System.out.println(uniqueChars("javajavavajastjava"));
		
		
	}	
		public static String uniqueChars(String str) {
			String result= "";
			for(int i=0; i<str.length();i++) {
				if(!result.contains(""+str.charAt(i))) {
					result+=str.charAt(i);
				}
		}
		return result;
		}
		
		
		
		
		
		
		
		
		
		
		
/*uniqueChars is a method that you will code now, should be able to accept any string in the word and 
 * return unique characters from the parameter.
Sample Output:
     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon"
 * 		
 */

	}


