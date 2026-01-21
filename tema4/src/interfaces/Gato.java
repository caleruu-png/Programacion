package interfaces;

public class Gato extends Mascota {

	private int pelosBigote;

	public Gato(String nombre, int edad, Origen origen, int pelosBigote) {
		super(nombre, edad, origen);
		this.pelosBigote=pelosBigote;
	}

	public int getPelosBigote() {
		return pelosBigote;
	}

	public void setPelosBigote(int pelosBigote) {
		this.pelosBigote = pelosBigote;
	}

	@Override
	public String toString() {
		return "Gato [pelosBigote=" + pelosBigote + "]";
	}
	
	
}
