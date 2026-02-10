package examen2ev.biblioteca.fuentes;

import java.time.LocalDate;
import java.util.Arrays;

public class Biblioteca {

	private MaterialBibliografico[] materiales;
	private int numMateriales;
	private Usuario[] usuarios;
	private int numUsuarios;

	public Biblioteca(int tamMax) {
		this.materiales = new MaterialBibliografico[tamMax];
		this.numMateriales = 0;
		this.usuarios = new Usuario[tamMax];
		this.numUsuarios = 0;
	}

	public MaterialBibliografico[] getMateriales() {
		return materiales;
	}

	public int getNumMateriales() {
		return numMateriales;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public int getNumUsuarios() {
		return numUsuarios;
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios[numUsuarios] = usuario;
		numUsuarios++;
	}

	public boolean addMaterial(MaterialBibliografico m) {
		boolean anyadido = false;
		if (numMateriales < materiales.length) {
			materiales[numMateriales++] = m;
			anyadido = true;
		}
		return anyadido;
	}

	public String toString() {
		String cadBiblio = "";
		for (int i = 0; i < numMateriales; i++) {
			cadBiblio += "\n" + materiales[i].toString();
		}
		return cadBiblio;
	}

	// a)
	/*
	 * que devuelve una tabla de objetos de la clase MaterialBibliografico con todos
	 * materiales ordenados. El tama�o de la tabla debe ser el del n�mero de
	 * materiales que contenga. El orden natural de los objetos
	 * MaterialBibliografico es por a�o de publicaci�n de manera descendente (los
	 * a�os m�s actuales van primero, y al final, los m�s antiguos). A igualdad de
	 * a�o, se ordenan ascendentemente por titulo. Crea el m�todo que corresponda
	 * para implementar esta ordenaci�n.
	 */
	public MaterialBibliografico[] getMaterialesOrdenados() {
		MaterialBibliografico[] tablaordenada = new MaterialBibliografico[numMateriales];
		for (int i = 0; i < numMateriales; i++) {
			tablaordenada[i] = materiales[i];
		}
		Arrays.sort(tablaordenada);
		return tablaordenada;
	}

	// b)
	/*
	 * que busca dicho usuario entre los de la biblioteca, y le agrega el pr�stamo
	 * recibido como par�metro a sus pr�stamos. Si el material o el usuario no est�n
	 * registrados en la biblioteca, o el material est� marcado como prestado en los
	 * materiales de la biblioteca, el pr�stamo no debe incluirse. Devuelve true o
	 * false dependiendo de si el pr�stamo ha sido registrado o no. Se considera un
	 * material igual que otro si su t�tulo, autor y a�o de publicaci�n son iguales.
	 * Se considera un usuario igual que otro si su n�mero de identificaci�n es
	 * igual. Cabo suelto: N�tese que no estamos actualizando el campo prestado del
	 * material cuando el pr�stamo se realiza. Ya lo haremos en el m�todo del
	 * apartado d).
	 * 
	 */

	public boolean agregarPrestamo(Prestamo prestamo, Usuario usuario) {
		boolean enc = false;

		for (int i = 0; i < numMateriales; i++) {

			if (prestamo.getMaterialBibliografico().equals(materiales[i])) {
				enc = true;
			}

			if (prestamo.getMaterialBibliografico().equals(materiales[i]) && materiales[i].estaPrestado() == true) {

				return false;
			}
		}

		if (enc == false) {
			return false;
		}

		for (int i = 0; i < numUsuarios; i++) {
			if (usuarios[i].equals(usuario)) {
				usuarios[i].agregarPrestamo(prestamo);
				return true;
			}
		}
		return false;
	}

	// c)
	/*
	 * M�todo que marca el material como devuelto tanto en los materiales de la
	 * biblioteca como en los materiales de los pr�stamos de los usuarios de la
	 * biblioteca, e indica la fecha de devoluci�n en sus pr�stamos.
	 */
	public void devolver(MaterialBibliografico mat, LocalDate fechaDev) {
		for (int i = 0; i < numMateriales; i++) {
			if (materiales[i].equals(mat)) {
				materiales[i].devolver();
			}
		}
		for (int i = 0; i < numUsuarios; i++) {
			for (int j = 0; j < usuarios[i].getNumPrestamos(); j++) {
				if (usuarios[i].getPrestamos()[j].getMaterialBibliografico().equals(mat)
						&& usuarios[i].getPrestamos()[j].getFechaDevolucion() == null) {
					usuarios[i].getPrestamos()[j].setFechaDevolucion(fechaDev);
				}
			}
		}
	}

	// d)
	/*
	 * Actualiza el campo prestado del material bibliogr�fico de la biblioteca
	 * teniendo en cuenta los pr�stamos de los usuarios. Si, para un material, hay
	 * alg�n pr�stamo de alguno de los usuarios cuya fecha de devoluci�n sea nula,
	 * quiere decir que est� prestado, y si no hay pr�stamos, o los que hay, tienen
	 * fecha de devoluci�n, es que ese material no est� prestado.
	 */
	public void actualizaMaterialesPrestados() {
		for (int i = 0; i < numUsuarios; i++) {
			for (int j = 0; j < usuarios[i].getNumPrestamos(); j++) {
				if (usuarios[i].getPrestamos()[j].getFechaDevolucion() == null) {
					usuarios[i].getPrestamos()[j].getMaterialBibliografico().prestar();
				}
			}
		}
	}

	// e)
	/*
	 * Devuelve un array -del tama�o justo- con los pr�stamos asociados al material
	 * que se pasa como par�metro.
	 */
	public Prestamo[] prestamosDeMaterial(MaterialBibliografico material) {
		Prestamo[] prestamoMaterial = new Prestamo[10];
		int numPrestamosInsert = 0;
		for (int i = 0; i < numUsuarios; i++) {
			for (int j = 0; j < usuarios[i].getNumPrestamos(); j++) {
				if (usuarios[i].getPrestamos()[j].getMaterialBibliografico().equals(material)) {
					prestamoMaterial[numPrestamosInsert++]= usuarios[i].getPrestamos()[j];
				}
			}
		}

		return Arrays.copyOf( prestamoMaterial, numPrestamosInsert);
	}

}
