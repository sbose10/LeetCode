/*
 Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
Note:
Then length of the input array is in range [1, 10,000].
The input array may contain duplicates, so ascending order here means <=.
 */


package com.sonita;

import java.util.Arrays;

public class SortedSubarray {
	
	public static void main(String args[])
	{
		//findUnsortedSubarray(nums);
	}
	
	 public  int findUnsortedSubarray(int[] nums) {

		 int[] snums = nums.clone();
		 Arrays.sort(snums);
		 int start = snums.length, end = 0;
		 for (int i=0; i< snums.length; i++)
		 {
			 if (snums[i] != nums[i])
			 {
				 start = Math.min(start, i);
				 end =Math.max(end, i);
			 }
		 }
		 return (end-start >=0 ? end -start +1 :0);

}
}


