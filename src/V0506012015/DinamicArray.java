package V0506012015;

public class DinamicArray {
	private int[] array;
	private int count;
	final int INIT_SIZE = 5;

	public DinamicArray() {

		array = new int[INIT_SIZE];
		count = 0;
	}

	public DinamicArray(int size) {
		array = new int[size];
		count = 0;
	}

	public int getSize() {
		return count;
	}

	void add(int newElement) {

		if (count == array.length) {
			resize();
		}

		array[count] = newElement;
		count++;
	}

	public int getAt(int index) {
		if (index > count || index < 0)
			throw new IndexOutOfBoundsException();

		return this.array[index];
	}

	public void removeAt(int index) {

		if (index > count || index < 0)
			throw new IndexOutOfBoundsException();

		for (int i = index; i < count; i++) {
			array[i] = array[i + 1];
			count--;
		}

	}
//	public int[] toArray(){
//		
//	}

	private void resize() {

		int[] newSize = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			newSize[i] = array[i];
		}
		array = newSize;
	}

}
