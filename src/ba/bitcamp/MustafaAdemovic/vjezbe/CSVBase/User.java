package ba.bitcamp.MustafaAdemovic.vjezbe.CSVBase;

public class User {

	private String name;
	private String lastName;
	private int age;
	private boolean hasDriveLicence;

	public User(String name, String lastName, int age, boolean hasDriveLicence) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.hasDriveLicence = hasDriveLicence;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the hasDriveLicence
	 */
	public boolean isHasDriveLicence() {
		return hasDriveLicence;
	}

	/**
	 * @param hasDriveLicence
	 *            the hasDriveLicence to set
	 */
	public void setHasDriveLicence(boolean hasDriveLicence) {
		this.hasDriveLicence = hasDriveLicence;
	}

	public StringBuilder toCSVString(String delimeter) {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(delimeter).append(lastName).append(delimeter).append(age).append(delimeter).append(hasDriveLicence);
		return sb;
	}

}
