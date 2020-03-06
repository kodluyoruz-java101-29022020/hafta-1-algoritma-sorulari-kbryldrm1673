package Algoritma;

import java.util.Random;

public class Three {
	
	public static void main(String[] args) {

		int[] sayilar = new int[100];
		Random random = new Random();

		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = random.nextInt(25);
			System.out.print(sayilar[i]+" ");
		}
		
		System.out.print("\nOrtalama: " + ortalama(sayilar));
	}
	
	public static double ortalama(int[] sayilar) {
		int toplam = 0;
		double ortalama = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
			ortalama = (double) toplam / (sayilar.length) ;
		}
		return ortalama;
	}
}
