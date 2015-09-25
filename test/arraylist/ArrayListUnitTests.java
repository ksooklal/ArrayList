package arraylist;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;


public class ArrayListUnitTests {

	@SuppressWarnings("rawtypes")
	@Test
	public void testConstructor(){
		ArrayList untyped = new ArrayList();
		assertFalse(untyped == null);
		
		ArrayList<String> typed = new ArrayList<String>();
		assertEquals(typed.size(), 0);
		
		ArrayList mixed = new ArrayList<String>();
		assertEquals(true, mixed.isEmpty());
	}
	
	@Test
	public void testReset(){
		
	}

	@Test
	public void testSize(){
		ArrayList<String> list = new ArrayList<String>();
		
	}

	@Test
	public void testEmpty() {
		ArrayList<String> list = new ArrayList<String>();
		assertEquals(true, list.isEmpty());
		
		list.add("First");
		assertEquals(false, list.isEmpty());
		
		list.remove(0);
		assertEquals(true, list.isEmpty());
		
		list.add(0, "First");
		assertEquals(false, list.isEmpty());
		
		list.clear();
		assertEquals(true, list.isEmpty());
	}

	@Test
	public void testContains(){
		
	}

	@Test
	public void testIterator(){
		
	}

	@Test
	public void testObjectToArray(){
		
	}

	@Test
	public void testGenericToArray(){
		
	}

	@Test
	public void testAdd() {
		
	}

	@Test
	public void testRemove(){
		
	}

	@Test
	public void testContainsAll(){
		
	}

	@Test
	public void testAddAll(){
		
	}

	@Test
	public void testIndexedAddAll(){
		
	}

	@Test
	public void testRemoveAll(){
		
	}

	@Test
	public void testRetainAll(){
		
	}

	@Test
	public void testClear(){
		
	}

	@Test
	public void testGet(){
		
	}

	@Test
	public void testSet(){
		
	}

	@Test
	public void testIndexedAdd(){
		
	}

	@Test
	public void testIndexedRemove(){
		
	}

	@Test
	public void testIndexOf(){
		
	}

	@Test
	public void testLastIndexOf(){
		
	}

	@Test
	public void testListIterator(){
		
	}

	@Test
	public void testIndexedListIterator(){
		
	}

	@Test
	public void testSublist(){
		
	}
}
