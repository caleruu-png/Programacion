package herencias;

public class Hora12 extends Hora {
	protected String tramo;

	// constructor
	public Hora12(int hora, int minuto, String tramo) {
		super(hora, minuto);
		this.tramo = tramo;
	}

	// getters y setters
	public String getTramo() {
		return tramo;
	}

	public void setTramo(String tramo) {
		this.tramo = tramo;
	}

	@Override
	public void setHora(int hora) {
		if (hora >= 1 && hora <= 12) {
			this.hora = hora;
		}
	}

	// metodos
	public void inc() {
		minuto++;
		if (minuto >= 60) {
			minuto -= 60;
			hora++;
			if (hora > 12) {
				hora = 1;
				if (tramo.equals("am")) {
					tramo = "pm";
				} else {
					tramo = "am";
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Hora  " + hora + ":" + minuto + " " + tramo;
	}

}
