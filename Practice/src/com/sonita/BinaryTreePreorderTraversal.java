package com.sonita;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreePreorderTraversal {
		
		//Version 1: Traverse
	    List<Integer> preorderTraversal(TreeNode root)
	    {
	        List<Integer>  results = new ArrayList<Integer>();
	        traversal(results, root);
	        return results;

	    }
	

		public static void traversal(List<Integer> results, TreeNode root) {
			
			
	        if (results == null || root == null) {
	            return;
	        }
	        results.add(root.val);
	        traversal(results, root.left);
	        traversal(results, root.right);
	    }

}



