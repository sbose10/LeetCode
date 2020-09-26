
/*
*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
*You may assume that each input would have exactly one solution, and you may not use the same element twice.
*Example:
*Given nums = [2, 7, 11, 15], target = 9,
*Because nums[0] + nums[1] = 2 + 7 = 9,
*return [0, 1].
*/



package com.sonita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwo {
	
	public static void main(String args[]) throws IOException{
		//int nums[] = new int[5];
		
		
		
		System.out.println("Please enter the size of the array");
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bfReader.readLine();
		Integer size= Integer.parseInt(input);
		
		int nums[] =new int[size];
		
		for(int i=0; i<size; i++) {
		System.out.println("Please enter number at index "+i);
		BufferedReader bfReaderNum = new BufferedReader(new InputStreamReader(System.in));
		String inputNum = bfReaderNum.readLine();
		
		Integer num= Integer.parseInt(inputNum);
		System.out.println("Number is "+num);
		
		nums[i]=num;
		
		}
		System.out.println("**********");
		System.out.println("Array is");
		for(int i=0; i<size; i++) {
			System.out.println(" "+nums[i]);
		}
		
		System.out.println("Please enter Target");
		BufferedReader bfReaderTarget = new BufferedReader(new InputStreamReader(System.in));
		String target = bfReaderTarget.readLine();
		//int t =Integer.parseInt(target);
		
		int solution[] = sumOfNumbers(nums,Integer.parseInt(target));
		System.out.print("Result is ");
		for(int i=0; i<solution.length; i++)
		System.out.print(solution[i]);
		

	}	
		
	public static  int[] sumOfNumbers (int nums[], int target) {
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j]==target -nums[i]) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
		
}


}

