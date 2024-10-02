package JavaTask3;

import java.util.Scanner;

public class Employee {
	private int idpr;
	private String fnamepr;
	private String lnamepr;
	private int salpr;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.idpr = id;
		this.fnamepr = firstName;
		this.lnamepr = lastName;
		this.salpr = salary;
	}

	public int getId() {
		return idpr;
	}

	public String getFirstName() {
		return fnamepr;
	}

	public String getLastName() {
		return lnamepr;
	}

	public String getName() {
		return fnamepr + " " + lnamepr;
	}

	public int getSalary() {
		return salpr;
	}

	public void setSalary(int salary) {
		this.salpr = salary;
	}

	public int getAnnualSalary() {
		return salpr * 12;
	}

	public void raiseSalary(int percent) {
		this.salpr += this.salpr * percent / 100;
	}

	
	public String toString() {
		return "Employee[id=" + idpr + ", name=" + getName() + ", salary=" + salpr + "]";
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Employee emp = new Employee(01, "Palani", "Raj", 50000);

		System.out.println("Below are the employee details");
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee First Name: " + emp.getFirstName());
		System.out.println("Employee Last Name: " + emp.getLastName());
		System.out.println("Employee Full Name: " + emp.getName());
		System.out.println("Employee Salary: " + emp.getSalary());
		System.out.println("Employee Annual Salary: " + emp.getAnnualSalary());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bonus percent:");
		int bonuspercent = sc.nextInt();
		emp.raiseSalary(bonuspercent);

		System.out.println("Employee New Salary after " + bonuspercent + "% raise: " + emp.getSalary());
		System.out.println(emp.toString());
	}

}
