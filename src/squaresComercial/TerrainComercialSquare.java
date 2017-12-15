package squaresComercial;

import logic.Vertifies;
import model.ComercialSquare;
import model.Player;
import prints.Message;

public class TerrainComercialSquare extends ComercialSquare {
	private Message message;
	private Vertifies verify;
	
	public TerrainComercialSquare(String name, int price, int id) {
		super(name, price, id);
		this.message = Message.getInstance();
		this.verify = new Vertifies();
		this.setFee(calcFee());
	}
	
	@Override
	public void activateEffect(Player p) {
		if(!this.isSold()){ // Caso n�o esteja vendido, poder� comprar
			int answerPlayer = message.desejaComprarComercialTerrain();
			if(answerPlayer == 1){
				if(verify.verifyBalancePlayerToPay(p, this.getPrice())){ // Caso tenha saldo suficiente
					p.buyTerrain(this);
					message.playerComprouComercial(p, this);
				}else{ // Caso n�o tenha saldo suficiente
					message.naoFoiPossivelComprar();
				}
			}else{
				message.playerDecidiuNaoComprar();
			}
		}else{ // Caso esteja vendido, vem multa (taxa)
			if(!verify.verifyItsMySquare(p, this)){ // Se n�o for minha casa...
				p.payFee(this.getFee());
				this.getOwner().receiveFee(this.getFee());
				message.playerPagouTaxa(p, getOwner());
			}else{
				message.suaCasa();
			}
		}
	}

	@Override
	public int calcFee() {
		return this.getPrice() / 5; // Ou seja 20% do valor original
	}
}
