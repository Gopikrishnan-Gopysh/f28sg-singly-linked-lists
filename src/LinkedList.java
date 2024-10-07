class LinkedListException extends RuntimeException{    
	public LinkedListException(String err) {
		super(err);
	}
}
//testing
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
		int count = 0;
		Node current = headNode;
		while (current != null) {
			count++;
			current = current.getNextNode();
		}
		return count;
	}


	/**
	 * Adds an element to the start of the list
	 * 
	 * @param i the element added to the start of the list
	 */
	public void addAtHead(int i) {
		Node newNode = new Node(i);
		newNode.setNextNode(headNode); //newNode points to current head
		headNode = newNode; //headNode now points to newNode
	}

	/**
	 * Adds an element to the end of the list
	 * 
	 * @param i the element added to the end of the list
	 */
	public void addAtTail(int i) {
		Node newNode = new Node(i);
		if (headNode == null) {
			headNode = newNode; //for Empty list

		}
		else {
			headNode.addNodeAtTail(newNode); //for Non-empty list 
		}
	}

	/**
	 * Removes the first element from the list
	 * 
	 * @return the element removed from the list
	 */
	public int removeAtHead() throws LinkedListException {
		// case 1: empty list
		if (headNode == null) {
			throw new LinkedListException("Cannot remove from the head of an empty linked list");
		}

		// case 2: non empty list
		else {
			int value = headNode.getValue(); //Get value of head node
			headNode = headNode.getNextNode(); //update headNode to point to the next node
			return value; //return the removed value
		}
	}

	/**
	 * Removes the last element from the list
	 * 
	 * @return the value removed from the list
	 */
	public int removeAtTail() throws LinkedListException {
		// case 1: empty list
		if (headNode == null) {
			throw new LinkedListException("Cannot remove from the tail of an empty linked list");
		} else {
			Node returnedNode = new Node(-1); //node to return value of
			if (headNode.getNextNode() == null) { //for single node in the list
				returnedNode.setValue(headNode.getValue());
				headNode = null;
			} else {
				headNode = headNode.removeAtTail(returnedNode); //recursive removal
			}
			return returnedNode.getValue(); //Return the value of the removed node
		}
	}

	/**
	 * Adds an element to the middle of the list
	 * 
	 * @param i the element added to the middle of the list
	 */
	public void insertMiddle(int i) {
		// step 1: create the new node
		Node newNode = new Node(i);

		//step 2: If the list is empty, set new node as the head node
		if (headNode == null) {
			headNode = newNode;
			return;
		}

		//step 3: Find the middle position of the list
		int mid = size() / 2;
		Node current = headNode;
		for (int j = 0; j < mid - 1; j++) {
			current = current.getNextNode();
		}
		//step 4: Insert the new node at the middle position
		newNode.setNextNode(current.getNextNode());
		current.setNextNode(newNode);
	}

	/**
	 * @param idx the index position of the value
	 * @return the value in the list at a given index
	 */
	public int get(int idx) {
		if (idx < 0 || idx >= size()) {
			return -1;  //out of bounds
		}
		Node current = headNode;
		for (int i = 0; i < idx; i++) {
			current = current.getNextNode();
		}
		return current.getValue();
	}

	/**
	 * @return the last value in the list, returns -1 when the list is empty.
	 */
	public int lastValue() {
		if (headNode == null) {
			return -1; //empty list
		}
		Node current = headNode;
		while (current.getNextNode() != null) {
			current = current.getNextNode();
		}
		return current.getValue(); //return value of last node
	}
}
