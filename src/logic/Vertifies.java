package logic;

import interfaces.IVerifies;
import model.ComercialSquare;
import model.Player;

public class Vertifies implements IVerifies {

	private static Vertifies verifyUnique;
	
	private Vertifies() {
		
	}
	
	public static Vertifies getInstance(){
		if(verifyUnique == null){
			verifyUnique = new Vertifies();
		}
		return verifyUnique;
	}

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
