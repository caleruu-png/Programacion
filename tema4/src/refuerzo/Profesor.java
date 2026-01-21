package refuerzo;

public class Profesor {

	private String nombre;
	private int edad;
	private String especialidad;

//constructores
	public Profesor(String nombre, int edad, String especialidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.especialidad = especialidad;
	}

//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", especialidad=" + especialidad + "]";
	}

}
