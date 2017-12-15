package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.IEffectSquare;
import interfaces.ISquare;

public abstract class Square implements ISquare, IEffectSquare {
	private int id; // Id da Casa
	private String name; // Nome da Casa
	private List<Player> playersInSquare; // Jogadores nesta casa	
	
	public Square() {
		this.playersInSquare = new ArrayList<>();
	}
	
	@Override
	public void addPlayerInSquare(Player player) {
		this.playersInSquare.add(player);
	}

	@Override
	public void removePlayerFromSquare(Player player) {
		this.playersInSquare.remove(player);
	}

	@Override
	public void move(Player player, Square destination) {
		Square source = player.getPositionPlayer();
		player.setPositionPlayer(destination);
		destination.addPlayerInSquare(player);
		source.removePlayerFromSquare(player);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public List<Player> getPlayersInSquare() {
		return playersInSquare;
	}
}
