package assignment10_Methods2;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
	    System.out.print("Enter your sentences ");
		String str =sc.next();
		
		System.out.print("Enter your number ");
		int n =sc.nextInt();
	
	
	int counter=0;
	
	for(int i=0; i<str.length()-(n-1);i++) {
		 if(str.substring(i,i+n).equals(str.substring(0,n))) {
		 counter++;
	}
		
	}	
	if(n<=counter) {
		System.out.println(true+" "+str.substring(0,n)+"  appears "+counter+"  times");
	}else {
		System.out.println(false+" "+str.substring(0,n)+"  appears only "+counter+"  times");
	}	
		
		
		
/*Given a string, consider the prefix string made of the first n chars of the string.
 *  Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().

Sample Output:

     input: abXYabc
     input: 1
     output: true
     a appears twice

     input: abXYabc
     input: 2
     output: true
     ab appears twice

     input: abXYabc
     input: 3
     output: false
     abX appears once only
 * 		
 */

	}

}
