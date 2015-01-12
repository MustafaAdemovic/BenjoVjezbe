package GuiVjezba;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("Mustafa", 125, 8.87);
		Student student1 = new Student("Haris", 126, 6.78);
		Student student2 = new Student("MIrza", 126,8.4);
		Student student3 = new Student("Vedad", 126, 5.3);
		Student student4 = new Student("edib", 3, 7.99);
		Student student5 = new Student("Emir", 126, 7.88);

		Student[] bitCamp = new Student[] { student, student1, student2, student3, student4, student5 };
		
		sortStudents(bitCamp);
		for (int i = 0; i < bitCamp.length; i++) {
			System.out.println(bitCamp[i].toString() + " \n");
		}

	}

	public static void sortStudents(Student[] arrayStudents) {

		for (int i = 1; i < arrayStudents.length; i++) {

			Student number = arrayStudents[i];
			int j = i;

			while (j > 0 && number.compareTo(arrayStudents[j - 1]) == -1) {

				arrayStudents[j] = arrayStudents[j - 1];
				j--;
			}
			arrayStudents[j] = number;
		}
	}

}
