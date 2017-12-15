package squaresSpecial;

import logic.Vertifies;
import model.Player;
import model.SpecialSquare;
import prints.Message;
import repositories.RepositoryLists;
import utils.Constants;

public class PrisonSpecialSquare extends SpecialSquare{
	private RepositoryLists lists;
	private Message message;
	private Vertifies verify;
	private int fee;
	
	public PrisonSpecialSquare(String name, int id) {
		super(name, id);
		this.message = Message.getInstance();
		this.lists = RepositoryLists.getInstance();
		this.verify = Vertifies.getInstance();
		this.fee = Constants.getInstance().PRISON;
	}
	
	@Override
	public void activateEffect(Player p) {		
		if(verify.verifyBalancePlayerToPay(p, fee)){
			p.payFee(fee);
			message.playerGetOutPrison(p);
			lists.removeArrestedPlayer(p);
		}else{ // Se não, vai tentar a sorte nos dados ou esperar 2 rodadas (INCOMPLETO)
			
		}
		
	}

}
