package employee;

class Employee {

	String Name;
	String DateOfBirth;

	public Employee(String name, String dateOfBirth) {
		super();
		Name = name;
		DateOfBirth = dateOfBirth;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", DateOfBirth=" + DateOfBirth + "]";
	}

}
