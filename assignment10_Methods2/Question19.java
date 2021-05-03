package assignment10_Methods2;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
/*Return the number of times that the string "java" appears anywhere in the given string word.
Sample Output:
     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Input:");
		String sentence =sc.next();
		
		String word="java";
		int count =0;
		while(sentence.contains(word)) {
			sentence=sentence.replaceFirst(word, "");
			count++;
		}
		System.out.println(count);
		
		
	}

}
