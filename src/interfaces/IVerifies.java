package interfaces;

import model.ComercialSquare;
import model.Player;

public interface IVerifies {
	public boolean verifyBalancePlayer(Player p); // Verificar se saldo do jogador é suficiente
//	public boolean verifyValidPlayed(String resultado); // Verificar se jogada é válida
	
	
	
	public boolean verifyBalancePlayerToPay(Player p, float c); // Verifica se o jogador conseguirá comprar
	public boolean verifyItsMySquare(Player p, ComercialSquare c); // Verifica se a casa é do jogador
}
