package interfaces;

import model.Player;
import model.Square;

public interface ISquare {
	public void addPlayerInSquare(Player player); // Adicionar Jogador nesta casa
	public void removePlayerFromSquare(Player player); // Remover Jogador desta casa
	public void move(Player player, Square destination); // Mover Jogador para outra casa
}
