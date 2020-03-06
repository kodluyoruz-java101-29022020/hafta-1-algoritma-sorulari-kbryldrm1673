package Algoritma;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Five {

	public static void main(String[] args) {

		int sayilar[] = new int[100];
		Random random = new Random();
		List<Integer> cift = new ArrayList<Integer>();
		List<Integer> tek = new ArrayList<Integer>();

		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = random.nextInt(100);
			System.out.print(" "+sayilar[i]);

			if (sayilar[i] % 2 == 0) cift.add(sayilar[i]);
			else tek.add(sayilar[i]);
		}

		System.out.println("\n\nÇift Sayýlar: " + cift.size() + " => " + cift);
		System.out.println("Tek Sayýlar: " + tek.size() + " => " + tek);
	}
}
