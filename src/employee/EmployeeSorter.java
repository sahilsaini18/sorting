package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Logger;

public class EmployeeSorter implements Comparator<Employee> {
	private static final Logger log = Logger.getLogger(EmployeeSorter.class.getName());
	static Scanner scanner = new Scanner(System.in);
	static int choice;

	public static void main(String[] args) {

		Employee employee1 = new Employee("Alex Smith", "1990-05-15");
		Employee employee2 = new Employee("Max Payne", "1985-08-22");
		Employee employee3 = new Employee("Home Sweet", "2000-08-22");
		// Creating a list to hold the employees
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		// Getting user preference for sorting
		choice = scanner.nextInt();

		log.info("Enter 1 to sort by name, 2 to sort by date of birth:");

		Collections.sort(employees, new EmployeeSorter());

		// Displaying the sorted employees
		log.info("Sorted Employees:");
		for (Employee employee : employees) {
			log.info(employee.toString());
		}

	}

	@Override
	public int compare(Employee o1, Employee o2) {

		if (choice == 1) {
			// Sort by name
			return o1.getName().compareTo(o2.getName());
		} else if (choice == 2) {
			// Sort by date of birth
			return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
		} else {
			log.info("Invalid choice. Program exiting.");
			return o1.getName().compareTo(o2.getName());
		}
	}
}
