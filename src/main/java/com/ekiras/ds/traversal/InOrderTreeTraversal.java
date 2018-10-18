package com.ekiras.ds.traversal;

import com.ekiras.ds.base.TreeNode;

public class InOrderTreeTraversal {

    public static void main(String[] args) {
        //         1
        //        / \
        //       2   3
        //     /  \   \
        //    4    5   6
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(6);

        inOrder(node);
    }

    private static void inOrder(TreeNode node)
    {
        if(node==null)
            return;
        System.out.print(node.data+" ");
        inOrder(node.left);
        inOrder(node.right);
    }
}
