package Guerra;

public class Guerra {
	private String denominaciin; // nombre de la guerra
	private Bando bandoA; // uno de los dos bandos que lucharon en esta guerra
	private Bando bandoB; // el otro bando que luchi en esta guerra.
	private Batalla tablaBatallas[]; // batallas que tuvieron lugar en esta guerra
	private int nBatallas; // numero de batallas en la tabla
	public static final int MAX_BATALLAS = 10; // maximo

	public Guerra(String denominaciin, Bando BandoA, Bando BandoB) {
		this.denominaciin = denominaciin;
		this.bandoA = BandoA;
		this.bandoB = BandoB;
		this.tablaBatallas = new Batalla[Guerra.MAX_BATALLAS];
		this.nBatallas = 0;
	}

	public void anyadeBatalla(Batalla batalla) {
		this.tablaBatallas[nBatallas++] = batalla;
	}

	public Bando getBandoA() {
		return bandoA;
	}

	public Bando getBandoB() {
		return bandoB;
	}
	
	public int getNPaises() {
		return this.bandoA.getnPaises()+this.bandoB.getnPaises();
	}

	public int compareTo(Guerra otra) {
		return this.getNPaises()-otra.getNPaises();
	}
	
	@Override
	public String toString() {
		String cad = "Guerra: " + denominaciin + "\n\n" + "    Bando:   " + bandoA // + "\n"
				+ "    Bando:   " + bandoB // + "\n"
				+ "    Batallas:\n";
		for (int i = 0; i < this.nBatallas; i++)
			cad += "             " + this.tablaBatallas[i] + "\n";

		return cad;
	}
}
