package rutas;

import java.util.Arrays;

public class ListaRutas {
	private Ruta[] rutas;
	private int numRutas = 0;

	public ListaRutas(Ruta[] rutas) {
		super();
		setRutas(rutas);
	}

	public ListaRutas() {
		super();
		rutas = new Ruta[10];
	}

	public Ruta[] getRutas() {
		return rutas;
	}

	public int getNumRutas() {
		return numRutas;
	}

	public void setRutas(Ruta[] rutas) {
		this.rutas = rutas;
		numRutas = 0;
		for (int i = 0; i < rutas.length && rutas[i] != null; i++) {
			numRutas++;
		}
	}

	public void addRuta(Ruta r) {
		if (this.rutas.length >= this.numRutas) {
			this.rutas = Arrays.copyOf(rutas, this.rutas.length + 1);
		}
		this.rutas[numRutas++] = r;
	}

	// Apartado a): Comprobar si existe una ruta directa
	public boolean hayRutaEntre(Ciudad origen, Ciudad destino) {
		// Recorremos el array de rutas hasta el número real de rutas guardadas
		for (int i = 0; i < numRutas; i++) {
			// Usamos compareTo == 0 para aplicar la regla del examen (Nombre igual y <100
			// hab)
			// Comprobamos que coincidan tanto el origen como el destino
			if (rutas[i].getOrigen().compareTo(origen) == 0 && rutas[i].getDestino().compareTo(destino) == 0) {
				return true; // Si coinciden ambos, existe la ruta
			}
		}
		return false; // Si termina el bucle sin encontrar nada, no existe
	}

	// Apartado b): Comprobar ida y vuelta
	public boolean hayRutaDeIdaYVueltaEntre(Ciudad origen, Ciudad destino) {
		// Reutilizamos el método del apartado A para la ida
		boolean ida = hayRutaEntre(origen, destino);
		// Reutilizamos el apartado A para la vuelta (invirtiendo parámetros)
		boolean vuelta = hayRutaEntre(destino, origen);

		// Solo devuelve true si AMBAS variables son verdaderas
		return ida && vuelta;
	}

	// Apartado c): Filtrar rutas que salen de una ciudad específica
	public ListaRutas getRutasDesde(Ciudad origen) {
		// Creamos un nuevo objeto de la clase ListaRutas para guardar los resultados
		ListaRutas rutasDesde = new ListaRutas();

		for (int i = 0; i < numRutas; i++) {
			// Si el origen de la ruta actual es igual al solicitado por parámetro...
			if (rutas[i].getOrigen().compareTo(origen) == 0) {
				// ...la añadimos a la nueva lista usando el método de la clase
				rutasDesde.addRuta(rutas[i]);
			}
		}
		return rutasDesde; // Devolvemos el objeto ListaRutas con las rutas filtradas
	}

	// Apartado d): Obtener array de ciudades que superan X habitantes sin repetir
	public Ciudad[] getCiudadesImportantes(int numHabitantes) {
		// Creamos un array provisional (tamaño 10)
		Ciudad[] ciudades = new Ciudad[10];
		int numCiudades = 0; // Contador para saber cuántas ciudades únicas hemos añadido

		for (int i = 0; i < numRutas; i++) {
			// 1. Verificamos el ORIGEN: ¿Es importante? Y ¿NO está ya en nuestro array?
			if (rutas[i].getOrigen().getNumHabitantes() >= numHabitantes
					&& !contieneCiudad(ciudades, numCiudades, rutas[i].getOrigen())) {
				ciudades[numCiudades++] = rutas[i].getOrigen();

			// 2. Verificamos el DESTINO: ¿Es importante? Y ¿NO está ya?
			}
			if (rutas[i].getDestino().getNumHabitantes() >= numHabitantes
					&& !contieneCiudad(ciudades, numCiudades, rutas[i].getDestino())) {
				ciudades[numCiudades++] = rutas[i].getDestino();
			}
		}
		// Ajustamos el array al tamaño real (quitando los huecos null) antes de devolverlo
		return Arrays.copyOf(ciudades, numCiudades);
	}

	// Método auxiliar para el apartado D: Busca si una ciudad ya está en un array
	private boolean contieneCiudad(Ciudad[] lista, int cantidad, Ciudad ciudadBuscada) {
		for (int i = 0; i < cantidad; i++) {
			// Usamos nuestro compareTo: devuelve 0 si cumplen los requisitos de igualdad
			if (lista[i].compareTo(ciudadBuscada) == 0) {
				return true; // Ciudad encontrada, está duplicada
			}
		}
		return false; // Ciudad no encontrada en la lista actual
	}

	// e)
	public ListaRutas getListaOrdenada() {
		ListaRutas listaOrdenada = new ListaRutas();
		for (int i = 0; i < numRutas; i++) {
			listaOrdenada.addRuta(rutas[i]);
		}
		Arrays.sort(listaOrdenada.getRutas(),0,numRutas);
		return listaOrdenada;
	}

	@Override
	public String toString() {
		return "ListaRutas [rutas=" + Arrays.toString(Arrays.copyOf(rutas, numRutas)) + "]";
	}

}
