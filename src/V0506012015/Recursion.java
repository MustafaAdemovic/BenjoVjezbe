import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");

		int number = input.nextInt();

		recursion(number);

	}

	private static void recursion(int number) {
		if (number < 0) {
			return;
		}
		System.out.println(number);
		recursion(number - 1);
	}

}
