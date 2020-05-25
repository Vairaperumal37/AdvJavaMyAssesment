package com.vaira.collections;

public class Main {

	public static void main(String[] args) {
     BinaryTree btValues = new BinaryTree();
     btValues.add(20);
     btValues.add(18);
     btValues.add(10);
     btValues.add(12);
     btValues.add(17);
     btValues.add(33);
     btValues.add(24);
     btValues.add(40);
     btValues.add(51);
     btValues.add(20);
     btValues.add(8);
     btValues.add(31);
     btValues.add(5);
     
     
    // btValues.inOrder(btValues.root);
    btValues.preOrder(btValues.root);
    //btValues.postOrder(btValues.root);
	}

}
