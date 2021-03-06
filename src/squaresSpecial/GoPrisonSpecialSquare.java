package squaresSpecial;

import logic.Vertifies;
import model.Player;
import model.SpecialSquare;
import model.Square;
import prints.Message;
import repositories.RepositoryLists;
import utils.Constants;

public class GoPrisonSpecialSquare extends SpecialSquare{
	private RepositoryLists lists;
	private Message message;
	private Vertifies verify;
	private int fee;
	
	public GoPrisonSpecialSquare(String name, int id) {
		super(name, id);
		this.message = Message.getInstance();
		this.lists = RepositoryLists.getInstance();
		this.verify = Vertifies.getInstance();
		this.fee = Constants.getInstance().PRISON;
	}
	
	@Override
	public void activateEffect(Player p) { // Caso ele caia na casa da pris�o, ele vai para a pris�o
		Square prison = this.lists.getSquares().get(30);
		
		if(verify.verifyBalancePlayerToPay(p, fee)){// Se ele tiver dinheiro, ele sai da prisao
			p.payFee(fee);
			message.playerPayedPrison();
			lists.removeArrestedPlayer(p);
		}else{ // vai para a pris�o 
			message.playerGoToPrison(p);
			// COLOCAR O NUMERO DA PRISAO... E COLOCAR O PLAYER L� COM O MOVE
			lists.addArrestedPlayer(p);
		}
		
	}

}
