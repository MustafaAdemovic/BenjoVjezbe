package V19012015;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class zadacaBenjo {
	public static void main(String[] args) {

		/**
		 * Reading (and later printing) using Reader which is wrapped to
		 * BufferedReader; String is filled with the line we write and with the
		 * BufferedReader which reads with the readLine() method until (enter -
		 * new line has been registered);
		 */

		Reader mainInStream1 = new InputStreamReader(System.in);
		BufferedReader bufferedIn = new BufferedReader(mainInStream1);
		String line = null;
		try {
			System.out
					.println("Enter a line that will be read by the BufferReader and printed : ");
			line = bufferedIn.readLine();
			System.out.println(line + "\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		/**
		 * Used the Scanner class to read the input.
		 */
		Scanner scannerIn = new Scanner(System.in);
		System.out
				.println("Enter a line that will be read by the Scanner and printed : ");
		String myString = scannerIn.nextLine();
		System.out.println(myString);

		
		/**
		 * Writer mainOutStream which uses its method write to write a String
		 * (line3)
		 */
		Writer mainOutStream = new OutputStreamWriter(System.out);
		System.out
				.println("\nThe following String is printed by the Writer : ");
		try {
			String line3 = "Printed with the Writer's write method.";
			mainOutStream.write(line3);
			mainOutStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		/**
		 * Writer mainOutStream which is Wrapped to PrintWriter which has the
		 * print(), etc..other methods to print on console, which we
		 * use to print on the console the line2 String we have entered.
		 */
		PrintWriter printable = new PrintWriter(mainOutStream);
		System.out
				.println("\n\nThe following String is printed by the PrintWriter : ");
		String line2 = "Printed by the PrintWriter's printabale method.";
		printable.print(line2);
		printable.flush();

	}
}