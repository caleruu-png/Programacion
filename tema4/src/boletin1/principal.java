package boletin1;

public class principal {

	public static void main(String[] args) {
		cuentaCorriente cc1= new cuentaCorriente("Carlos", "11111111a");
		
		cc1.ingresarDinero(100);
		cc1.mostrarInformacion();
		cc1.sacarDinero(60);
		cc1.mostrarInformacion();
		// Intento acceder a nombre (public) - FUNCIONA porque es público
		System.out.println(cc1.nombre);
		// Intento acceder a saldo (private) - NO FUNCIONA
		//System.out.println(cc1.saldo);
		// Intento acceder a dni (protected) - FUNCIONA porque estamos en el mismo paquete
		System.out.println(cc1.dni);
		// Intento acceder a limiteDescubierto (private) -  NO FUNCIONA
		//System.out.println(cc1.limiteDescubierto);
		Texto t = new Texto(20);  // longitud máxima 20

	}

}
