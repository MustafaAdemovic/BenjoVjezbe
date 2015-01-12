package V07012015;

public class LinkedListInt {
	private Node head;
	private int size;

	public LinkedListInt() {
		head = null;
		size = 0;
	}

	public void add(int value) {
		Node newNode = new Node(value);
		// newNode.value = value; moze ovako ali cemo napisati konstruktor
		// uklasi node
		if (head == null) {// ako je prvi nula tj. ako je lista prazna stavi da
							// je prvi(head) = newNold
			head = newNode;
			size++;// ako je null povecaj velicinu
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;// Nakon while petlje current ce nam biti
									// zadnji Node
		}
		current.next = newNode;
		size++;
	}

	public void removeAt(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("error index is not valid");
		if (index == 0) {
			head = head.next;
			size--;
			return;
		}
		
		Node current = head.next;
		Node previous = head;
		int counter = 1;
		while (counter < index) {
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;

	}
	
	public void insertAt(int value, int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Eror index is not valid");
		Node newNode = new Node(value);
		
		//1. slucaj
		int counter = 0;
		Node current = head;
		
		while(counter < index){
			current = current.next;
			counter++;
		}
		current.next = newNode;
		newNode.next = current.next;
		size++;


		
	}

	public int[] toArray() {
		Node current = head;
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = current.value;

			current = current.next;
		}

		return array;
	}

	public void add(LinkedListInt other) {
		this.size += other.size;
		Node current = head;

		while (current.next != null) 
			current = current.next;
			current.next = other.head;
		
	}

	public void printList() {
		Node current = head;
		while (current != null) {
			
			System.out.println(current.value);
			current = current.next;
		}
	}

	private class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			next = null;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

}
