package ZadacaBenjo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestPerson {

	public static void main(String[] args) {

		Person person = new Person("Mustafa", 21);

		File f = new File("/Users/mustafaademovic/Documents/person");

		try (FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(person);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			Person person2 = (Person) ois.readObject();
			System.out.printf("Read: %s\n", person2);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
