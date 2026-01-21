package herencias;

public class HoraExacta extends Hora {
	protected int segundos;

	public HoraExacta(int hora, int minuto, int segundos) {
		super(hora, minuto);
		setSegundos(segundos);
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}

	// metodos
	public void inc() {
		segundos++;
		if (segundos >= 60) {
			segundos -= 60;
			minuto++;
			if (minuto >= 60) {
				minuto -= 60;
				hora++;
				if (hora >= 24) {
					hora = 00;
				}
			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		HoraExacta horaParametro = (HoraExacta) obj;
		if (this.hora == horaParametro.hora && this.minuto == horaParametro.minuto
				&& this.segundos == horaParametro.segundos) {
			iguales=true;
		}
			return iguales;
	}

	@Override
	public String toString() {
		return "Hora " + hora + ":" + minuto + ":" + segundos;
	}
}
