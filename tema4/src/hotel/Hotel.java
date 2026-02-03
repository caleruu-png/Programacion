package hotel;

import java.util.Arrays;

public class Hotel {
	private Reserva tReservas[];
	private Cliente tClientes[];
	private Habitacion tHabitaciones[];

	public Hotel() {
		this.tClientes = new Cliente[0];
		this.tHabitaciones = new Habitacion[0];
		this.tReservas = new Reserva[0];
	}

	public void anyadeCliente(Cliente cliente) {
		Cliente tNueva[] = new Cliente[this.tClientes.length + 1];
		for (int i = 0; i < this.tClientes.length; i++)
			tNueva[i] = this.tClientes[i];
		tNueva[this.tClientes.length] = cliente;
		this.tClientes = tNueva;
	}

	public void anyadeHabitacion(Habitacion habitacion) {
		Habitacion tNueva[] = new Habitacion[this.tHabitaciones.length + 1];
		for (int i = 0; i < this.tHabitaciones.length; i++)
			tNueva[i] = this.tHabitaciones[i];
		tNueva[this.tHabitaciones.length] = habitacion;
		this.tHabitaciones = tNueva;
	}

	public void anyadeReserva(Reserva reserva) {
		Reserva tNueva[] = new Reserva[this.tReservas.length + 1];
		for (int i = 0; i < this.tReservas.length; i++)
			tNueva[i] = this.tReservas[i];
		tNueva[this.tReservas.length] = reserva;
		this.tReservas = tNueva;
	}

	public Reserva[] getReservasDeHabitacion(Habitacion habitacion) {
		int contador = 0;

		for (int i = 0; i < this.tReservas.length; i++) {
			if (this.tReservas[i] != null && this.tReservas[i].getHabitacion() == habitacion) {
				contador++;
			}
		}

		Reserva[] resultado = new Reserva[contador];
		int j = 0;
		for (int i = 0; i < this.tReservas.length; i++) {
			if (this.tReservas[i] != null && this.tReservas[i].getHabitacion() == habitacion) {
				resultado[j] = this.tReservas[i];
				j++;
			}
		}

		return resultado;
	}

	public Habitacion[] habitacionesOcupadasElDia(Fecha fecha) {
		Habitacion[] h= new Habitacion[10];
		int contador = 0;
		for(int i=0;i<this.tReservas.length;i++) {
			if(this.tReservas[i].getFechaInicio().compareTo(fecha)<=0 && this.tReservas[i].getFechaFin().compareTo(fecha)>=0) {
				contador ++;
				if(contador>=h.length) {
					h= Arrays.copyOf(h,contador+10);
				}
				h[contador++] = tReservas[i].getHabitacion();
			}
			
		}
		return Arrays.copyOf(h, contador);
	}

	public boolean habitacionDisponible(Habitacion habitacion, Fecha inicio, Fecha fin) {
		return true;
	}

	public boolean hayErroresEnReservas() {
		return true;
	}

}