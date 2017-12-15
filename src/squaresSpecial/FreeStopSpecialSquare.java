package squaresSpecial;

import model.Player;
import model.SpecialSquare;
import prints.Message;

public class FreeStopSpecialSquare extends SpecialSquare{
	private Message message;
	
	public FreeStopSpecialSquare(String name, int id) {
		super(name, id);
		this.message = Message.getInstance();
	}

	@Override
	public void activateEffect(Player p) {
		message.freeStop();
	}

}
