package unq.po2.tp9.estrategiaDePokerStatus;

import java.util.List;

import unq.po2.tp9.carta.ICarta;

public class EstrategiaParaColor extends EstrategiaDePokerStatus {

	@Override
	public Boolean hayJuego(ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
		
		return hayColor(cartas(carta1, carta2, carta3, carta4, carta5));
	}

	@Override
	public String verificar() {
		
		return "Color";
	}
	
	private Boolean hayColor(List<ICarta> cartas) {
		
		return cartas.stream().anyMatch(carta -> hayColor(carta, cartas, 5));

	}
}
