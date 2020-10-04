/*
  Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 Find all the elements that appear twice in this array.
 Could you do it without extra space and in O(n) runtime?

	Example:
	Input:
	[4,3,2,7,8,2,3,1]

	Output:
	[2,3]
 */
package com.sonita;
import java.util.ArrayList;
import java.util.List;

public class DuplicateValue {
	
	
	public static void main(String[] args)
	{
		int nums[]= new int[]{4,3,2,7,8,2,3,1}; 
		System.out.println("Array Elements are:");
		for (int i=0; i<nums.length; i++) {
		System.out.print(nums[i]);
		}
		findDuplicates(nums);
	}
	public static List<Integer> findDuplicates(int [] nums)
	{
	List<Integer> output_arr = new ArrayList<Integer>();
	for (int i=0; i<nums.length; i++)
	{
	int index = Math.abs(nums[i])-1;
	if(nums[index]<0) output_arr.add(index+1);
	nums[index]= -nums[index];
	}
	System.out.println("\nThe duplicated values are: "+output_arr);
	return output_arr;
	}

}
