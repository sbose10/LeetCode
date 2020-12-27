package com.sonita;
/*Given a list of strings words representing an English Dictionary, find the longest word in words that can be built one character 
at a time by other words in words. If there is more than one possible answer, return the longest word with the smallest lexicographical
order.
If there is no answer, return the empty string.
Example 1:
Input: 
words = ["w","wo","wor","worl", "world"]
Output: "world"
Explanation: 
The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".

Input: 
words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
Output: "apple"
Explanation: 
Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply"
*/



import java.util.Arrays;
import java.util.HashSet;

public class LongestWord {
	
	
	
	    public static String longestWord(String[] words) {
	        
	        Arrays.sort(words);
	        
	        HashSet<String> builtWords = new HashSet();
	        String result= "";
	        for (String w: words)
	        {
	            if(w.length()==1 || builtWords.contains(w.substring(0,w.length()-1)))
	            {
	                if (w.length() > result.length())
	                    result=w;
	            builtWords.add(w);
	        }
	        
	    }
	        return result;
	}
	    
	    public static void main (String[] args)
	    {
	    	String result= "";
	    	String words[] = new String[] {"w","wo","worl","world","wor"};
	    	System.out.print(result +longestWord(words));
	    
	    }
	    
	}

	
	
	
	

