import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class LinkedListTest {
	LinkedList list;

	@Before
	public void createList() {
		list = new LinkedList();
	}

	@Test
	public void sizeEmptyTest() {
		assertEquals(0, list.size());
	}

	@Test
	public void addAtHeadTest() {
		list.addAtHead(10);
		assertEquals(1, list.size());
	}

	@Test
	public void addAtTailTest() {
		list.addAtTail(20);
		assertEquals(1, list.size());
	}

	@Test
	public void sizeNonEmptyTest() {
		list.addAtHead(10);
		list.addAtTail(45);
		assertEquals(2, list.size());
	}

	@Test
	public void getEmptyTest() {
		assertEquals(-1, list.get(0));
	}

	@Test
	public void getNonEmptyTest1() {
		list.addAtHead(5);
		list.addAtTail(6);
		list.addAtTail(7);
		assertEquals(7, list.get(2));
	}

	@Test
	public void getNonEmptyTest2() {
		list.addAtHead(5);
		list.addAtHead(6);
		list.addAtHead(7);
		assertEquals(5, list.get(2));
	}

	@Test
	public void getNonEmptyTest3() {
		list.addAtHead(5);
		list.addAtTail(6);
		list.addAtTail(7);
		assertEquals(5, list.get(0));
	}

	@Test
	public void getOutOfBoundsTest() {
		assertEquals(-1, list.get(1));
	}

	@Test
	public void lastValueEmptyTest() {
		assertEquals(-1, list.lastValue());
	}

	@Test
	public void lastValueNonEmptyTest1() {
		list.addAtHead(15);
		list.addAtHead(10);
		list.addAtHead(45);
		assertEquals(15, list.lastValue());
	}

	@Test
	public void lastValueNonEmptyTest2() {
		list.addAtTail(15);
		list.addAtTail(10);
		list.addAtTail(45);
		assertEquals(45, list.lastValue());
	}

	@Test
	public void addRemoveGetTest1() {
		list.addAtTail(15);
		list.removeAtTail();
		assertEquals(0, list.size());
	}

	@Test
	public void addRemoveGetTest2() {
		list.addAtTail(15);
		list.removeAtHead();
		assertEquals(0, list.size());
	}

	@Test
	public void insertMiddleEmpty() {
		list.insertMiddle(3);
		assertEquals(3, list.get(0));
		assertEquals(1, list.size());
		assertEquals(3, list.lastValue());
	}

	@Test
	public void insertMiddleOdd() {
		list.addAtHead(1);
		list.addAtTail(5);
		list.addAtTail(6);
		list.insertMiddle(3);
		// { 1 , 3 , 5 , 6 }
		assertEquals(1, list.get(0));
		assertEquals(3, list.get(1));
		assertEquals(5, list.get(2));
		assertEquals(6, list.get(3));
	}

	@Test
	public void insertMiddleEven() {
		list.addAtHead(1);
		list.addAtTail(5);
		list.addAtTail(6);
		list.addAtTail(7);
		list.insertMiddle(3);
		// { 1 , 5 , 3 , 6 , 7}
		assertEquals(3, list.get(2));
	}

	@Test
	public void removeInsertMiddle() {
		list.addAtHead(1);
		list.addAtTail(5);
		list.addAtTail(6);
		list.addAtTail(7);
		list.removeAtHead();
		list.insertMiddle(3);
		// { 5 , 3 , 6 , 7}
		assertEquals(5, list.get(0));
		assertEquals(3, list.get(1));
		assertEquals(6, list.get(2));
		assertEquals(7, list.get(3));
	}
	
	@Test(expected=LinkedListException.class)
	public void testRemoveAtHeadEmpty() {
		list.removeAtHead();
	}
	
	@Test(expected=LinkedListException.class)
	public void testRemoveAtTailEmpty() {
		list.removeAtTail();
	}

}
