package watki;

class NowyWatek implements Runnable {
	boolean koniec = false;

	public void run() {
		int i = 0;
		System.out.println("     Nowy watek : POCZATEK");
		while (koniec == false) {
			try {
				System.out.println("     Nowy watek: " + i);
				Thread.sleep(500);
				i++;
			} catch (InterruptedException e) {
			}
		}
		System.out.println("     Nowy watek : KONIEC");

	}
}

class GlownyWatek {
	public static void main(String args[]) {
		System.out.println(" Glowny watek: POCZATEK");
		System.out.println(" Glowny watek: Tworze Nowy watek");
		NowyWatek nowyWatek = new NowyWatek();
		Thread thread = new Thread(nowyWatek);
		System.out.println(" Glowny watek: Uruchamiam Nowy watek");
		thread.start();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(" Glowny watek: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
		System.out.println(" Glowny watek: KONIEC");
		nowyWatek.koniec = true;
	}
}