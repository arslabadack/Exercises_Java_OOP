package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RectangleProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Inform rectangle's width: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Inform rectangle's height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		System.out.println(rectangle);
		
		sc.close();
	}

}
