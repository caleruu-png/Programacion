package refuerzo;

public class Alumno {
	private String nombre;
	private int edad;
	private long expediente;

//constructores
	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Alumno(String nombre, int edad, long expediente) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.expediente = expediente;
	}

//getters y setters
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

	public long getExpediente() {
		return expediente;
	}

	public void setExpediente(long expediente) {
		this.expediente = expediente;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", expediente=" + expediente + "]";
	}

}
