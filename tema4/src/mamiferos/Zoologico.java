package mamiferos;
import java.util.Arrays;

public class Zoologico {
	private Mamifero tMamiferos[];
	private Veterinario tVeterinarios[];

	public Zoologico() {
		this.tVeterinarios = new Veterinario[0];
		this.tMamiferos = new Mamifero[0];
	}

	public Mamifero[] gettMamiferos() {
		return tMamiferos;
	}

	public Veterinario[] gettVeterinarios() {
		return tVeterinarios;
	}

	public void addVeterinario(Veterinario veterinario) {
		this.tVeterinarios=Arrays.copyOf(this.tVeterinarios, this.tVeterinarios.length + 1);
		this.tVeterinarios[this.tVeterinarios.length-1] = veterinario;
	}

	public void addMamifero(Mamifero mamifero) {
		this.tMamiferos = Arrays.copyOf(tMamiferos, this.tMamiferos.length + 1);
		tMamiferos[this.tMamiferos.length-1] = mamifero;
	}

	/*
	 * devuelve todos los mam�feros que hayan nacido entre 
	 * las fechas de inicio y fin que se pasan como par�metros.*/
	
	public Mamifero[] getMamiferosEntreFechas(Fecha inicio, Fecha fin) {
		Mamifero[] mamiferosNacidosEn = new Mamifero[0];
		for (int i = 0; i < tMamiferos.length; i++) {
			if (tMamiferos[i].getDiaNacimiento().compareTo(inicio) >= 0
					&& tMamiferos[i].getDiaNacimiento().compareTo(fin) <= 0) {
				
				mamiferosNacidosEn = Arrays.copyOf(mamiferosNacidosEn, mamiferosNacidosEn.length + 1);
				mamiferosNacidosEn[mamiferosNacidosEn.length - 1] = tMamiferos[i];
			}
		}
		return mamiferosNacidosEn;
	}

	public int getNVeterinariosMasDe(int minNumNacimientos) {
		int contadorVeterinariosMasNacimientos = 0;
		for (Veterinario v : tVeterinarios) {
			int contadorNacimientosV = 0;
			for (Mamifero m : tMamiferos) {
				if (m.getAsistente().equals(v)) {
					contadorNacimientosV++;
				}
			}
			if (contadorNacimientosV >= minNumNacimientos) {
				contadorVeterinariosMasNacimientos++;
			}
		}
		return contadorVeterinariosMasNacimientos;
	}

	public boolean veterinarioPadresEHijo() {
		return false;
	}

	public void ordenarMamiferos() {}
}
