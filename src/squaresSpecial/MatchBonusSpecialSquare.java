package squaresSpecial;

import model.Player;
import model.SpecialSquare;
import prints.Message;
import utils.Constants;

public class MatchBonusSpecialSquare extends SpecialSquare{
	private Message message;
	private int fee;
	
	public MatchBonusSpecialSquare(String name, int id) {
		super(name, id);
		this.message = Message.getInstance();
		this.fee = Constants.getInstancia().MATCH_BONUS;
	}

	@Override
	public void activateEffect(Player p) {
		message.matchBonus();
		p.receiveFee(this.fee);
	}

}
