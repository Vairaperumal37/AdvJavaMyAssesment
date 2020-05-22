package com.vaira.collections;

public class LinkedListTest {  

	Node head = null;  
	Node tail = null;
	int count;

	public void add(int value) {  
		Node newNode = new Node();
		newNode.value=value;

		if(head == null) {  
			head = tail = newNode;  
			head.previous = null;  
			tail.next = null;  
		}  
		else {  
			tail.next = newNode;  
			newNode.previous = tail;  
			tail = newNode;  
			tail.next = null;  
		}  
	}  

	public void size()
	{
		Node temp=head;
		count = 0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;  
		}
		System.out.println("\n" +"Size of the Linked List --"+count);
	}


	public void display() {  
		Node current = head; 
		while(current != null) {  
			System.out.print(current.value + " ");  
			current = current.next;  
		}  
	}

	public void get(int pos) {
		Node temp=head;
		count = 0;
		while(temp!=null)
		{
			if (count == pos)
				System.out.println("position of index "+pos +" is --> "+temp.value);
			count++;
			temp=temp.next;
		}
	}

	public void remove(int pos)
	{
		Node temp=head;
		count =0;
		while(temp!=null)
		{
			if(count == pos)
			{
				head = temp.next;
				return;
			}
			count++;
			head =temp.next;
		}
	}

	public void set(int pos, int value) {

	}


}
