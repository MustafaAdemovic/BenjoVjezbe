package V12012015;

public class QueueInt {
	private IntNode head;
	private IntNode tail;

	public QueueInt() {
		head = null;
	}

	public void push(int value) {
		IntNode current = new IntNode(value);
		if (head == null) {
			head = tail = current;

		} else {

			tail.setNext(current);
			tail = current;
		}

	}

	public int pop() {
		if (head == null) {
			throw new IllegalArgumentException("Queue is empty!");
		}
		if (head == tail) {
			int result = head.getValue();
			head = null;
			tail = null;
			return result;

		}
		
		IntNode current = head;
		head = head.getNext();
		int value = current.value;
		current = null;
		return value;

	}

	public int peek() {
		if (head == null) {
			throw new IllegalArgumentException("Queue is empty!");
		}
		return head.value;
	}

	public int getSize() {
		if (head == null) {
			return 0;
		}
		return getSize(head, 0);
	}

	private int getSize(IntNode current, int counter) {
		if (current == null) {
			return counter;
		}
		return getSize(current.next, counter + 1);
	}

	public boolean contines(int value) {
		if(head == null){
			System.out.println("Queue is empty!!");
			
		}
		
		if (head.value == value) {
			return true;
		}

		return contines(value, head);
	}

	private boolean contines(int value, IntNode current) {
		if (current == null) {
			return false;
		} else if (current.getValue() == value) {
			return true;
		} else {
			return contines(value, current.next);
		}
	}

	public static class IntNode {
		private int value;
		private IntNode next;

		public IntNode(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public IntNode getNext() {
			return next;
		}

		public void setNext(IntNode next) {
			this.next = next;
		}

	}
}
