package pruebas;

import java.util.Arrays;

public class binarysearch {

	public static void main(String[] args) {
		int[] t= {30,10,5,20,25,35,15};
		int numelem=7;
		int[] trec=Arrays.copyOf(t, numelem);
		Arrays.sort(trec);
		System.out.println(Arrays.toString(trec));
		int pos=Arrays.binarySearch(trec, 11);
		int posInsercion = 0;
		if (pos<0) {
			posInsercion=-pos-1;
		}
		System.out.println(posInsercion);
		
		
		if (numelem==trec.length) {
			trec=Arrays.copyOf(trec, trec.length+1);
		}
		
		System.out.println(Arrays.toString(trec));
		for (int i = trec.length - 1; i > posInsercion; i--) {
		    trec[i] = trec[i - 1];
		}
		trec[posInsercion]=11;
		System.out.println(Arrays.toString(trec));
	}

}
