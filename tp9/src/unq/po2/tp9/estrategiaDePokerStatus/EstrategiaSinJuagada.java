package unq.po2.tp9.estrategiaDePokerStatus;

import java.util.List;

import unq.po2.tp9.carta.ICarta;

public class EstrategiaSinJuagada extends EstrategiaDePokerStatus {

	@Override
	public Boolean hayJuego(ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
		
		return estaSiJuego(cartas(carta1, carta2, carta3 ,carta4, carta5));
	}

	private Boolean estaSiJuego(List<ICarta> cartas) {
		
		return cantidadConMismoValor(cartas.getFirst(), cartas) != 4 && 
			cantidadConMismoValor(cartas.getFirst(), cartas) != 3 && 
			   cantidadConMismoColor(cartas.getFirst(), cartas) != 5 ;
	}

	@Override
	public String verificar() {
		
		return "Nada";
	}

}
