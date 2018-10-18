package com.ekiras.ds.traversal;

import com.ekiras.ds.base.TreeNode;

public class PreOrderTreeTraversal {

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

        preOrder(node);
    }

    private static void preOrder(TreeNode node)
    {
        if(node==null)
            return;
        preOrder(node.left);
        System.out.print(node.data+" ");
        preOrder(node.right);
    }

}
