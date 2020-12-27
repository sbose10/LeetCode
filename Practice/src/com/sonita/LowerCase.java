package com.sonita;

//LeetCode 709 Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.




public class LowerCase {
	
	
	    public static String toLowerCase(String str) {
	        
	        String result="";
	        
	        for ( char c: str.toCharArray())

	        {
	            if(Character.isUpperCase(c))
	            {
	                result= result + (char)(c+32);
	            }
	            
	            else
	            {
	                result = result+c;
	            }
	        }
	        
	        return result;
	    }
	    public static void main (String[] args)
	    {
	       System.out.print( toLowerCase("Hello"));
	    }

}
