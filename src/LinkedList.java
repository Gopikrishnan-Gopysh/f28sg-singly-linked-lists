
public class LinkedList {
	private class Node {
		private int value;
		private Node nextNode;

		public Node(int i) {
			value = i;
			nextNode = null;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int i) {
			value = i;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node n) {
			nextNode = n;
		}

		// Recursive method
		public void addNodeAtTail(Node n) {
			if (this.nextNode == null) {
				this.nextNode = n;
			} else {
				this.nextNode.addNodeAtTail(n);
			}
		}

		public Node removeAtTail(Node n) {
			if (this.nextNode == null) {
				n.setValue(this.getValue());
				return null;
			} else {
				this.nextNode = this.nextNode.removeAtTail(n);
				return this;
			}
		}
	} // End of Node Class implementation

	private Node headNode;

	/**
	 * Creates a new empty linked list.
	 */
	public LinkedList() {
		headNode = null;
	}

	/**
	 * gets the number of the elements in the list
	 * 
	 * @return the size of the list
	 */
	public int size() {
		// TODO

		return -1;
	}

	/**
	 * Adds an element to the start of the list
	 * 
	 * @param i the element added to the start of the list
	 */
	public void addAtHead(int i) {
		Node newNode = new Node(i);
		// step 1: modify new node's nextNode

		// step 2: update what headNode points to

	}

	/**
	 * Adds an element to the end of the list
	 * 
	 * @param i the element added to the end of the list
	 */
	public void addAtTail(int i) {
		Node newNode = new Node(i);
		// case 1: adding to empty list
		if (headNode == null) {
			// step 1: update what headNode points to

		}
		// case 2: adding to non empty list
		else {
			// step 2: traverse list recursively to add node at tail
			// (hint: addNodeAtTail(..)

		}
	}

	/**
	 * Removes the first element from the list
	 * 
	 * @return the element removed from the list
	 */
	public int removeAtHead() {
		// case 1: empty list
		if (true /* TODO */) {
			return -1;
		}

		// case 2: non empty list
		else {
			// step 1: get Node to return

			// step 2: update headNode value

			// step 3: return value of head (one that's removed)
			return -1 /* TODO */;
		}
	}

	/**
	 * Removes the last element from the list
	 * 
	 * @return the value removed from the list
	 */
	public int removeAtTail() {
		// case 1: empty list
		if (true /* TODO */) {
			return -1;
		} else {
			// step 1: create node to return value of
			Node returnedNode = new Node(-1);

			// step 2: call removeAtTail(..)
			headNode = headNode; /* TODO */

			// step 3: return returned node value
			return -1; /* TODO */
		}
	}

	/**
	 * Adds an element to the middle of the list
	 * 
	 * @param i the element added to the middle of the list
	 */
	public void insertMiddle(int i) {
		// step 1: create the new node
		// TODO

		// step 2: find the node immediately prior to the middle node
		int middle = -1; // TODO

		// step 3: get the tail of the prior node
		// TODO

		// if the list was empty, set new node as a the head node
		if (headNode == null) {

		}

		// otherwise if the list was not empty,
		// set it as tail of the new node
		else {
			// set it as tail of the new node
			// TODO

			// step 4: set the new node as the tail of the prior node
			// TODO
		}

	}

	/**
	 * @param idx the index position of the value
	 * @return the value in the list at a given index
	 */
	public int get(int idx) {
		// TODO

		return -1;
	}

	/**
	 * @return the last value in the list, returns -1 when the list is empty.
	 */
	public int lastValue() {
		// TODO

		return -1;
	}
}
