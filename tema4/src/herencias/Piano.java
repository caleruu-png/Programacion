package herencias;

public abstract class Piano extends Instrumento {

	@Override
	public void interpretar() {
		for (int i = 0; i < contadorNotas; i++) {
			System.out.println("Piano: " + notas[i]);
		}
	}
}
