package model;

import java.awt.Point;

import repositories.RepositoryLists;

public class SpecialSquare extends Square{ // Sorte/Prisão/Lucro, essas coisas
	private int id; // ID deste especial
	private String name; // Nome do especial
	private Point position; // Posição do especial
	private RepositoryLists lists;
	
	public SpecialSquare(String name, Point position, int id) {
		this.name = name;
		this.position = position;
		this.id = id;
	}
	
	public SpecialSquare(String name, Point position, int id, RepositoryLists lists) {
		this.name = name;
		this.position = position;
		this.id = id;
		this.lists = lists;
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
