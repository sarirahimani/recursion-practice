package question1;
//Import the Scanner
import java.util.Scanner;
/*@author Sahara Karima Mosin Rahimani
 * This program contains three static 
 * recursive methods to calculate 
 * the number of digits in an int, 
 * to reverse a string and to 
 * calculate the value of a^n 
 * and a main method for user input 
 * and to display the results.
 */

public class recursion {

	/*For all static recursive methods we first set the base cases
	 and then we set the recursive case(s). 
	 rExponent- for the recursive case we use the formula 
	 a^n = a x a^(n-1) to calculate the exponent. 
	 rString- to get the reversed string we add the last letter 
 	 of the original string plus the reverse of the rest.
  	 rDigits- to get the number of digits we use the formula n/10.
	 */
	public static int rExponent(int base,int pwr) {
		if(base==1 || base==0) {
			return base;
		}if(pwr==0) {
			return 1;
		}if(pwr==1) {
			return base;
		}
		return base*rExponent(base,pwr-1);
	}
	
	
	public static String rString(String normalStr) {
		if(normalStr.length()<=1) {
			return normalStr;
		}
		
		return rString(normalStr.substring(1)) + normalStr.charAt(0);

	}
	public static int rDigits(int digit) {
		if(digit<10) {
			return 1;
		}
		return 1 + rDigits(digit / 10);
		
		
	}

	public static void main(String[] args) {
		//we create the scanner object
		Scanner keyboard=new Scanner(System.in);
		int base;
		int exp;
		int number;
		String sentence;
		
		//We prompt the user to enter all the required information and then we display the results.
		System.out.print("Enter two numbers first a base and then an exponent:");
		base=keyboard.nextInt();
		exp=keyboard.nextInt();
		System.out.println(base+" to the power of "+exp+" equals to: "+rExponent(base,exp));
		keyboard.nextLine();
		System.out.print("Enter a String:");
		sentence=keyboard.nextLine();
		System.out.println("reversed string: "+rString(sentence));
		System.out.print("Enter a number:");
		number=keyboard.nextInt();
		System.out.println("The number of digits: "+rDigits(number));

		keyboard.close();
		
	}
}

