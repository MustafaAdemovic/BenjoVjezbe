package V07012015;

public class LinkedListIntTest {

	public static void main(String[] args) {
		LinkedListInt linked = new LinkedListInt();
		linked.add(2);
		linked.add(3);
		linked.add(4);
		linked.add(7);
		linked.printList();

		LinkedListInt linked2 = new LinkedListInt();
		linked2.add(9);
		linked2.add(8);
		linked.add(linked2);
		linked.printList();

	}

}
