package squaresSpecial;

import model.Player;
import model.SpecialSquare;
import prints.Message;
import utils.Constants;

public class IncomeTaxSpecialSquare extends SpecialSquare {
	private Message message;
	private int fee;
	
	public IncomeTaxSpecialSquare(String name, int id) {
		super(name, id);
		this.message = Message.getInstance();
		this.fee = Constants.getInstancia().INCOME_TAX;
	}

	@Override
	public void activateEffect(Player p) {
		message.incomeTax();
		p.payFee(this.fee);
	}

}
