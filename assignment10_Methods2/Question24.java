package assignment10_Methods2;

public class Question24 {

	public static void main(String[] args) {
		
		String str ="What is the difference between java , javascript and python?";
		
		int javaNum=0;
		int pyhtonNum=0;
		
		for(int i=0; i<str.length()-3;i++) {
			if(str.substring(i,i+4).equals("java")) { 
				javaNum+=1;
			}
			for(int j=0; j<str.length()-5;j++) {
				if(str.substring(j,j+6).equals("pyhton")) { 
					pyhtonNum+=1;
		}
		if(pyhtonNum != javaNum) {
			System.out.println("false");
			
		}else {
			System.out.println("true");
			
		}
	
			}
			
		}
		
		
/*Given a string, print out true if the number of appearances of "java" 
 * anywhere in the string is equal to the number of appearances of "python"
 *  anywhere in the string (case sensitive).
Sample Output:
     input: We study java not python
     output: true

     input: What's the difference between java, javascript and python?
     output: false*/


	}

}
