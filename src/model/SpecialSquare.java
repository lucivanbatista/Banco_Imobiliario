package model;

import java.awt.Point;

public class SpecialSquare extends Square{ // Sorte/Prisão/Lucro, essas coisas
	private int id; // ID deste especial
	private String name; // Nome do especial
	private Point position; // Posição do especial
	//---
	
	public SpecialSquare(String name, Point position, int id) {
		this.name = name;
		this.position = position;
		this.id = id;
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
}
