package Guerra;

import java.util.Arrays;
import java.util.Objects;

public class Pais {
	private String nombre; // nombre del pais
	private Guerra tablaGuerras[]; // guerras en las que ha participado este pais.
	private int nGuerras; // numero de elementos en la tabla.
	public static final int MAX_GUERRAS = 10; // constante con el maximo de guerras permitido en un pais.

	public Pais(String nombre) {
		this.nombre = nombre;
		this.tablaGuerras = new Guerra[Pais.MAX_GUERRAS];
		this.nGuerras = 0;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public void participoEn(Guerra guerra) {
		this.tablaGuerras[this.nGuerras++] = guerra;

	}

	public Pais[] posiblesEnemigos() {
		Pais[] paisesEnemigos = new Pais[10];
		int numPaisesInsertados = 0;

		for (int i = 0; i < this.nGuerras; i++) {

			if (this.tablaGuerras[i].getBandoA().contienePais(this)) {
				// los enemigos son los del bando B
				for (int j = 0; j < this.tablaGuerras[i].getBandoB().getnPaises(); j++) {
					if (!contiene(paisesEnemigos, numPaisesInsertados,
							this.tablaGuerras[i].getBandoB().getTablaPaises()[j])) {
						if (numPaisesInsertados >= paisesEnemigos.length) {
							paisesEnemigos = Arrays.copyOf(paisesEnemigos, numPaisesInsertados + 10);
						}
						paisesEnemigos[numPaisesInsertados++] = this.tablaGuerras[i].getBandoB().getTablaPaises()[j];
					}
				}
			} else {
				// los enemigos son los del bando A
				for (int j = 0; j < this.tablaGuerras[i].getBandoA().getnPaises(); j++) {
					if (!contiene(paisesEnemigos, numPaisesInsertados,
							this.tablaGuerras[i].getBandoA().getTablaPaises()[j])) {
						if (numPaisesInsertados >= paisesEnemigos.length) {
							paisesEnemigos = Arrays.copyOf(paisesEnemigos, numPaisesInsertados + 10);
						}
						paisesEnemigos[numPaisesInsertados++] = this.tablaGuerras[i].getBandoA().getTablaPaises()[j];
					}
				}
			}
		}

		return Arrays.copyOf(paisesEnemigos, numPaisesInsertados);
	}

	private static boolean contiene(Pais[] paisesEnemigos, int numPaisesInsertados, Pais pais) {
		boolean esta = false;
		for (int i = 0; i < numPaisesInsertados && !esta; i++) {
			if (paisesEnemigos[i].equals(pais)) {
				esta = true;
			}
		}

		return esta;
	}
	
	public Pais[] posiblesEnemigos() {
		Pais[] enemigosTemp = new Pais[10];
		int numEnemigos = 0;

		// 1. Recorremos las guerras en las que ha participado este país
		for (int i = 0; i < this.nGuerras; i++) {
			Guerra guerraActual = this.tablaGuerras[i];
			Bando bandoEnemigo = null;

			// 2. Averiguamos en qué bando estaba este país para determinar el contrario
			if (guerraActual.getBandoA().contienePais(this)) {
				// Si yo estaba en el A, mis enemigos son el B
				bandoEnemigo = guerraActual.getBandoB();
			} else if (guerraActual.getBandoB().contienePais(this)) {
				// Si yo estaba en el B, mis enemigos son el A
				bandoEnemigo = guerraActual.getBandoA();
			}

			// 3. Añadimos los países del bando contrario al array temporal
			if (bandoEnemigo != null) {
				// Recorremos los países del bando enemigo
				for (int j = 0; j < bandoEnemigo.getnPaises(); j++) {
					Pais posibleEnemigo = bandoEnemigo.getTablaPaises()[j];

					// Verificamos que no lo hayamos añadido ya (evitar duplicados)
					if (!contienePais(enemigosTemp, numEnemigos, posibleEnemigo)) {
						
						// Si el array temporal se llena, lo redimensionamos
						if (numEnemigos >= enemigosTemp.length) {
							enemigosTemp = Arrays.copyOf(enemigosTemp, enemigosTemp.length + 10);
						}
						
						enemigosTemp[numEnemigos++] = posibleEnemigo;
					}
				}
			}
		}

		// 4. Devolvemos el array recortado al tamaño exacto
		return Arrays.copyOf(enemigosTemp, numEnemigos);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(nombre, other.nombre);
	}
}
