package utils;

public class Constants {
	private static Constants uniqueC;
	
	private Constants() {
		
	}
	
	public static Constants getInstance(){
		if(uniqueC == null){
			uniqueC = new Constants();
		}
		return uniqueC;
	}
	
	// Relacionados aos Squares
	public final int ID_INICIAL_SQUARE = 0;
	
	// Valores das Constantes das Special Square
	public final int INCOME_TAX = 200;
	public final int MATCH_BONUS = 200;
	public final int PRISON = 100;
	public final int PROFITS_OR_DIVIDENS = 200;
	
	// Outros
	public int QTD_CARDS;
	
	public void sizeQtd_Card(Integer qtd){
		QTD_CARDS = qtd;
	}
}
