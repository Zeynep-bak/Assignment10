package assignment10_Methods2;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
/*Write a program, that will read HTML variable and output attribute value of id attribute (tag) into the console.
 *  Input will be provided in a single line as outlined below. If HTML variable doesn't contain <html> attribute, 
 *  print out into the console message: "Invalid input!".
Sample Output:
     input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
     output: myid
 * 		
 */
		
		        String input="<!DOCTYPE html><html>"
		                + "<head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		    checkHTMLCode(input);
		        
		    }

		    public static void checkHTMLCode(String input) {
		if (!input.contains("<html>")) {
		    System.out.println("invalid input");
		    return;
		    
		}else {
		    int indexOffirstquad=input.indexOf("\"");
		    int indexOfsecondquad=input.indexOf("\"", indexOffirstquad+1);
		    
		    System.out.println(input.substring(indexOffirstquad+1,indexOfsecondquad));
		}
	
	
	

}
}