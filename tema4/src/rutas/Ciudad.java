package rutas;

public class Ciudad implements Comparable<Ciudad>{
	private String nombre;
	private int numHabitantes;
	
	public Ciudad(String nombre, int numHabitantes) {
		super();
		this.nombre = nombre;
		this.numHabitantes = numHabitantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHabitantes() {
		return numHabitantes;
	}

	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}

	@Override
	public String toString() {
		return " "+nombre + "(" + numHabitantes + ") ";
	}

	@Override
	public int compareTo(Ciudad o) {
		//hacemos la comparacion de nombres y la guardamos en una variable
		int comparacionNombre = this.nombre.compareToIgnoreCase(o.getNombre());
		//aqui guardamos la diferencia de habitantes para usarla despues
		int diferenciaHabitantes = Math.abs(this.numHabitantes-o.numHabitantes);
		
		if(comparacionNombre==0 && diferenciaHabitantes<=100) {
			return 0;
		}else if(comparacionNombre!=0) {
			return comparacionNombre;
		}else {
			return diferenciaHabitantes;
		}
		
	}
	
	
	
}
