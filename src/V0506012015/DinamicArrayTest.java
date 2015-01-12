package GuiVjezba;

public class DinamicArrayTest {

	public static void main(String[] args) {
		DinamicArray a = new DinamicArray(1);

		a.add(15);
		a.add(66);
		a.add(12);

		
		a.removeAt(2);
		System.out.println(a.getAt(2));
		

	}

}
