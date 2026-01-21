package herencias;

public class Hora {
	protected int hora;
	protected int minuto;

	// Constructor
	public Hora(int hora, int minuto) {
		super();
		setHora(hora);
		setMinuto(minuto);
	}

	// getters y setters
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
	}

	// metodos
	public void inc() {
		minuto++;
		if (minuto >= 60) {
			minuto -= 60;
			hora++;
			if (hora >= 24) {
				hora = 00;
			}
		}
	}

	@Override
	public String toString() {
		return "Hora "+ hora + ":" + minuto;
	}
	
	

}
