package V08012015;

import java.security.Permissions;

public class PersonList {
	private PersonNode firstPerson;

	public PersonNode getFirstPerson() {
		return firstPerson;
	}

	private void add(Person person) {
		PersonNode lastPerson = firstPerson;// LastPerson na pocetku predstavlja referencu na first person

		PersonNode next = new PersonNode(person);
		if (firstPerson == null) {
			firstPerson = next;
		} else {

			while (lastPerson.getNext() != null) {
				
				lastPerson = lastPerson.getNext();
			}
			lastPerson.setNext(next);
		}

	}

}
