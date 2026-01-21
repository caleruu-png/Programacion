package herencias;

public abstract class Campana extends Instrumento {

	@Override
    public void interpretar() {
        for (int i = 0; i < contadorNotas; i++) {
            System.out.println("Campana: " + notas[i]);
        }
    }
}
