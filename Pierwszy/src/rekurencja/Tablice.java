package rekurencja;

import java.util.ArrayList;

public class Tablice {
	
public int sortuj(ArrayList<String> list){
	list.add(7, "15");
	int a=Integer.valueOf(list.get(7));	
	return a;
}

public int[] sort(int[] tablica){
	int p;
	int j=1;
	while (j<tablica.length){
		int i=1;
	while (i<tablica.length){
		if (tablica[i]<tablica[i-1]){
			p=tablica[i];
			tablica[i]=tablica[i-1];
			tablica[i-1]=p;
		}
		i++;}
	j++;					
	}	
	return tablica;
}

}
