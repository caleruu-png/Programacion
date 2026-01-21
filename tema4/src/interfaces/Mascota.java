package interfaces;

import java.util.Objects;

public class Mascota {
	protected String nombre;
	protected int edad;

	protected enum Origen {
		Asociacion, Tienda, Calle, Otro_Dueño
	}

	protected Origen origen;

	public Mascota(String nombre, int edad, Origen origen) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.origen = origen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, origen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre) && origen == other.origen;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", origen=" + origen + "]";
	}

}
