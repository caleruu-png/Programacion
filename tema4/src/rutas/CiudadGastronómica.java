package rutas;

import java.util.Arrays;

// La palabra 'extends' indica HERENCIA. CiudadGastronómica hereda atributos de Ciudad (nombre y hab).
public class CiudadGastronómica extends Ciudad {
	
	// Atributos específicos de la clase hija
	private String[] comidasTipicas = new String[10];
	private int numComidas = 0; // Contador real de elementos (importante para evitar los 'null')

	// CONSTRUCTOR: Se encarga de inicializar la parte de la madre y la propia
	public CiudadGastronómica(String nombre, int numHabitantes, String[] comidas) {
		// 'super' llama al constructor de Ciudad. Es obligatorio que sea la primera línea.
		super(nombre, numHabitantes);
		
		// Guardamos el array que nos pasan y actualizamos el contador
		this.comidasTipicas = comidas;
		this.numComidas = comidas.length;
	}

	// GETTERS Y SETTERS
	public String[] getComidasTipicas() {
		return comidasTipicas;
	}

	public int getNumComidas() {
		return numComidas;
	}

	public void setComidasTipicas(String[] comidasTipicas) {
		this.comidasTipicas = comidasTipicas;
		// Siempre que cambiamos el array, hay que actualizar el contador numComidas
		this.numComidas = comidasTipicas.length;
	}

	// MÉTODO addComida: Gestión dinámica de arrays
	public void addComida(String comida) {
		// Arrays.copyOf crea un array nuevo con una posición más (+1) y copia lo anterior
		// Redimensionamos 'comidasTipicas' para que quepa la nueva comida
		this.comidasTipicas = Arrays.copyOf(comidasTipicas, numComidas + 1);
		
		// Añadimos la nueva comida en el último hueco libre (el índice coincide con numComidas antes de sumar)
		this.comidasTipicas[numComidas] = comida;
		
		// Incrementamos el contador para que refleje el nuevo tamaño
		numComidas++;
	}

	
	@Override
	public String toString() {
		// super.toString() invoca el método de la clase Ciudad (nombre y habitantes)
		// Arrays.toString junto con copyOf evita que se impriman los huecos 'null' del array
		return super.toString() + " Comidas típicas: " + Arrays.toString(Arrays.copyOf(comidasTipicas, numComidas));
	}
}