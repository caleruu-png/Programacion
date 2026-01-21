package herencias;

import java.util.Arrays;

public abstract class Instrumento {

	public enum Nota {
		DO, RE, MI, FA, SOL, LA, SI
	}

	protected Nota[] notas;
	protected int contadorNotas;
	protected final int MAX_NOTAS = 100;

	public Instrumento() {
		this.notas = new Nota[MAX_NOTAS];
		this.contadorNotas = 0;
	}

	public void add(Nota n) {
		if (contadorNotas < notas.length) {
			notas[contadorNotas] = n;
			contadorNotas++;
		}
	}
	
	public abstract void interpretar();

	@Override
	public String toString() {
		return "Instrumento [notas=" + Arrays.toString(notas) + ", contadorNotas=" + contadorNotas + ", MAX_NOTAS="
				+ MAX_NOTAS + "]";
	}
	
	
}
