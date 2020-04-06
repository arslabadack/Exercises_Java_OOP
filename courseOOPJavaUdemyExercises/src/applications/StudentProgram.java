package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student grade = new Student();
		
		System.out.println("Student's name: ");
		grade.name = sc.nextLine();
		System.out.println("Grade one: ");
		grade.gradeOne = sc.nextDouble();
		System.out.println("Grade two: ");
		grade.gradeTwo = sc.nextDouble();
		System.out.println("Grade three: ");
		grade.gradeThree = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", grade.finalGrade());
		
		if(grade.finalGrade()< 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING POINTS: %.2f", grade.missingPoints());
		}else {
			System.out.println("PASS");
		}
		sc.close();
	}
}
