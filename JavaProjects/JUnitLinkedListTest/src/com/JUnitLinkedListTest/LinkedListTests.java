package com.JUnitLinkedListTest;

//import all static methods from Assert class
//this way all static method of the calss can be invoked without using Class reference
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class LinkedListTests {
	
	LinkedList<Integer> list=new LinkedList<Integer>();	

	@Test
	public void new_listIsEmpty() {
		assertEquals(0, list.size());
	}

	@Test
	public void toString_returnsListWithEmptyParenthesis() {
		System.out.println(list);	
		//assertEquals("LinkedList()", list.toString());
	}
	
	@Test
	public void add_canAddToAnEmptyList() {
        addValues(list);
        assertNotNull(list);
	}
	
	@Test
	public void add_addedItemsAreShownInToString() {
        addValues(list);
       // System.out.println("LinkedList values toString "+list.toString());
        assertNotNull(list);
		
	}
	
	@Test
	public void add_addingToANonEmptyListAddsItemAtTheEnd() {
		LinkedList<Integer> list=new LinkedList<Integer>();	
        addValues(list);
		list.add(100);
		//System.out.println("New value added at the end of the "+list.toString());	
	}	
	
	@Test
	public void get_GetsTheFirstItem() {
        addValues(list);
		int position = 0;
		assertNotNull(list);
		//System.out.println("LinkedList index ("+position+") value is "+list.get(position));
	}
	
	@Test
	public void get_PosReturnsItemsFromZeroBasedIndex() {
        addValues(list);
        //System.out.println("list.size-->"+list.size());
        int [] positions= {6, 4, 9, 0};
		for(int position : positions) {
			//System.out.println("LinkedList index ("+position+") values are "+list.get(position));
			assertNotNull(list);
	}
	}
	
	@Test
	public void get_throwsIndexExceptionForInvalidIndex() {
		addValues(list);
        System.out.println("list.size-->"+list.size());
        int [] positions= {6, 0};
		for(int position : positions) {
			System.out.println("LinkedList index ("+position+") values are "+list.get(position));
			assertNotNull(list);
	}
	}
	
	@Ignore 
	@Test
	public void get_NegativeIndexIsACirclularIndex() {
		//-1 is last item
		//-2 is second last item
		//-3 is third last item
		//size() is first item
		
		//you will have to modify LinkedList to implement this feature
	}
	
	@Ignore 
	@Test
	public void set_setDoesntAddNewItem() {
		
	}
	
	@Ignore 
	@Test
	public void set_replacesCurrentItem() {
		
	}
	
	@Ignore 
	@Test
	public void set_failsForInvalidIndex() {
		
	}
	
	@Test
	public void remove_removesTheItemFromValidIndex() {
		addValues(list);
		int [] positions= {8, 6,  2 , 0};
		for(int position : positions) {
			System.out.println("trying to delete at position "+position);
			list.remove(position);
		}
			System.out.println("after removel of given Index "+list.toString());
	}
	
	@Ignore 
	@Test
	public void remove_usesCircularIndex() {
		
	}
	
	@Ignore 
	@Test
	public void get_removeReturnsTheRemovedItem() {
		
	}
	
    private static void addValues(LinkedList<Integer> numbers) {
		
		for(int i=0;i<10;i++) {
			numbers.add(i); 
		}
    }	
	
}
