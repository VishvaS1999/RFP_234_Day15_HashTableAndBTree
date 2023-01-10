package com.HashTableBinaryTree;

class Node
{

    int data;
    Node left;
    Node right;

}
class BinaryTree
{
    public Node insert(Node root, int value)
    {
        if (root == null)
        {
            return NewNode(value);
        }

        if (value < root.data)
        {
            root.left = insert(root.left, value);

        }
        else if (value > root.data)
        {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public Node NewNode(int key)
    {
        Node d1 = new Node();
        d1.data = key;

        d1.left = null;
        d1.right = null;
        return d1;
    }
    public void print(Node root)
    {
        if (root == null)
        {
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }
    public boolean nodePresent(Node root, int value)
    {
        if (root == null)
        {
            return false;
        }
        Boolean isPresent = false;
        while (root != null)
        {
            if (value < root.data)
            {
                root = root.left;
            }
            else if (value > root.data)
            {
                root = root.right;
            }
            else
            {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
}
public class BinaryTreeMain
{
    public static void main(String[] args)
    {
        BinaryTree b1 = new BinaryTree();
        Node root = null;

        root = b1.insert(root, 70);
        root = b1.insert(root, 30);
        root = b1.insert(root, 56);

        b1.print(root);
    }
}
