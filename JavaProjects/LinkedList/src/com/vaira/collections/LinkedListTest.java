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
		if(pos<0)
			return ; 
		
		if(head==null) //list is empty
			return ; //nothing to remove
		
		
		int i=0;
		Node n=head;
		while(i<pos && n!=null)
		{
			i++;
			n=n.next;
		}		
		 //we moved past the last one. Nothing to remove
		
		//delete the 'nth' node
		
		if(n.previous==null)   //deleting first node
			head=n.next;
		else
			n.previous.next=n.next; //if not the first node
		
		if(n.next!=null) // last node			
			n.next.previous=n.previous; //not the last node
		//else
			//do nothing	
	}

}
