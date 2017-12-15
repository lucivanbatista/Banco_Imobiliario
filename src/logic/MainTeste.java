package logic;

import model.Account;
import model.Player;
import squaresSpecial.ProfitOrLostSpecialSquare;

public class MainTeste {

	public static void main(String[] args) {
		ProfitOrLostSpecialSquare p = new ProfitOrLostSpecialSquare("", 1);
		p.activateEffect(new Player("Lucivan", new Account(1000),null));
	}

}
