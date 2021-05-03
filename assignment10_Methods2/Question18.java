package assignment10_Methods2;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
 * separated by the separator string.
Sample Output:
     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This
 */
	Scanner sc =new Scanner(System.in);	
		System.out.print("input first word ");
		String str1 =sc.next();
	
		System.out.print("input second word ");
		String str2 =sc.next();
		
		System.out.print("enter your number ");
		int count =sc.nextInt();
		
	
		
		String finalWord=str1;
		
		for(int i=0;i<count-1;i++) {
			finalWord+=str2+str1;
		}
	System.out.println(finalWord);
		
		
		
		
		

	}
   
	   
   }

