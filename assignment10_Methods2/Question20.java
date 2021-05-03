package assignment10_Methods2;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
/*In mathematics, the factorial of a positive integer n, denoted by n!,
 *   is the product of all positive integers less than or equal to n.
 *    Calculate factorial and output result to the console.
Sample Output:
     input: 5
     output: 120   */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number ");
		int number =sc.nextInt();
	
	int factorial=1;
	while(number>0) {
		factorial*=number;
		number--;
	}
	System.out.println("Your number faktorial is "+factorial);	
		
		
		
		
	}

}
