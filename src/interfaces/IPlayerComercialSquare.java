package interfaces;

import model.ComercialSquare;

public interface IPlayerComercialSquare {
	public int getQtdComercialSquare();
	public void buyComercialSquare(ComercialSquare c);
	public void addComercialSquare(ComercialSquare c); // Adicionar Terreno / Bens as minhas cartas
}
