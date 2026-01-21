package boletin1;

public class cuentaCorriente {
	// atributos
	private float saldo;
	public String nombre;
	protected String dni;
	private float limiteDescubierto;
	public String nombreBanco;

	// constructor
	public cuentaCorriente(String nombre, String dni) {
		super();
		this.saldo = 0;
		this.nombre = nombre;
		this.dni = dni;
		this.limiteDescubierto = -50;
	}

	public cuentaCorriente(float saldo) {
		super();
		this.saldo = saldo;
		this.limiteDescubierto = 0;

	}

	public cuentaCorriente(float saldo, String dni, float limite) {
		super();
		this.saldo = saldo;
		this.dni = dni;
		this.limiteDescubierto = limite;

	}

	// metodos
	public boolean sacarDinero(float retirada) {
		boolean operacion = false;
		if ((this.saldo - retirada) < limiteDescubierto) {
			System.out.println("No ha sido posible ralizar la operación.");
		} else {
			System.out.println("Ha sido posible ralizar la operación.");
			this.saldo -= retirada;
			operacion = true;
		}
		return operacion;
	}

	public void ingresarDinero(float ingreso) {
		this.saldo += ingreso;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre del titular: " + this.nombre + "\r\n" + "DNI del titular: " + this.dni + "\r\n"
				+ "Saldo: " + this.saldo + "\r\n");
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

}
