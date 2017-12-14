package squares;

import java.awt.Point;

import logic.Vertifies;
import model.Player;
import model.SpecialSquare;
import model.Square;
import prints.Message;
import repositories.RepositoryLists;

public class PrisonSpecialSquare extends SpecialSquare{
	private RepositoryLists lists;
	private Message message;
	private Vertifies verify;
	private int fee;
	
	public PrisonSpecialSquare(String name, Point position, int id, RepositoryLists lists) {
		super(name, position, id, lists);
		this.message = new Message();
		this.lists = lists;
		this.verify = new Vertifies();
		this.fee = 100;
	}
	
	@Override
	public void activateEffect(Player p) { // Caso ele caia na casa da prisão, ele vai para a prisão
		Square prison = this.lists.getSquares().get(30);
		
		if(verify.verifyBalancePlayerToPay(p, fee)){ // Se o cara tiver dinheiro na hora, então precisa ir para a prisão, se não tiver, ele vai para a prisao
			p.payFee(fee);
			message.playerPayedPrison();
		}else{
			message.playerGoToPrison(p);
			// COLOCAR O NUMERO DA PRISAO... E COLOCAR O PLAYER LÁ COM O MOVE
			lists.addArrestedPlayer(p);
		}
		
	}

}
