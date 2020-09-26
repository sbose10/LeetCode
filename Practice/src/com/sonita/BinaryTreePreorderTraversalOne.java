package com.sonita;

import java.util.ArrayList;
import java.util.List;

//import org.junit.Test;

//import static org.junit.Assert.*;
public class BinaryTreePreorderTraversalOne {
	
	//@Test
	public static void main(String[] args) throws Exception {
		testPreorderTraversal();

	}
	public static void testPreorderTraversal() throws Exception {
        TreeNode t0 = new TreeNode(0);

        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n0.left = n1;
        n0.right = n2;
        n1.left = n3;
        n1.right = n4;
        n4.left = n5;
        n2.right = n6; 


        ArrayList<TreeNode> inputes = new ArrayList<TreeNode>();
        inputes.add(t0);
        inputes.add(n0);
        
        for(int i=1 ;i<inputes.size();i++)
        {	
        	System.out.println("Current Node");
        System.out.println((inputes.get(i)).val);
        System.out.println("Right Node");
        System.out.println(((inputes.get(i)).right).val);
        System.out.println("Left Node");
        System.out.println(((inputes.get(i)).left).val);
        
        }
        List<List<Integer>> results = new ArrayList<List<Integer>>(){{
            add(new ArrayList<Integer>(){{
                   add(0);
            }});
            add(new ArrayList<Integer>(){{
                add(0);
                add(1);
                add(3);
                add(4);
                add(5);
                add(2);
                add(6);
            }});
        }};

        BinaryTreePreorderTraversal b = new BinaryTreePreorderTraversal();
        for (int i = 0; i < results.size(); i++) {
            List<Integer> r = b.preorderTraversal(inputes.get(i));
         //   assertEquals(results.get(i), r);
        }

    }

}

