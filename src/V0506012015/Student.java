package GuiVjezba;

public class Student {
	protected String name;
	protected int numIndexa;
	protected double gpa;

	public Student(String name, int numIndex, double gpa) {
		this.name = name;
		this.numIndexa = numIndex;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumIndexa() {
		return numIndexa;
	}

	public void setNumIndexa(int numIndexa) {
		this.numIndexa = numIndexa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int compareTo(Student other) {
		if (this.gpa > other.gpa)
			return 1;
		if (this.gpa < other.gpa)
			return -1;
		else {
			if (this.numIndexa > other.numIndexa)
				return 1;
			if (this.numIndexa < other.numIndexa)
				return -1;
			else {
				if (this.name.compareTo(other.name) > 0)
					return 1;
				if (this.name.compareTo(other.name) < 0)
					return -1;
				else {
					return 0;
				}
			}
		}
	}

	@Override
	public String toString() {
		String str = " ";
		str = "Name: " + name + "\nNumber of Index: " + numIndexa + "\nGpa: "
				+ gpa;
		return str;
	}

}
