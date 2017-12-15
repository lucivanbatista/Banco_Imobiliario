package model;

import java.util.List;

import repositories.RepositoryLists;
import squaresComercial.AssetsComercialSquare;
import squaresComercial.TerrainComercialSquare;
import squaresSpecial.FreeStopSpecialSquare;
import squaresSpecial.GoPrisonSpecialSquare;
import squaresSpecial.IncomeTaxSpecialSquare;
import squaresSpecial.MatchBonusSpecialSquare;
import squaresSpecial.PrisonSpecialSquare;
import squaresSpecial.ProfitOrLostSpecialSquare;
import squaresSpecial.ProfitsOrDividensSpecialSquare;

public class Board {
	private List<Square> board;

	public Board() {
		board = RepositoryLists.getInstance().getSquares();
		createBoard();
	}

	public void createBoard(){
		board.add(new MatchBonusSpecialSquare("Incio da Partida", 0));
		board.add(new TerrainComercialSquare("Terreno em Pallet", 260 , 1));						
		board.add(new TerrainComercialSquare("Terreno em Viridian", 280, 2));
		board.add(new ProfitsOrDividensSpecialSquare("Lucro ou Prejuízo", 3));
		board.add(new TerrainComercialSquare("Terreno em Pewter", 300, 4));
		board.add(new AssetsComercialSquare("Centro Pokémon", 200, 5));
		board.add(new TerrainComercialSquare("Terreno em Cerulean", 300, 6));
		board.add(new TerrainComercialSquare("Terreno em Vermilion", 320, 7));
		board.add(new AssetsComercialSquare("PokéMart", 200, 8));
		board.add(new TerrainComercialSquare("Terreno em Lavender", 260, 9));
		board.add(new GoPrisonSpecialSquare("Va Para a Prisao", 10));							
		board.add(new TerrainComercialSquare("Terreno em Celadon", 140, 11));							
		board.add(new TerrainComercialSquare("Terreno em Fuchsia", 140, 12));						
		board.add(new ProfitsOrDividensSpecialSquare("Lucro ou Prejuízo", 13));								
		board.add(new TerrainComercialSquare("Terreno em Saffron", 160, 14));							
		board.add(new AssetsComercialSquare("Ginasio Pokemon", 150, 15));				
		board.add(new IncomeTaxSpecialSquare("Imposto De Renda", 16));						
		board.add(new TerrainComercialSquare("Terreno em Cinnabar", 100, 17));								
		board.add(new ProfitsOrDividensSpecialSquare("Lucro ou Prejuízo", 18));								
		board.add(new TerrainComercialSquare("Terreno em New Bark", 120, 19));							
		board.add(new FreeStopSpecialSquare("Parada Livre", 20));
		board.add(new TerrainComercialSquare("Terreno em Cherrygrove", 120, 21));
		board.add(new ProfitOrLostSpecialSquare("Lucros E Dividendos", 22));
		board.add(new TerrainComercialSquare("Terreno em Violet", 120, 23));
		board.add(new ProfitsOrDividensSpecialSquare("Lucro ou Prejuízo", 24));	
		board.add(new AssetsComercialSquare("Contest Pokémon", 150, 25));
		board.add(new TerrainComercialSquare("Terreno em Azalea", 180, 26));	
		board.add(new TerrainComercialSquare("Terreno em Goldenrod", 180, 27));
		board.add(new ProfitsOrDividensSpecialSquare("Lucro ou Prejuízo", 28));							
		board.add(new TerrainComercialSquare("Terreno em  Ecruteak", 200, 29));					
		board.add(new PrisonSpecialSquare("Prisao", 30));										
		board.add(new TerrainComercialSquare("Terreno em Olivine", 220, 31));	
		board.add(new TerrainComercialSquare("Terreno em Cianwood", 220, 32));					
		board.add(new AssetsComercialSquare("S. S. Anne", 200, 33));			
		board.add(new TerrainComercialSquare("Terreno em Mahogany", 240, 34));		
		board.add(new AssetsComercialSquare("Zona Safari", 200, 35));					
		board.add(new TerrainComercialSquare("Terreno na Zona Safari", 60, 36));		
		board.add(new TerrainComercialSquare("Terreno em Blackthorn", 60, 37));					
		board.add(new ProfitsOrDividensSpecialSquare("Lucro ou Prejuízo", 38));									
		board.add(new TerrainComercialSquare("Terreno na Fronteira", 100, 39));
	}

}
