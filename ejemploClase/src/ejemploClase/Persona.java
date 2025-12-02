package ejemploClase;

public class Persona {
	/*Atributos*/
	private String nombre;
	private byte edad;
	private double estatura;
	
	/*Getters y setters*/
	public String getNombre() {
		return  nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public byte getEdad() {
		return  edad;
	}
	
	public void setEdad(byte edad) {
		if(edad>0) {
			this.edad=edad;
		}
	}
	
	public double getEstatura() {
		return  estatura;
	}
	
	public void setEstatura(double estatura) {
		this.estatura=estatura;
	}
	
	/*Constructores*/
	public Persona(String nombre, byte edad, double estatura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	public Persona(String nombre, byte edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	/*Metodos*/
	void saludar() {
		System.out.println("Hola. Mi nombre es " + nombre);
		System.out.println("Encantado de conocerte");
	}

	void cumplirAños() {
		edad++;
	}

	void crecer(double incremento) {
		estatura += incremento;
	}

	
	
	

}
