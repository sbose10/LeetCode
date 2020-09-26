/* Reverse a string and print the length */ 

package com.sonita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.out.println("Enter a string");
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bfReader.readLine();
		//Integer size= Integer.parseInt(input);
		System.out.println("Entered string is "+ input);
		
		reverseWords(input) ;
		
	}
	
	public static String reverseWords(String input) {
		if (input == null || input.length() == 0) {
			return input;
		}
		System.out.println(" The length is" +input.length());
		input = input.trim();
		
		System.out.println("the trim "+ input);
		System.out.println(" The length of the string is " +input.length());
		
		
		String[] array = input.split("\\s+");
		StringBuilder sb = new StringBuilder();
		int len = array.length;
		System.out.println("Length of array is: "+len);
		for (int i = len - 1; i >= 0; i--) {
			sb.append(array[i]).append(" ");
			System.out.println(array[i]);
			
		}
	//	sb.append(array[0]);
		for (int i = len-1; i >= 0; i--) {
		System.out.print(array[i]+" ");
		}
	//	System.out.print(array[0]);
		return sb.toString();
		
		
}
}