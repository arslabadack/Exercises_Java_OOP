package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class HotelProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Hotel hotelVect[] = new Hotel[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + i + ": ");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("e-mail: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			hotelVect[room] = new Hotel(name, email);
		}

		System.out.println("Busy rooms");
		for (int i = 0; i < 10; i++) {
			if (hotelVect[i] != null) {
				System.out.println(i + ": " + hotelVect[i]);
			}
		}
		sc.close();
	}

}
