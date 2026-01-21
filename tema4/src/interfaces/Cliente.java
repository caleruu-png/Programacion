package interfaces;

import java.util.Objects;

public class Cliente implements Comparable <Cliente>{

	protected String dni;
	protected int edad;
	protected String nombre;
	protected float saldo;
	protected Cliente[] clientes;

	public Cliente(String dni, int edad, String nombre, float saldo) {
		super();
		this.dni = dni;
		this.edad = edad;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}

	@Override
	public int compareTo(Cliente o) {
		int res=0;
		if(this.dni.compareTo(o.dni)<0) {
			res=-1;
		}else if(this.dni.compareTo(o.dni)>0) {
			res=1;
		}
		return this.dni.compareTo(o.dni);
	}

}
