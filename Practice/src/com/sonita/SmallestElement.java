/*Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Expected Time Complexity: O(n)

Input:
The first line of input contains an integer T, denoting the number of testcases. Then T test cases follow. Each test case consists of three lines. First line of each testcase contains an integer N denoting size of the array. Second line contains N space separated integer denoting elements of the array. Third line of the test case contains an integer K.

Output:
For each testcase, in a newline, print the kth smallest element.

Yout Task:
Complete kthSmallest and return the kth smallest element.

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N

Example:
Input:
2
6
7 10 4 3 20 15
3
5
7 10 4 20 15
4

Output:
7
15

Explanation:
Testcase 1: 3rd smallest element in the given array is 7.
Testcase 2: 4th smallest element in the given array is 15

*/



package com.sonita;

import java.util.Arrays;

public class SmallestElement {

	public static int kthSmallestElement(Integer[] arr, int k)
	{
		Arrays.sort(arr);
		return arr[k-1];
	}
	
	public static void main (String[] args)
	{
		Integer arr[] = new Integer[] {100,43,20, 59,80,78};
		int k=5;
		System.out.println("Kth:"+k+" smallest element is " + kthSmallestElement(arr, k) );
		
	}
}
