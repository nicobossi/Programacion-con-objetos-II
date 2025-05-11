package unq.po2.tp9.carta;

public class Carta implements ICarta {

	private Integer valor;
	private String palo;
	
	public Carta(int valor, String palo) {
		
		setValor(valor);
		setPalo(palo);
	}

	@Override
	public Boolean esSuperior(Carta unaCarta) {
		
		return getValor() > unaCarta.getValor();
	}

	@Override
	public Boolean esDePalo(Carta unaCarta) {
		
		return getPalo() == unaCarta.getPalo();
	}
	
	@Override
	public String getPalo() {
		
		return this.palo;
	}

	@Override
	public Integer getValor() {
		
		return this.valor;
	}
	
	
	private void setValor(int valor) {
		
		this.valor = valor;
	}
	
	private void setPalo(String palo) {
		
		this.palo = palo;
	}
	
}
