package interfaces;

public class Perro extends Mascota {

	private boolean tieneChip;

	public Perro(String nombre, int edad, Origen origen, boolean tieneChip) {
		super(nombre, edad, origen);
		this.tieneChip = tieneChip;
	}

	public boolean isTieneChip() {
		return tieneChip;
	}

	public void setTieneChip(boolean tieneChip) {
		this.tieneChip = tieneChip;
	}

	@Override
	public String toString() {
		return "Perro [tieneChip=" + tieneChip + "]";
	}

}
