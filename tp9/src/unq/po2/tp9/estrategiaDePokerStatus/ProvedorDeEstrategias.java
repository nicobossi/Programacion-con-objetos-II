package unq.po2.tp9.estrategiaDePokerStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import unq.po2.tp9.carta.ICarta;
import unq.po2.tp9.poquerStatus.PoquerStatus;

public class ProvedorDeEstrategias {
	
	private List<IEstrategiaDePoker> estrategias;
	
	public ProvedorDeEstrategias() {
		
		setEstrategias();
	}
	
	public IEstrategiaDePoker estrategiaPara(PoquerStatus poquerStatus, ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4,
			ICarta carta5) {
		
		return findEstrategia(carta1, carta2, carta3, carta4, carta5).toList().getFirst();

	}

	private Stream<IEstrategiaDePoker> findEstrategia(ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
		
		return getEstrategias().stream().filter(unaEstrategia -> unaEstrategia.hayJuego(carta1, carta2, carta3, carta4, carta5));
	}

	private List<IEstrategiaDePoker> getEstrategias() {
		
		return this.estrategias;
	}
	
	private void setEstrategias() {
		
		estrategias = new ArrayList<IEstrategiaDePoker>();
		estrategias.add(new EstrategiaSinJuagada());
		estrategias.add(new EstrategiaParaPoquer());
		estrategias.add(new EstrategiaParaTrio());
		estrategias.add(new EstrategiaParaColor());
		
	}

}
