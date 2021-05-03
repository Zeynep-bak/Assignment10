package assignment10_Methods2;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
/*Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
 *  such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string should be 4 and more characters.
Sample Output:
     input: javapython
     output: true

     input: cjavac++
     output: true

     input: c#javaruby
     output: false
 * 		
 */

		Scanner sc =new Scanner(System.in);
		System.out.print("input: ");
			String word =sc.next();
			
			boolean result=true;
			
			for(int i=0;i<2;i++) {
				if(word.substring(i,i+4).equals("java")) {
					result=true;
					break;
				}else {
					result=false;
				}
				}
			if(result) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
	}
		
		
		
		
		
		
		
		
		
		
	}


