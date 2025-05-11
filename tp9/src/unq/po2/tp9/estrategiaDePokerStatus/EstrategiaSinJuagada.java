package unq.po2.tp9.estrategiaDePokerStatus;

import java.util.List;

import unq.po2.tp9.carta.ICarta;

public class EstrategiaSinJuagada extends EstrategiaDePokerStatus {

	@Override
	public Boolean hayJuego(ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
		
		return estaSiJuego(cartas(carta1, carta2, carta3 ,carta4, carta5));
	}

	private Boolean estaSiJuego(List<ICarta> cartas) {
		
		return !esPoquer(cartas) && !esTrio(cartas) && !esColor(cartas);
	}

	protected boolean esColor(List<ICarta> cartas) {
		
		return hayColor(cartas.getFirst(), cartas, 5);
	}

	protected boolean esTrio(List<ICarta> cartas) {
		
		return hayValor(cartas.getFirst(), cartas, 3);
	}

	protected boolean esPoquer(List<ICarta> cartas) {
		
		return hayValor(cartas.getFirst(), cartas, 4);
	}

	@Override
	public String verificar() {
		
		return "Nada";
	}

}
