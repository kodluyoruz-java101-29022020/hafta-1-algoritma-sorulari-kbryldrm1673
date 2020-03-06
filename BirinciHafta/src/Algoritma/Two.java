package Algoritma;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {

		System.out.println("Toplama 1");
		System.out.println("Çýkartma 2");
		System.out.println("Çarpma 3");
		System.out.println("Bölme 4");

		while (true) {

			Scanner scan = new Scanner(System.in);

			System.out.println("Ýki tane sayý giriniz");
			int sayi1 = scan.nextInt();
			int sayi2 = scan.nextInt();

			System.out.println("Yapmak istediðiniz iþlemi giriniz");
			int sayi3 = scan.nextInt();

			switch (sayi3) {
			case 1:
				System.out.println(sayi1 + sayi2);
				break;
			case 2:
				System.out.println(sayi1 - sayi2);
				break;
			case 3:
				System.out.println(sayi1 * sayi2);
				break;
			case 4:
				System.out.println(sayi1 / sayi2);
				break;
			default:
				System.out.println("YANLIÞ");
				break;

			}

		}
	}

}
