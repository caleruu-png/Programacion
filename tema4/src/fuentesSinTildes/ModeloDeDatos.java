package fuentesSinTildes;

public class ModeloDeDatos {

	Articulo tArticulos[];
	Cliente tClientes[];
	Factura tFacturas[];

	public ModeloDeDatos() {
		this.tArticulos = new Articulo[0];
		this.tClientes = new Cliente[0];
		this.tFacturas = new Factura[0];
	}

	public void anadeArticulo(Articulo ArticuloNuevo) {
		Articulo nuevaTArticulos[] = new Articulo[this.tArticulos.length + 1];
		for (int i = 0; i < this.tArticulos.length; i++)
			nuevaTArticulos[i] = tArticulos[i];

		nuevaTArticulos[this.tArticulos.length] = ArticuloNuevo;
		this.tArticulos = nuevaTArticulos;
	}

	public void anadeFactura(Factura FacturaNueva) {
		Factura nuevaTFacturas[] = new Factura[this.tFacturas.length + 1];
		for (int i = 0; i < this.tFacturas.length; i++)
			nuevaTFacturas[i] = tFacturas[i];

		nuevaTFacturas[this.tFacturas.length] = FacturaNueva;
		this.tFacturas = nuevaTFacturas;
	}

	public void anadeCliente(Cliente clienteNuevo) {
		Cliente nuevaTClientes[] = new Cliente[this.tClientes.length + 1];
		for (int i = 0; i < this.tClientes.length; i++)
			nuevaTClientes[i] = tClientes[i];

		nuevaTClientes[this.tClientes.length] = clienteNuevo;
		this.tClientes = nuevaTClientes;
	}

	public Factura facturaFusionada(Cliente cliente, int numFra) {
		Factura fusionada = new Factura(numFra, cliente, 0F);

		for (Factura f : this.tFacturas) {
			if (f.getCliente().equals(cliente)) {
				for (Linea l : f.gettLineas()) {
					fusionada.anadeLinea(l);
				}
			}
		}

		return fusionada;
	}

	public Factura facturaFusionadaResumida(Cliente cliente, int numFra) {
		Factura fusionada = new Factura(numFra, cliente, 0.0F);

		for (Factura f : this.tFacturas)
			if (f.getCliente().equals(cliente))
				for (Linea lInsertar : f.gettLineas()) {
					boolean esta = false;

					for (Linea lExistente : fusionada.gettLineas())
						if (lExistente.getArticulo().equals(lInsertar.getArticulo())) {
							lExistente.setCantidad(lExistente.getCantidad() + lInsertar.getCantidad());
							esta = true;
						}
					if (!esta)
						fusionada.anadeLinea(new Linea(lInsertar.getArticulo(), lInsertar.getCantidad()));
				}
		return fusionada;
	}

	public float gastoPorCliente(Cliente cliente) {
		float gastoTotal = 0;
		for (int i = 0; i < tFacturas.length; i++) {
			if (tFacturas[i].getCliente().equals(cliente)) {
				gastoTotal = gastoTotal + tFacturas[i].getImporteTotalFra();
			}
		}
		return gastoTotal;
	}

	public Cliente clienteMayorGasto() {
		Cliente clienteMayorGasto = tClientes[0];
		for (int i = 0; i < tClientes.length; i++) {
			if (gastoPorCliente(tClientes[i]) > gastoPorCliente(clienteMayorGasto)) {
				clienteMayorGasto = tClientes[i];
			}
		}
		return clienteMayorGasto;
	}

	public Articulo[] ArticulosPorVentas() {
		Articulo articulosVentas[] = new Articulo[this.tArticulos.length];
		int nElem = 0;
		for (Articulo a : this.tArticulos) {
			int pos = nElem - 1;
			while (pos >= 0 && totalUnidadesVendidas(a) > totalUnidadesVendidas(articulosVentas[pos])) {
				articulosVentas[pos + 1] = articulosVentas[pos];
				pos--;
			}
			articulosVentas[pos + 1] = a;
			nElem++;
		}
		return articulosVentas;

	}

	public int totalUnidadesVendidas(Articulo Articulo) {
		int total = 0;
		for (Factura f : this.tFacturas) {
			for (Linea l : f.gettLineas()) {
				if (l.getArticulo().equals(Articulo)) {
					total += l.getCantidad();
				}
			}
		}
		return total;
	}

}
