package repositories;

import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Square;

public class RepositoryLists {
	private List<Player> players;
	private List<Player> playersAlive;
	private List<Player> arrestedPlayers;
	private List<Square> squares; // Todas as peças = tabuleiro
	private static RepositoryLists listsUnique;
	
	private RepositoryLists() {
		this.players = new ArrayList<>();
		this.playersAlive = new ArrayList<>();
		this.arrestedPlayers = new ArrayList<>();
		this.squares = new ArrayList<>();
	}
	
	public static RepositoryLists getInstance(){
		if(listsUnique == null){
			listsUnique = new RepositoryLists();
		}
		return listsUnique;
	}
	
	public void addPlayer(Player p){
		this.players.add(p);
	}
	
	public void addPlayerAlive(Player p){
		this.playersAlive.add(p);
	}
	
	public void addArrestedPlayer(Player p){
		this.arrestedPlayers.add(p);
	}
	
	//...
	
	public void removePlayerAlive(Player p){
		this.playersAlive.remove(p);
	}
	
	public void removeArrestedPlayer(Player p){
		this.arrestedPlayers.remove(p);
	}
	
	//...

	public List<Square> getSquares() {
		return squares;
	}

	public void setSquares(List<Square> squares) {
		this.squares = squares;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public List<Player> getPlayersAlive() {
		return playersAlive;
	}

	public List<Player> getArrestedPlayers() {
		return arrestedPlayers;
	}
	
}
