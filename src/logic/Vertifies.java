package logic;

import interfaces.IVerifies;
import model.ComercialSquare;
import model.Player;

public class Vertifies implements IVerifies {

	

	@Override
	public boolean verifyBalancePlayerToPay(Player p, float price) {
		if(p.getBalance() >= price){
			return true;
		}
		return false;
	}

	@Override
	public boolean verifyItsMySquare(Player p, ComercialSquare c) {
		if(c.getOwner().equals(p)){
			return true;
		}
		return false;
	}

}
