package unq.po2.tp9.carta;

public interface ICarta {

	public Boolean esSuperior(Carta unaCarta);
	public Boolean esDePalo(Carta unaCarta);
	public String getPalo();
	public Integer getValor();
}
