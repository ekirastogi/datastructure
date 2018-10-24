package com.ekiras.ds.trees.traversal;

import com.ekiras.ds.base.TreeNode;

public class PostOrderTreeTraversal {

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

        postOrder(node);
    }

    private static void postOrder(TreeNode node)
    {
        if(node==null)
            return;
        postOrder(node.right);
        postOrder(node.left);
        System.out.print(node.data+" ");
    }
}
