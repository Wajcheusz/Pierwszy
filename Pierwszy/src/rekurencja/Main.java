package rekurencja;

public class Main {

	public int silniaR(int n) {
		if (n == 0)
			return 1;
		else{
			return n * silniaR(n - 1);
			}
	}

	public int silniaI(int n) {
		int wynik = 1;
		for (int i = 2; i <= n; i++) {
			wynik = wynik * i;
		}
		return wynik;
	}

	public int fiboR(int n) {
		if (n < 2)
			return n;
		else{
			return fiboR(n-1)+ fiboR(n - 2);
}
	}
	
//	public int fibonacciRekurencja(int n) {
//        return n<2? n : fibonacciRekurencja(n - 1) + fibonacciRekurencja(n - 2);
//    }
	
	public int fiboI(int n){
		int x=0;
		int y=0;
		int z=1;
		for (int i=1; i<n; i++){
			x=y;
			y=z;
			z=x+y;
		}
		return z;
	}

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("hello2");
//
//		Main main = new Main();
//		int i = main.silniaR(5);
//		int j = main.silniaI(5);
//		int x = main.fiboR(6);
//		int z = main.fiboI(6);
////		int y = main.fibonacciRekurencja(10);
//		
//
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(x);
//		System.out.println(z);
//		System.out.println(y);
		Tablice tablice = new Tablice();
		int[] tab={3,4,7,11,24,92,3,19};
		tablice.sort(tab);
		
		for (int i=0; i<tab.length; i++)
			System.out.println(tab[i]);
		
		
	}

}
