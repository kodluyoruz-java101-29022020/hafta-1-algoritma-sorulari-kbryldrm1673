package Algoritma;

import java.util.Scanner;

public class One {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String password = "12345";
		System.out.println("L�tfen �ifrenizi giriniz");

		int password2 = scan.nextInt();

		if (passwordControl(password, password2))
			System.out.println("Giri� Ba�ar�l�");

	}

	private static boolean passwordControl(String password, int password2) {
		while (!password.equals(Integer.toString(password2))) {
			System.out.println("L�tfen �ifrenizi tekrar giriniz");
			password2 = scan.nextInt();
		}
		return true;
	}
}
