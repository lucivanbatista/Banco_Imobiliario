package squares;

import java.awt.Point;

import logic.Vertifies;
import model.ComercialSquare;
import model.Player;
import prints.Message;

public class AssetsComercialSquare extends ComercialSquare{	
	private Message message;
	private Vertifies verify;

	public AssetsComercialSquare(String name, int price, int fee, Point position, int id) {
		super(name, price, fee, position, id);
		this.message = new Message();
		this.verify = new Vertifies();
	}

	@Override
	public void activateEffect(Player p) {
		if(!this.isSold()){ // Caso n�o esteja vendido, poder� comprar
			int answerPlayer = message.desejaComprarComercialAssets();
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
				int fee = p.payFee(this.getFee());
				this.getOwner().receiveFee(fee);
				message.playerPagouTaxa(p, getOwner());
			}else{
				message.suaCasa();
			}
		}
	}

}