package com.sonita;

public class Palindrome {
	
	public static void main(String [] args) {
		System.out.println(isPalidromString("Ana"));
		System.out.println(isPalidromString("Sonita"));
	}
	
	public static boolean isPalidromString(String text)
	{
		String reverse = reverse(text).toLowerCase();
		if(text.toLowerCase().equals(reverse)){
		return true;
	}

	return false;

	}

	public static String reverse(String input){
	if (input == null || input.isEmpty()){
	return input;
	}
	return input.charAt(input.length() -1) + reverse(input.substring(0,input.length()-1));
	}
}



