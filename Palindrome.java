/* This program prompts the user to enter a string and checks it the string is a Palindrome.
 * 
 * @author Haroon
 * 
 * Date: April 1st, 2020
 * 
 * © 2020 Haroon Aziz All Rights Reserved
 */
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean forever=true;
		
		while(forever) {
		
		try {
		System.out.println("Enter a String to see if it is a Palindrome");
		System.out.print("(You can also try 'Race Car'): ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String S = input.nextLine();

		if (S.equalsIgnoreCase("race car")) {
			S = S.replace(" ", "");
			reverseString(S);
		}
		else {
			reverseString(S);
	
	}	System.out.println();
		System.out.println("Try another String.");
		System.out.println();
		
		} catch(Exception e) {
			System.out.println("OOPS!! Something went wrong. Please Try Again");
		}
	}//while	

}//main

	public static String reverseString(String s) {

		String reverseString = "";

		int sLength = s.length();
		for (int i = sLength - 1; i >= 0; i--) {

			reverseString += s.charAt(i);
			System.out.println(reverseString);
		}

		System.out.println("The reverse String is " + reverseString);

		boolean palindrome = true;

		for (int i = 0; i < sLength; i++) {
			if (s.charAt(i) != reverseString.charAt(i)) {

				palindrome = false;
			}

		}

		if (palindrome) {

			System.out.println(s + " is a PALINDROME!");
		} else {
			System.out.println(s + " is not a palindrome");
		}

		return s;
	
	}

}
