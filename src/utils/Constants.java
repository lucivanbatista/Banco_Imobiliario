package utils;


public class Constants {
	private static Constants uniqueC;
	
	private Constants() {
		
	}
	
	public static Constants getInstancia(){
		if(uniqueC == null){
			uniqueC = new Constants();
		}
		return uniqueC;
	}
	
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