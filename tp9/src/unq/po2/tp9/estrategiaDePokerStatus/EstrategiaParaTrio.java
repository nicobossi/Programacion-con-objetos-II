package unq.po2.tp9.estrategiaDePokerStatus;

import java.util.List;

import unq.po2.tp9.carta.ICarta;

public class EstrategiaParaTrio extends EstrategiaDePokerStatus{

	@Override
	public Boolean hayJuego(ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
		
		return hayTrio(cartas(carta1, carta2, carta3, carta4, carta5));
	}


	private Boolean hayTrio(List<ICarta> cartas) {
		
		return cartas.stream().anyMatch(carta -> hayTrioCon(carta, cartas));

	}
	
	private Boolean hayTrioCon(ICarta carta, List<ICarta> cartas) {
		
		return cantidadConMismoValor(carta, cartas) == 3;
	}


	@Override
	public String verificar() {
		
		return "Trio";
	}

}
