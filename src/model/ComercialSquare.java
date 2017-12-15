package model;

public abstract class ComercialSquare extends Square{ // Terreno comercial (Lote/Bens)
	private int id; // ID deste Comercial
	private String name; // Nome do Comercial
	private int price; // Valor do Comercial
	private Player owner; // Dono do Comercial
	private int fee; // Taxa (Calculada com base no preço do imovel ou bens)
	private boolean sold; // Vendido ou não
	
	public ComercialSquare(String name, int price, int id) {
		this.name = name;
		this.id = id; 
		this.price = price;
		this.owner = null;
		this.sold = false;
	}

	public abstract int calcFee();
	
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

	public void setFee(int fee) {
		this.fee = fee;
	}
}
