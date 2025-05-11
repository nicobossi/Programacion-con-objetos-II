package unq.po2.tp9.poquerStatus;


import unq.po2.tp9.carta.ICarta;
import unq.po2.tp9.estrategiaDePokerStatus.*;

public class PoquerStatus {

	
	private IEstrategiaDePoker estrategiaDePokerStatus;
	
	public PoquerStatus() {
		
		estrategiaDePokerStatus = new EstrategiaSinJuagada();
	}
	
	
	public String verificar(ICarta carta1, ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
				
		estrategiaDePokerStatus = new ProvedorDeEstrategias().estrategiaPara(this, carta1, carta2, carta3, carta4, carta5);
		return estrategiaDePokerStatus.verificar();
	}
}
