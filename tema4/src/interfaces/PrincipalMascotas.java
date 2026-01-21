package interfaces;

import interfaces.Mascota.Origen;

public class PrincipalMascotas {

	public static void main(String[] args) {
		Mascota[] mascotas = new Mascota[5];
		mascotas[0] = new Perro("Boby", 10, Origen.Calle, true);
		mascotas[1] = new Gato("Misifu", 5, Origen.Asociacion, 9);
		mascotas[2] = new Perro("Coco", 2, Origen.Tienda, true);
		mascotas[3] = new Perro("Koda", 2, Origen.Otro_Dueño, false);
		mascotas[4] = new Gato("Pollo", 16, Origen.Calle, 2);
	}

}
