package unq.po2.tp9.carta;

public interface ICarta {

	public Boolean esSuperior(ICarta unaCarta);
	public Boolean esDePalo(ICarta unaCarta);
	public String getPalo();
	public Integer getValor();
}
