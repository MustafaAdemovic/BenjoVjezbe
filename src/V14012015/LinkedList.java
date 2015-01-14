package V14012015;

public class LinkedList<T> {

	private Node head;
	
	public LinkedList(){
		head = null;
	}

	public void add(T value) {
		Node node = new Node<T>(value);
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
	}

	public void remove(int index) {
		int counter = 1;
		Node current = head;
		if (index == 0) {
			head = head.getNext();
			return;
		}
		while (counter < index) {
			current = current.getNext();
			counter++;
		}
		Node previus = current;
		current = current.getNext();
		Node next = current.getNext();

		current.setNext(null);
		previus.setNext(next);

	}

	public T getAt(int index) {
		int counter = 0;
		Node current = head;
		while (counter < index) {
			current = current.getNext();
			counter++;
		}
		return (T) current.getValue();

	}

	public int getSize() {
		int counter = 1;
		Node current = head;
		
		if (head == null) {
			return 0;
		} else {

			while (current.next != null) {
				current = current.getNext();
				 counter++;

			}
			
		}
		return counter;

	}

	public String toString() {
		String str = "";
		Node current = head;
		while (current != null) {
			str = str + current.value.toString() + ", ";
			current = current.getNext();
		}
		return str;
	}

	public class Node<T> {
		private T value;
		private Node next;

		public Node(T value) {

			this.value = value;
		}

		/**
		 * @return the value
		 */
		public T getValue() {
			return value;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param next
		 *            the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

	}
}
