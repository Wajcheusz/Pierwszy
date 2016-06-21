package enumeracja;

public class Maine {

	static int age;
	static double age2;
	
	public enum Zwierz{
		PIES(50,55), KOT(20,5), STRUS(190, 60);
		int wzrost;
		private int waga;
		
		private Zwierz(int wzrost, int waga){
			this.wzrost=wzrost;
			this.waga=waga;
		}
		
		public int getWaga(){
			return waga;
		}
		
		public int getWzrost(){
			return wzrost;
		}
				
	}
	
	public static void main(String[] args) {
		Pies pies;
		for (Zwierz v:Zwierz.values()){
			System.out.println(v+" wzrost: "+v.getWzrost()+" waga: "+v.getWaga());
			System.out.println(age2);
		}

	}

}
