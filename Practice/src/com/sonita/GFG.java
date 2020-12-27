package com.sonita;

public class GFG {

		/* Class Pair is used to return two values from getMinMax() */

	static class Pair{
		int max;
		int min;
	}
	
	static Pair getMinMax(int arr[], int n)
	{
		Pair minmax = new Pair();
		int i;
		if (n == 1)
		{
			minmax.max = arr[0];
			minmax.min = arr[1];
			return minmax;
		}
		
		 /* If there are more than one elements, then initialize min 
	    and max*/

		if (arr[0]> arr[1]) {
			minmax.max = arr[0];
			minmax.min = arr[1];
		} else
		{
			minmax.max = arr[1];
			minmax.min = arr[0];
		}
		
		for (i=2; i<n; i++)
		{
			if( arr[i] > minmax.max) {
				minmax.max=arr[i];
				
			}else if (arr[i]< minmax.min)
			{
				minmax.min = arr[i];
			}
		}
		
		
		
		return minmax;
	}

		    public static void main(String args[]) {

		        int arr[] = {10, 100, 555, 1, 330, 300};
		        int arr_size = 6;
		        Pair minmax = getMinMax(arr, arr_size);
		        System.out.printf("\nMinimum element is %d", minmax.min);
		        System.out.printf("\nMaximum element is %d", minmax.max);
		    }

}
