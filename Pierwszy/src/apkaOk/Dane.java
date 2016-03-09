package apkaOk;

public class Dane {
	protected static StringBuilder sb = new StringBuilder();
	StringBuilder x = new StringBuilder();
	static int pierwszaLiczba;
	static int drugaLiczba;
	static int znakIndex;
	static char znak;
	static int wynik;

	protected static void znajdzLiczby() {
		int plus = sb.indexOf("+");
		int minus = sb.indexOf("-");
		int razy = sb.indexOf("*");
		if (plus == -1 && minus == -1) {
			znakIndex = razy;
			znak = '*';
		} else if (plus == -1 && razy == -1) {
			znakIndex = minus;
			znak = '-';
		}

		else if (minus == -1 && razy == -1) {
			znakIndex = plus;
			znak = '+';
		}

		else
			System.out.println("Blad w funkcji znajdzLiczby");

		pierwszaLiczba = Integer.parseInt(sb.substring(0, znakIndex));
		drugaLiczba = Integer.parseInt(sb.substring(znakIndex+1, sb.length()));
		System.out.println(pierwszaLiczba);
		System.out.println(drugaLiczba);
	}

	protected static void oblicz() {
		switch (znak) {
		case '+':
			wynik = pierwszaLiczba + drugaLiczba;
			break;
		case '-':
			wynik = pierwszaLiczba - drugaLiczba;
			break;
		case '*':
			wynik = pierwszaLiczba * drugaLiczba;
		}
		sb.append('=');
		sb.append(wynik);
		System.out.println(wynik);
	}
}
