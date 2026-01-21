package refuerzo;

import java.util.Arrays;

public class Grupo {
	private String nombreGrupo;
	private Profesor tutor;
	private final static int MAX = 30;
	private Alumno[] alumnos;
	private int numAlumnos;

//constructor
	public Grupo(String nombreGrupo, Profesor tutor) {
		super();
		this.nombreGrupo = nombreGrupo;
		this.tutor = tutor;
		this.alumnos = new Alumno[MAX];
		this.numAlumnos = 0;
	}

//getters and setters
	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public Profesor getTutor() {
		return tutor;
	}

	public void setTutor(Profesor tutor) {
		this.tutor = tutor;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public static int getMax() {
		return MAX;
	}

// metodos

	public boolean addAlumno(Alumno a) {
		boolean anyadido=false;
		for(int i=0;i<numAlumnos;i++) {
			if(alumnos[i].getNombre().equalsIgnoreCase(a.getNombre())) {
				anyadido=false;
			}
		}
		if (numAlumnos < alumnos.length) {
			alumnos[numAlumnos++] = a;
			anyadido=true;
		}
		return anyadido;
	}
	
	public boolean pertenece(Alumno a) {
		for(int i=0;i<numAlumnos;i++) {
			if(alumnos[i].getExpediente()== a.getExpediente()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String datosALumnosInsertados = "";
		for (int i = 0; i < numAlumnos; i++) {
			datosALumnosInsertados += alumnos[i];
		}
		return "Grupo [nombreGrupo=" + nombreGrupo + ", tutor=" + tutor + ", Alumnos=" + datosALumnosInsertados + "]";
	}

}
