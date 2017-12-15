package interfaces;

import model.ComercialSquare;

public interface IPlayerTerrain {
	public int getQtdTerrain();
	public void buyTerrain(ComercialSquare c);
	public void addTerrain(ComercialSquare c); // Adicionar Terreno as minhas cartas
}
