package assignment10_Methods2;

public class Question25 {

	public static void main(String[] args) {

		
		System.out.println(mergeStrings("wooden", "spoon"));
		
	}	
		
		public static String mergeStrings(String str1, String str2 ) {
		
			String first="";
			String next="";
			int length;
			if(str1.length()>str2.length()) {
				length=str2.length();
				next =str1.substring(str2.length(),str1.length());
			}else {
				length=str1.length();
				next =str2.substring(str1.length(),str2.length());
			}
			for(int i=0;i<length;i++) {
				first+=str1.substring(i, i+1)+str2.substring(i, i+1);
			}
         return first+next;
			}   
        	  
		}  
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		/*When gears merge and work together, one tooth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a time,
 starting with one. Please note one and two can be of different lengths. Please look at below examples:

     s1 ==> "12345"
     s2 ==> "abcde"
     mergeStrings(s1,s2) ==> "1a2b3c4d5e"

     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

     mergeStrings("java", "selenium") ==> "jsaevlaenium"
 * 
 */

	


