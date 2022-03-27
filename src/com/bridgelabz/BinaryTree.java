package com.bridgelabz;

public class BinaryTree {


    public INode insert(INode root, int val) {

        if (root == null) {
            return craeteNewNode(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;

    }
    public INode craeteNewNode(int k) {
        INode bst = new INode();

        bst.data = k;
        bst.left = null;
        bst.right = null;
        return bst;
    }

    public void print(INode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);

    }

}


