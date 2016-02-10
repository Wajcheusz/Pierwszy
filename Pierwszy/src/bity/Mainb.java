package bity;

import java.util.Scanner;

public class Mainb {
	static int liczba;
	static long x1, x2, x3, x4;

	public static String Zamien(int a) {
		StringBuilder b = new StringBuilder();

		do {
			if (a % 2 == 0) {
				b.append(0);
				a = a / 2;
			} else {
				b.append(1);
				a = a / 2;				
			}
		} while (a != 0);
		return b.reverse().toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wprowadz liczbe do zamiany");
		liczba = Integer.parseInt(sc.next());
		x1=System.nanoTime();
		System.out.println(Zamien(liczba));
		x2=System.nanoTime();
		System.out.println(Integer.toBinaryString(liczba));
		x3=System.nanoTime();
		System.out.println("Moja metoda: "+(x2-x1)+" Metoda z dokumentacji: "+(x3-x2));
	}

}
