package com.vaira.collections;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {
	BinaryTree btValues = new BinaryTree();
	int[] value = {20,18,10,12,17,33,24,40,51,20,8,31,5};


	@Test
	public void IsNewListEmpty() {
		assertEquals(0, btValues.size());
	}

	@Test
	public void CanAddValuestoEmptyTree() {
		btValues.add(20);
		assertEquals(1, btValues.size);
	}

	@Test
	public void CanAddMorethanThreeValuesAndRet() {
		btValues.add(20);
		btValues.add(18);
		btValues.add(33);
		assertEquals(3, btValues.size);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestInsertDuplicateValuesThrowsException() {
		btValues.add(20);
		btValues.add(18);
		btValues.add(33);
		btValues.add(20);
	}

	@Test
	public void TestTotalSizeofTheTree() {
		addValues(btValues);
		assertEquals(value.length, btValues.size);
	}
	@Test
	public void TestPreOrder() {
		addValues(btValues);
		btValues.preOrder(btValues.root);
		assertEquals(value.length, btValues.size);
	}
	@Test
	public void TestPreOrderIsNotNull() {
		addValues(btValues);
		btValues.preOrder(btValues.root);
		assertNotNull(btValues);
	}
	@Test
	public void TestPostOrder() {
		addValues(btValues);
		btValues.preOrder(btValues.root);
		assertEquals(value.length, btValues.size);
	}
	@Test
	public void TestPostOrderIsNotNull() {
		addValues(btValues);
		btValues.preOrder(btValues.root);
		assertNotNull(btValues);
	}
	@Test
	public void TestInOrder() {
		addValues(btValues);
		btValues.preOrder(btValues.root);
		assertEquals(value.length, btValues.size);
	}
	@Test
	public void TestInOrderIsNotNull() {
		addValues(btValues);
		btValues.preOrder(btValues.root);
		assertNotNull(btValues);
	}

	public void addValues(BinaryTree nodes)
	{
		for(int i : value)
		{
			btValues.add(i);
		}
	}

}