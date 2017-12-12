package model;

import java.awt.Point;

public class Comercial extends Square{ // Terreno comercial (Lote/Bens)
	private int id; // ID deste Comercial
	private String name; // Nome do Comercial
	private float price; // Valor do Comercial
	private Player owner; // Dono do Comercial
	private float fee; // Taxa
	private boolean statusSold; // Vendido ou não
	private Point position; // Posição do Comercial
	
	public Comercial(String name, float price, float fee, Point position, int id) {
		this.name = name;
		this.id = id; 
		this.price = price;
		this.owner = null;
		this.fee = fee;
		this.statusSold = false;
		this.position = position;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean isStatusSold() {
		return statusSold;
	}

	public void setStatusSold(boolean statusSold) {
		this.statusSold = statusSold;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public float getFee() {
		return fee;
	}	
}
