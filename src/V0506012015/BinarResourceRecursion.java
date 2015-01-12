import java.util.Scanner;

public class BinarResourceRecursion {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a index of number that you want: ");
		int indexNumber = input.nextInt();

		int a = binarResourceRecursion(array, indexNumber, 0, array.length - 1);
		if (a == -1) {
			System.out.println("The number doesn't exist in array!");
		} else
			System.out.println("The index of your number is: " + "[" + a + "]");

	}

	private static int binarResourceRecursion(int[] array, int indexNumber,
			int start, int end) {

		int mid = (start + end) / 2;
		if (start >= end) {

			return -1;
		}
		if (indexNumber == array[mid]) {
			return mid;
		} else if (indexNumber < array[mid]) {

			return binarResourceRecursion(array, indexNumber, 0, mid);
		} else {
			return binarResourceRecursion(array, indexNumber, mid + 1, 0);
		}

	}

}
