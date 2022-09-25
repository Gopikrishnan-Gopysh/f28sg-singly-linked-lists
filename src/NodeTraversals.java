
public class NodeTraversals {
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

		/* Exercise 3 */
		public void printList() {
			// TODO step 1: print this node's value

			// TODO step 2: if we're not at the end of this list then
			// move this method along to the next node.
		}

	} // End of Node Class implementation

	private Node headNode;

	/**
	 * Creates a new empty linked list.
	 */
	public NodeTraversals() {
		headNode = null;
		Node n1 = new Node(15);
		Node n2 = new Node(10);
		Node n3 = new Node(45);

		headNode = n1;
		n1.setNextNode(n2);
		n2.setNextNode(n3);
	}

	/* Exercise 1 */
	public Node lastElement() {
		Node currentNode = headNode;

		// TODO traverse the linked list to the end

		return currentNode;
	}

	/* Exercise 2 */
	public void printElementsLoop() {
		Node currentNode = headNode;

		// TODO traverse the linked list and print values along the way
	}

	public void printElementsRecursive() {
		headNode.printList();
	}

	public static void main(String[] args) {
		NodeTraversals nodes = new NodeTraversals();

		/*
		 * Three exercises:
		 * 
		 * 1) get the last element of the linked list and print - it's reference (i.e.
		 * it's memory location) - it's value
		 * 
		 * 2) print the linked list node values using a 'while' loop
		 * 
		 * 3) print the linked list node values using recursion
		 * 
		 */
		Node n = nodes.lastElement();
		System.out.println("Last element reference: " + n);
		System.out.println("Last element value: " + n.getValue());

		System.out.println("");
		System.out.println("Printing with a loop");
		nodes.printElementsLoop();

		System.out.println("\n");
		System.out.println("Printing with recursion");
		nodes.printElementsRecursive();
	}

}
