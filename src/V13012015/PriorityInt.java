package V13012015;

public class PriorityInt {

	private Node head;
	private Node tail;

	public PriorityInt() {
		head = null;
	}

	/**
	 * This method have for a task to push node in queue this is like a add method
	 * @param value
	 * @param priority
	 */
	public void push(int value, int priority) {
		Node node = new Node(value, priority);
		/*
		 * if is head(first member) null, that mean that the queue is empty and
		 * the node is head and tail at the same time
		 */
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		/*
		 * if we have one member than the member is head and tail at same time,
		 * and when we push node(new member), if he is bigger than head he is
		 * head and head is a tail, if the node is smaller than the head, head
		 * stay on same place and node is a tail now
		 */
		if (head == tail) {
			if (head.value < node.value) {
				tail = head;
				node.setNext(head);
				head = node;
				return;
			} else {
				head.setNext(node);
				tail = node;
				return;
			}
		}
		/*
		 * If head value is smaller than the node value(value of the member that
		 * we will to put in queue), node is the first member now, and head is
		 * next member from node
		 */
		if (head.value < node.value) {
			node.next = head;
			head = node;
			return;
		}
		/*
		 * We installs a two new value now head is a previous, and current is a
		 * next member of previous. We have a while loop with a condition who
		 * say until current is different at null displacement current to a next
		 * member until you come to null if current priority is smaller than the
		 * node priority than we say next member of node is current and
		 * previous(head) next member is a node
		 */
		Node previous = head;
		Node current = previous.next;
		while (current != null) {
			if (current.priority < node.priority) {
				node.next = current;
				previous.next = node;
				return;
			}
			current = current.getNext();
			previous = previous.getNext();
		}

		tail.next = node;
		tail = node;

	}

	/**
	 * This method is like a method for remove, task of this method is to remove
	 * member that we want, and show value of the member that we are remove
	 * 
	 * @return value
	 */
	public int pop() {
		/*
		 * this if check is queue empty, if the queue is empty he show an
		 * exeption with a messagee "Queue is empty"
		 */
		if (head == null) {
			throw new IllegalArgumentException("Queue is empty!");
		}
		/*
		 * in this if we check when we have one member we return a result in
		 * this case result is a value of head
		 */
		if (head == tail) {
			int result = head.getValue();
			head = null;
			tail = null;
			return result;

		}

		Node current = head;
		head = head.getNext();
		int value = current.value;
		current = null;
		return value;

	}

	/**
	 * This method has for a task only to show a value of the head
	 * 
	 * @return head.value
	 */
	public int peek() {
		if (head == null) {
			throw new IllegalArgumentException("This stack is empty");
		}
		return head.value;
	}

	/**
	 * This method have for a task only to check is the queue empty, if is the
	 * queue empty method return true, if is not method return false
	 * 
	 * @return true or false
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Here we have a class name a Node, Node is an object who receives a value,
	 * next member, and priority We have getter for value and next who return
	 * value and next member and we have setter for next
	 * 
	 * @author mustafaademovic
	 *
	 */
	public static class Node {
		private int value;
		private Node next;
		private int priority;

		public Node(int value, int priority) {
			this.value = value;
			this.priority = priority;
		}

		public Node(int value) {
			this.value = value;
			this.priority = 0;
		}

		private int getValue() {
			return value;
		}

		private Node getNext() {
			return next;
		}

		
		private void setNext(Node next) {
			this.next = next;
		}
	}

}
