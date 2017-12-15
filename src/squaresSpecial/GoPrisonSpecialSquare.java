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
	
	public GoPrisonSpecialSquare(String name, int id, RepositoryLists lists) {
		super(name, id, lists);
		this.message = Message.getInstance();
		this.lists = lists;
		this.verify = new Vertifies();
		this.fee = Constants.getInstancia().PRISON;
	}
	
	@Override
	public void activateEffect(Player p) { // Caso ele caia na casa da prisão, ele vai para a prisão
		Square prison = this.lists.getSquares().get(30);
		
		if(verify.verifyBalancePlayerToPay(p, fee)){// Se ele tiver dinheiro, ele sai da prisao
			p.payFee(fee);
			message.playerPayedPrison();
			lists.removeArrestedPlayer(p);
		}else{ // vai para a prisão 
			message.playerGoToPrison(p);
			// COLOCAR O NUMERO DA PRISAO... E COLOCAR O PLAYER LÁ COM O MOVE
			lists.addArrestedPlayer(p);
		}
		
	}

}
