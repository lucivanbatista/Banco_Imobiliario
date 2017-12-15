package squaresSpecial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Card;
import model.Player;
import model.SpecialSquare;
import prints.DescriptionsCards;
import prints.Message;
import utils.Constants;

public class ProfitOrLostSpecialSquare extends SpecialSquare{
	private Message m;
	private Map<Integer, Card> mapCards;
	private int idCard;
	
	public ProfitOrLostSpecialSquare(String name, int id) {
		super(name, id);
		this.m = Message.getInstance();
		mapCards = new HashMap<>();
		createCards();
	}

	@Override
	public void activateEffect(Player p) {
		this.idCard = randomWithRange(0, Constants.getInstance().QTD_CARDS);
		Card card = this.mapCards.get(this.idCard);
		
		if(card.getValor() > 0){ // Lucro
			p.receiveFee(card.getValor());
		}else{ // Prejuízo
			p.payFee(card.getValor());
		}
		m.showMessageProfitOrLost(card);
		
	}
	
	public void createCards(){
		List<String> lucros = DescriptionsCards.getInstance().getProfitDescriptions();
		List<String> prejuizos =  DescriptionsCards.getInstance().getLostDescription();
		int i = 0;
		for(String s : lucros){
			this.mapCards.put(i, new Card(s, randomWithRange(10, 150)));
			i++;
		}
		
		for(String s : prejuizos){
			this.mapCards.put(i, new Card(s, randomWithRange(10, 150)));
			i++;
		}
		
		for(Card c : this.mapCards.values()){
			System.out.println(c.getDescricao() + "; " + c.getValor());
		}
		
		Constants.getInstance().sizeQtd_Card(this.mapCards.size());
	}
	
	public int randomWithRange(int min, int max){
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}

}
