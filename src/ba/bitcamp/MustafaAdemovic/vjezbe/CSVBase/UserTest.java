package ba.bitcamp.MustafaAdemovic.vjezbe.CSVBase;

public class UserTest {

	public static void main(String[] args) {
		User a = new User("Mustafa", " Ademovic", 21, false);
		System.out.println(a.toCSVString(", "));
		
		CSVReadWrite.saveFile("user", a.toCSVString(", "));

	}

}
