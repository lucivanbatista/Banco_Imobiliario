package squaresSpecial;

import model.Player;
import model.SpecialSquare;
import prints.Message;
import utils.Constants;

public class ProfitsOrDividensSpecialSquare extends SpecialSquare{
	private Message message;
	private int fee;
	
	public ProfitsOrDividensSpecialSquare(String name, int id) {
		super(name, id);
		this.message = Message.getInstance();
		this.fee = Constants.getInstancia().PROFITS_OR_DIVIDENS;
	}

	@Override
	public void activateEffect(Player p) {
		message.profitsOrDividens();
		p.receiveFee(this.fee);
	}

}
