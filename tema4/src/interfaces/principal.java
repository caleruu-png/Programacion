package interfaces;

import java.util.Arrays;

public class principal {

	public static void main(String[] args) {
		Cliente[] clientes= new Cliente[5];
		clientes[0]=new Cliente("11111111a", 18, "carlos", 1);
		clientes[1]=new Cliente("44444444d", 20, "Francisco", 100);
		clientes[2]=new Cliente("33333333c", 55, "pepe", 800000);
		clientes[3]=new Cliente("22222222b", 35, "rocio", 562);
		clientes[4]=new Cliente("55555555e", 66, "romualdo", 10000000);
		
		Arrays.sort(clientes);
		System.out.println(Arrays.toString(clientes));
	}

}
