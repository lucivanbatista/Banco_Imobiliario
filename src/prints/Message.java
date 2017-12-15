package prints;

import javax.swing.JOptionPane;

import model.Card;
import model.ComercialSquare;
import model.Player;

public class Message {
	
	private static Message uniqueMessage;
	
	private Message() {
	}
	
	public static Message getInstance(){
		if(uniqueMessage == null){
			uniqueMessage = new Message();
		}
		return uniqueMessage;
	}
	
	public int desejaComprarComercialTerrain(){
		return Integer.parseInt(JOptionPane.showInputDialog("Deseja comprar o terreno? 1 (sim) ou 0 (n�o)"));
	}
	
	public int desejaComprarComercialAssets(){
		return Integer.parseInt(JOptionPane.showInputDialog("Deseja comprar esse bens? 1 (sim) ou 0 (n�o)"));
	}
	
	public void playerComprouComercial(Player p, ComercialSquare c){
		JOptionPane.showMessageDialog(null, "Player " + p.getName() + ", comprou " + c.getName());
	}
	
	public void naoFoiPossivelComprar(){
		JOptionPane.showMessageDialog(null, "N�o foi poss�vel comprar");
	}
	
	public void playerDecidiuNaoComprar(){
		JOptionPane.showMessageDialog(null, "Player decidiu n�o comprar");
	}
	
	public void suaCasa(){
		JOptionPane.showMessageDialog(null, "J� � sua casa");
	}
	
	public void playerPagouTaxa(Player p, Player owner){
		JOptionPane.showMessageDialog(null, "Player " + p.getName() + " pagou uma taxa para o Player " + owner.getName());
	}
	
	public void playerPayedPrison(){
		JOptionPane.showMessageDialog(null, "Quase, perdeu algum dinheiro, mas n�o ir� para a pris�o");
	}
	
	public void playerGoToPrison(Player p){
		JOptionPane.showMessageDialog(null, "N�o possui dinheiro, Player " + p.getName() + " vai para a Pris�o");
	}
	
	public void playerGetOutPrison(Player p){
		JOptionPane.showMessageDialog(null, p.getName() + " est� saindo da pris�o");
	}
	
	public void incomeTax(){
		JOptionPane.showMessageDialog(null, "Que azar, pague 200 para o imposto de Renda");
	}
	
	public void profitsOrDividens(){
		JOptionPane.showMessageDialog(null, "Parab�ns, voc� ganhou 200 reais!");
	}
	
	public void freeStop(){
		JOptionPane.showMessageDialog(null, "Parada para descansar um pouco...");
	}
	
	public void matchBonus(){
		JOptionPane.showMessageDialog(null, "Andar muito requer uma recompensa, ganhe 200 reais!");
	}
	
	public void showMessageProfitOrLost(Card card){
		JOptionPane.showMessageDialog(null, card.getDescricao() + "; Valor = " + card.getValor());
	}
}
