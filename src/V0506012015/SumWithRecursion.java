import java.util.Scanner;

public class SumWithRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");

		int number = input.nextInt();
		int sumRezult = sum(number);
		System.out.println("Sum of this number is: " + sumRezult);

	}

	private static int sum(int number) {
		if (number > 0) {
			return number + (sum(--number));
		}
		return number;

	}

}
