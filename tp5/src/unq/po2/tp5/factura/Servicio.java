package unq.po2.tp5.factura;

public class Servicio extends Factura {

	private Integer cantidadDeUnidades;
	private Double costoPorUnidad;

	public Servicio(Double costoPorUnidad, Integer cantidadDeUnidades) {
		
		setCostoPorUnidad(costoPorUnidad);
		setCantidadDeUnidades(cantidadDeUnidades);
	}

	public Double precio() {
		return getCostoPorUnidad() * getCantidadDeUnidades();
	}

	private Integer getCantidadDeUnidades() {
		
		return this.cantidadDeUnidades;
	}

	private Double getCostoPorUnidad() {
		
		return this.costoPorUnidad;
	}
	
	private void setCantidadDeUnidades(Integer cantidadDeUnidades) {
		
		this.cantidadDeUnidades = cantidadDeUnidades;
	}

	private void setCostoPorUnidad(Double costoPorUnidad) {
		
		this.costoPorUnidad = costoPorUnidad;
	}

}
