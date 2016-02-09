package rekurencja;

public class konwert {

	public int a1(int b, int c){
		return b/c;
	}
	
	public int a2(int b){
		return b;
	}
	
	public String a3(int b){
		return String.valueOf(b);
	}
	
	public int a4(String b){
		return Integer.parseInt(b);
	}
	
	public float a5(double b){
		return (float)b;
	}
	
	public double a6(int b){
		return (double)b;
	}
	
	public double a7(int a, double b){
		return a/b;
	}
	
}
