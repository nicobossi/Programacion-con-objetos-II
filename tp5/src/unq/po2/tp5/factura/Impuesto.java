package unq.po2.tp5.factura;

public class Impuesto extends Factura {
	
	private Double tasaFija;

	public Impuesto(Double tasaFija) {
		
		setTasa(tasaFija);
	}

	private void setTasa(Double tasaFija) {
		
		this.tasaFija = tasaFija;
		
	}

	public Double precio() {
		
		return this.tasaFija;
	}
}
