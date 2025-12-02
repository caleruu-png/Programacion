package ejemploClase;

public class Principal {

	public static void main(String[] args) {
		/*Objeto 1*/
		Persona p1 = new Persona("pepa",18,1.87);
		
		p1.saludar();
		/*Objeto 2*/
		Persona p2 = new Persona();
		p2.setNombre("Miguel");
		p2.setEdad((byte)24);
		p2.setEstatura(1.57);

		p2.saludar();
		/*Objeto 3*/
		Persona p3 = new Persona();
		p3.setNombre("Paco");
		p3.setEdad((byte)57);
		p3.setEstatura(1.77);
		
		p3.saludar();
	}

}
