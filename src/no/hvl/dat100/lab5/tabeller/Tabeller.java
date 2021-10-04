package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {
	public static void main(String[] args) {
		System.out.print("xD");
	}
	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[");
        for (int i = 0; i < tabell.length; i++) {
            if (i < tabell.length - 1) {
                System.out.print(tabell[i] + ",");
            } else {
                System.out.print(tabell[i]);
            }
        }
        System.out.print("]");
        System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String str = "[";
        for (int i = 0; i < tabell.length; i++) {
            if (i < tabell.length - 1) {
                str += tabell[i] + ",";
            } else {
                str += tabell[i];
            }
        }
        str += "]";
        return str;		
	}

	// c)
	public static int summer(int[] tabell) {
        int sum = 0;
        // for løkke
        /*for(int i = 0;i < tabell.length; i++){
            sum += tab[i];
        }*/
        // while løkke
        /*int i = 0;
        while (i < tabell.length){
                sum += tab[i];
            i++;
        }*/
        // utvidet for-løkke (ligner litt på forEach in js)
        for (int i : tabell) {
            sum += i;
        }
        return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        boolean finnes = false;
        for (int i : tabell) {
            if (i == tall) {
                finnes = true;
            }
        }
        System.out.println();
        return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        int posisjon = -1;
        for (int index = 0; index < tabell.length; index++) {
            if (tabell[index] == tall) {
                posisjon = index;
            }
        }
        return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] newArr = new int[tabell.length];
        int reverseIndex = tabell.length - 1;
        for(int i = 0;i < tabell.length; i++){
            newArr[i] = tabell[reverseIndex];
            reverseIndex--;
        }
        return newArr;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		if(tabell == null || tabell.length <= 1){
	        return true;
	    }
	    for(int i = 0; i < tabell.length - 1; i++){
	        if(tabell[i] > tabell[i + 1]) {
	            return false;
	        }
	    }
	    return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] newArr = new int[tabell1.length + tabell2.length];
        int indexHolder = tabell1.length;
        for(int i = 0; i < tabell1.length; i++){
            newArr[i] = tabell1[i];
        }
        for (int i = 0; i < tabell2.length; i++){
            newArr[indexHolder] = tabell2[i];
            indexHolder++;
        }
        return newArr;
	}
}
