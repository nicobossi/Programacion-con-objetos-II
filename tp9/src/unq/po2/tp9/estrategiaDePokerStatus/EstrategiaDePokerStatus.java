package unq.po2.tp9.estrategiaDePokerStatus;

import java.util.ArrayList;
import java.util.List;
import unq.po2.tp9.carta.ICarta;

public abstract class EstrategiaDePokerStatus implements IEstrategiaDePoker {
	
	@Override
	public abstract Boolean hayJuego(ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5);
	
	@Override
	public abstract String verificar();
	
	protected long cantidadConMismoValor(ICarta carta, List<ICarta> cartas) {
		
		return cartas.stream().filter(cartaActual -> cartaActual.getValor() == carta.getValor()).count();
	}
	
	protected long cantidadConMismoColor(ICarta carta, List<ICarta> cartas) {
		
		return cartas.stream().filter(cartaActual -> cartaActual.getPalo() == carta.getPalo()).count();
	}
	
	protected Boolean hayValor(ICarta carta, List<ICarta> cartas, int cantidad) {
		
		return cantidadConMismoValor(carta, cartas) == cantidad;
	}
	
	protected Boolean hayColor(ICarta carta, List<ICarta> cartas, int cantidad) {

		return cantidadConMismoColor(carta, cartas) == cantidad;
	}

	
	protected List<ICarta> cartas(ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
		
		List<ICarta> cartas = new ArrayList<ICarta>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		return cartas;
		
	}

}
