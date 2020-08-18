import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class LinkedListTest 
{
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
	
}
