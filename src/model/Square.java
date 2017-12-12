package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import interfaces.IEffectSquare;
import interfaces.ISquare;

public class Square implements ISquare, IEffectSquare {
	private int id; // Id da Casa
	private String name; // Nome da Casa
	private List<Player> playersInSquare; // Jogadores nesta casa	
	private Point position; // X e Y
	
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
	public void move(Player player, Square destination) { // OBSERVAÇÃO ISTO TEM QUE SER AJEITADO QUANDO COLOCAR A POSICAO (ATRIBUTO)
		removePlayerFromSquare(player);
		destination.addPlayerInSquare(player);
	}

	@Override
	public void activateEffect(Player p) { // NÃO IMPLEMENTADO
		// TODO Auto-generated method stub
		
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

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public List<Player> getPlayersInSquare() {
		return playersInSquare;
	}
}
