package model;

public class Card {
	private String descricao;
	private int valor;
	
	public Card(String descricao, int valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getValor() {
		return valor;
	}
}
