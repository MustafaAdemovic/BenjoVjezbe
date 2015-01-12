package V08012015;

public class PersonNode {//Person element link liste

	private PersonNode next;
	private Person person;
	public PersonNode(Person person){
		this.person = person;
	}

	public PersonNode getNext() {
		return next;
	}

	public void setNext(PersonNode next) {
		this.next = next;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
