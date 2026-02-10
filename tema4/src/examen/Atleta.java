package examen;

public class Atleta implements Comparable<Atleta> {
	private String nombre;
	private int medallasOro;
	private ListaAtletas rivales;

	public Atleta(String nombre, int medallasOro) {
		this.nombre = nombre;
		this.medallasOro = medallasOro;
		this.rivales = new ListaAtletas();
	}

	public ListaAtletas getRivales() {
		return rivales;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMedallasOro() {
		return medallasOro;
	}

	public void setMedallasOro(int medallasOro) {
		this.medallasOro = medallasOro;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRivales(ListaAtletas rivales) {
		this.rivales = rivales;
	}

	// Apartado b)
	public void registrarRival(Atleta a) {
		boolean esta = false;
		for (int j = 0; j < rivales.getNumAtletas(); j++) {
			if (rivales.getTabla()[j].compareTo(a) == 0) {
				esta = true;
			} else {
				esta = false;
			}
		}
		if (!esta) {
			if (this.compareTo(a) != 0) {
				rivales.anyadeAtleta(a);
			}
		}
	}

	// Apartado f)
	public ListaAtletas rivalesEnComun(Atleta otro) {
		ListaAtletas rivalesComun = new ListaAtletas();
		for (int i = 0; i < this.rivales.getNumAtletas(); i++) {
			for (int j = 0; j < otro.rivales.getNumAtletas(); j++) {
				if (this.rivales.getAtleta(i).compareTo(otro.rivales.getAtleta(j)) == 0
						&& !rivalesComun.contieneAtleta(this.rivales.getAtleta(i))) {
					rivalesComun.anyadeAtleta(this.rivales.getAtleta(i));
				}
			}
		}
		return rivalesComun;
	}

	@Override
	public String toString() {
		String nombresRivales = "[";
		for (int i = 0; i < this.rivales.getNumAtletas(); i++) {
			nombresRivales += rivales.getAtleta(i).nombre;
			if (i < this.rivales.getNumAtletas() - 1) {
				nombresRivales += ", ";
			}
			;

		}
		nombresRivales += "]";
		return "Atleta [nombre=" + nombre + ", medallasOro=" + medallasOro + ", rivales=" + nombresRivales + "]";
	}

	@Override
	public int compareTo(Atleta o) {
		int comparacionNombre = this.nombre.compareToIgnoreCase(o.getNombre());

		int comparacionMedallas = o.medallasOro - this.medallasOro;

		if (comparacionMedallas == 0) {
			return comparacionNombre;
		} else {
			return comparacionMedallas;
		}
	}

}
