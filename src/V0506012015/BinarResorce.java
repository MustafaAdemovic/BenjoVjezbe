import java.util.Scanner;

public class BinarResorce {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Enter a index of number that you want: ");
		int indexNumber = input.nextInt();

		int index = binarResorceLoop(array, indexNumber);
		
		System.out.println("The index of your number is: " + "[" + index + "]");

	}

	public static int binarResorceLoop(int array[], int indexNumber) {
		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			
			if (indexNumber == array[mid]) {
				return mid;
			} 
			else if (indexNumber < array[mid]) {
				end = mid - 1;
			} 
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
