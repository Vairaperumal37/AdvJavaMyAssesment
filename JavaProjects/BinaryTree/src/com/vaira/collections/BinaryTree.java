package com.vaira.collections;

public class BinaryTree {  
	
	class Node{
		public Node(int value) {
			this.value = value;
			right = null;
			left = null;
		}
		int value;
		Node left;
		Node right;

	}
	
	Node root;
	int size = 0;

	public Node insert(Node root,int value)
	{
		if(root == null)
		{
			root = new Node(value);
		}
		
		if (value < root.value)
		{
			root.left = insert(root.left,value);
		}
		else if(value > root.value)
		{
			root.right = insert(root.right,value);
		}
		return root;
		
	}
	
	public void add(int value)
	{
		root = insert (root,value);
		size++;
	}
	
	public void inOrder(Node root) {
		
		if(root == null)
		{
			return;
		}
		
		inOrder(root.left);
		System.out.println(root.value + "");
		inOrder(root.right);
		
	}
	
	 public void preOrder(Node root) {
		 
		 if(root == null)
			{
				return;
			}
			System.out.println(root.value + "");
			preOrder(root.left);
			preOrder(root.right);
	 }
	 public void postOrder(Node root) {
		 
		 if(root == null)
			{
				return;
			}
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.value + "");
	 }

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	 
}