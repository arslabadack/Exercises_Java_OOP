package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Enter account number: ");
		int tempNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String tempHolder = sc.nextLine();
		System.out.print("Is there an initial deposit? (Y/n): ");
		char tempAns = sc.next().charAt(0);
		if (tempAns == 'y' || tempAns == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double tempIniDeposit = sc.nextDouble();
			account = new Account(tempNumber, tempHolder, tempIniDeposit);
		} else {
			account = new Account(tempNumber, tempHolder);
		}
		System.out.println();
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a deposit value: $ ");
		double tempDeposit = sc.nextDouble();
		account.deposit(tempDeposit);

		System.out.println();
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a withdraw value: $ ");
		double tempWithdraw = sc.nextDouble();
		account.withdraw(tempWithdraw);

		System.out.println();
		System.out.println(account);
		System.out.println();

		sc.close();
	}

}
