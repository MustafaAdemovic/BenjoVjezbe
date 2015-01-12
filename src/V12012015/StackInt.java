package V12012015;

public class StackInt {

	private IntNode head;

	public StackInt() {
		head = null;
	}

	/**
	 * Metoda push je klasicna add metoda ona samo dodaje neke vrijednosti u
	 * stack
	 * 
	 * @param value
	 */
	public void push(int value) {
		IntNode newNode = new IntNode(value);
		newNode.setNext(head);
		head = newNode;
	}

	/**
	 * Metoda pop je klasicna remove metoda ona brise vrijednost iz stacka
	 * 
	 * @return
	 */
	public int pop() {
		if (head == null) {
			throw new IllegalArgumentException("Stack is empty");
		}
		IntNode current = head;
		head = head.getNext();
		int value = current.value;
		current = null;
		return value;

	}

	/**
	 * Metoda peek pokazuje na prvu vrijendost u stacku, samo pokazuje na nju
	 * 
	 * @return value
	 */
	public int peek() {
		if (head == null) {
			throw new IllegalArgumentException("Stack is empty");
		}
		return head.value;
	}

	/**
	 * Metoda provjerava duzinu Stacka odnosno koliko ima clanova stack, ako je
	 * prvi clan(head) nula vraca 0, ako nije pomocu rekurzije provjerava ide
	 * svaki sljedeci clan i kada prodjemo svaki clan brojac se poveca za 1 i
	 * koliku vrijednost varati brojac to je Size
	 * 
	 * @return
	 */
	public int getSize() {
		if (head == null) {
			return 0;
		}
		return getSize(head, 0);
	}

	private int getSize(IntNode current, int counter) {
		if (current == null) {// ako je current nula vracamo brojac u ovom slucaju brojac nam je 0
			return counter;
		}
		return getSize(current.next, counter + 1);//Ako nije current nula ide na svaki sljedeci i tako poceava brojac za 1 i na kraju dobijemo duzinu
	}

	/**
	 * Metoda provjerava ima li ta vrijednost u stacku, ako ima vraca true ako
	 * nema vraca false,ako je prvi clan(head) ta vrijendost vraca true ako nije
	 * pomocu rekurzije provjerava svaki sljedeci clan
	 * 
	 * @param value
	 * @return true or false
	 */
	public boolean contines(int value) {
		if (head.value == value) {
			return true;
		}

		return contines(value, head);
	}

	private boolean contines(int value, IntNode current) {
		if (current == null) {// kada smo rekurzijom dosli do nule a nismo nasli podudaranje(jednakost) vracamo false
			return false;
		} else if (current.getValue() == value) {// kada smo rekurzivno nasli podudaranje vracamo true;
			return true;
		} else {// kada nismo doli do kraja i nismo nasli podudaranje vracamo contines i idemo na sljedeci current
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
