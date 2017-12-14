package interfaces;

import model.ComercialSquare;
import model.Player;

public interface IVerifies {
	public boolean verifyBalancePlayer(Player p); // Verificar se saldo do jogador � suficiente
//	public boolean verifyValidPlayed(String resultado); // Verificar se jogada � v�lida
	
	
	
	public boolean verifyBalancePlayerToPay(Player p, float c); // Verifica se o jogador conseguir� comprar
	public boolean verifyItsMySquare(Player p, ComercialSquare c); // Verifica se a casa � do jogador
}
