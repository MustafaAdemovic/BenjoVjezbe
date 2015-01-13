package V13012015;

public class PriorityIntTest {

	public static void main(String[] args) {
		PriorityInt priority = new PriorityInt();
		
		priority.push(5, 5);
		priority.push(4, 4);
		priority.push(3, 3);
		priority.push(2, 2);
		priority.push(1, 1);
		priority.push(5, 5);
		priority.push(12, 12);
		priority.push(3, 3);
		priority.push(27, 27);
		priority.push(1, 1);
		
		System.out.println(priority.isEmpty());
		
		System.out.println("Pop: ");
		System.out.println(priority.pop());
		System.out.println("Peek: ");
		System.out.println(priority.peek());
		
		System.out.println("Pop: ");
		System.out.println(priority.pop());
		System.out.println("Peek: ");
		System.out.println(priority.peek());
		
		System.out.println("Pop: ");
		System.out.println(priority.pop());
		System.out.println("Peek: ");
		System.out.println(priority.peek());
		
		System.out.println("Pop: ");
		System.out.println(priority.pop());
		System.out.println("Peek: ");
		System.out.println(priority.peek());
		
		System.out.println("Pop: ");
		System.out.println(priority.pop());
		System.out.println("Peek: ");
		System.out.println(priority.peek());
		
	}
	
}
