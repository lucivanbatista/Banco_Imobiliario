package model;

public class Card {
	private String description;
	private int value;
	
	public Card(String descricao, int valor) {
		this.description = descricao;
		this.value = valor;
	}

	public String getDescricao() {
		return description;
	}

	public int getValor() {
		return value;
	}
}
