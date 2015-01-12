package V08012015;

import java.util.Scanner;

public class PersonEntry {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String name;
		PersonList list = new PersonList();

		

		
		do {
			System.out.println("Enter names, for end enter \"End\"");
			name = scanner.nextLine();// Trazimo od korisnika da uneser imena
			Person person = new Person(name);// Objekat person kao atribut prima name
			list.add
			
		} while (true);
		
		printList(firstPerson);
		System.out.println(counter(firstPerson));
	}

	

	public static int counter(PersonNode firstPerson) {
		int counter = 0;
		/*
		 * Ova petlja sluzi za da kada ispisemo imena counter se povecava svaki
		 * put za jedan i tako dobijemo koliko ima imena nasa lista
		 */
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			counter++;
		}
		return counter;
	}
	
	public static void printList(PersonNode firstPerson) {
		System.out.println("The names are: ");
		/*
		 * Ova for petlja sluzi za ispis svih imena
		 */
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			System.out.println(current.getPerson().getName());
		}
	}

	public Person[] toArray(PersonNode firstPerson) {
		Person[] persons = new Person[counter(firstPerson)];
		int counter = 0;
		
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			persons[counter] = current.getPerson();
			counter++;
		}
		return persons;
	}

}
