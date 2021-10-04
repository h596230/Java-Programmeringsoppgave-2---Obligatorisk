package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        for(int[] m : matrise){
        	for(int i : m) {
        		System.out.print(i);
        	}
        	System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String str = "";
        for(int[] m : matrise){
            for(int i = 0; i< m.length; i++){
                str += m[i] + " ";
            }
            str += "\n";
        }
        return str;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] newM = new int[matrise.length][];
        for (int i = 0; i < matrise.length; i++) {
            int[] midlertidig = new int[matrise[i].length];
            for (int j = 0; j < matrise[i].length; j++) {
                midlertidig[j] = tall * matrise[i][j];
            }
            newM[i] = midlertidig;
        }
        return newM;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length == b.length){
            for(int i  = 0; i < a.length; i++){
                if(a[i].length == b[i].length){
                    for(int j = 0; j < a[i].length; j++){
                        if(a[i][j] !=b[i][j]){
                            return false;
                        }
                    }
                }else {
                    return false;
                }
            }
        //
        }else {
            return false;
        }
    return true;
    }
	// fikk ikke e og f til
}
