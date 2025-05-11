package unq.po2.tp9.estrategiaDePokerStatus;

import unq.po2.tp9.carta.ICarta;

public class EstrategiaSinJuagada extends EstrategiaDePokerStatus {

	@Override
	public Boolean hayJuego(ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
		
		return false;
	}

	@Override
	public String verificar() {
		
		return "Nada";
	}

}
