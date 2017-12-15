package model;

import repositories.RepositoryLists;

public abstract class SpecialSquare extends Square{ // Sorte/Prisão/Lucro, essas coisas
	private int id; // ID deste especial
	private String name; // Nome do especial
	private RepositoryLists lists;
	
	public SpecialSquare(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public SpecialSquare(String name, int id, RepositoryLists lists) {
		this.name = name;
		this.id = id;
		this.lists = lists;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public RepositoryLists getLists() {
		return lists;
	}	
}
