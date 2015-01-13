package V13012015;

public class BinarysearchTest {
	public static void main(String[] args) {

		BinarySearch a = new BinarySearch();
		
		a.add(3);
		a.add(6);
		a.add(4);
		a.add(7);
		a.add(9);
		a.add(12);
		a.add(2);
		a.add(1);
		a.add(5);
		a.add(8);
		a.add(32);
		
		
		a.printRoot();
		System.out.println(a.containes(2));
	}

}
