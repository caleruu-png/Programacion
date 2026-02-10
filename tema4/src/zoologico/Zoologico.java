package zoologico;
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
		return null;
	}

	public int getNVeterinariosMasDe(int minNumNacimientos) {
		return 0;
	}

	public boolean veterinarioPadresEHijo() {
		return false;
	}

	public void ordenarMamiferos() {}
}
