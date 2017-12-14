package model;

import java.awt.Point;

public class ComercialSquare extends Square{ // Terreno comercial (Lote/Bens)
	private int id; // ID deste Comercial
	private String name; // Nome do Comercial
	private int price; // Valor do Comercial
	private Player owner; // Dono do Comercial
	private int fee; // Taxa
	private boolean sold; // Vendido ou não
	private Point position; // Posição do Comercial
	
	public ComercialSquare(String name, int price, int fee, Point position, int id) {
		this.name = name;
		this.id = id; 
		this.price = price;
		this.owner = null;
		this.fee = fee;
		this.sold = false;
		this.position = position;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
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

	public int getPrice() {
		return price;
	}

	public int getFee() {
		return fee;
	}	
}
