package pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] t= {30,10,5,20,25,35,15};
		int numelem=7;
		System.out.println("Inserte el numero a introducir en la tabla");
		int num=sc.nextInt();
		int[] trec=Arrays.copyOf(t, numelem);
		Arrays.sort(trec);
		System.out.println(Arrays.toString(trec));
		int pos=Arrays.binarySearch(trec, num);
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
		trec[posInsercion]=num;
		System.out.println(Arrays.toString(trec));
		sc.close();
	}

}
