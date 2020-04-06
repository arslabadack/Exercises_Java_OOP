package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class EmployeeListProgram{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeList> list = new ArrayList<>();

		System.out.println("How many employees will be registered: ");
		int empNum = sc.nextInt();

		for (int i = 0; i < empNum; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1));
			System.out.println();
			System.out.print("Employee ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Employee Name: ");
			String name = sc.nextLine();
			System.out.print("Employee Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeList(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter  the employee's ID to increase the salary: ");
		int id = sc.nextInt();
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp != null) {
			System.out.println();
			System.out.print("Wich percentage to increase: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		} else {
			System.out.println("This doesn't exist!");
		}
		System.out.println("Employee's list: ");
		for (EmployeeList x : list) {
			System.out.println(x);
		}
		sc.close();
	}

}
