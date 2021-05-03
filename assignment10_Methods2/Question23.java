package assignment10_Methods2;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input:");
		String str =sc.next();
		
		int count =0;
		
		for(int i=0;i<str.length()-4;i++) { 
			if(str.substring(i, i+5).equalsIgnoreCase("bread")) {
				count++;
			}
		}
         if(count==2) {
        	String word =str.replace("bread", "");
        	
        	int n1 =word.indexOf("");
        	int n2 =word.lastIndexOf("");
        	
        	if(n1+1==n2) {
        		System.out.println("empty sandwich");
        	}else {
        		System.out.println(word.substring(n1+1,n2));
        	}
        	
         }else {
        	 System.out.println("no sandwich");
         }
	}

}
/*A sandwich is two pieces of bread with something in between.
 *  Print the string that is between the first and last appearance of "bread" in the given string, 
 *  or return string "nothing" if there are not two pieces of bread.
Sample Output:
     input: breadjambread
     output: jam

     input: xxbreadjambreadyy
     output: jam

     input: xxbreadapple
     output: nothing

     input: breadbutterbread
     output: butter
*/