package squares;

import java.awt.Point;

import logic.Vertifies;
import model.ComercialSquare;
import model.Player;
import prints.Message;

public class TerrainComercialSquare extends ComercialSquare {
	private Message message;
	private Vertifies verify;
	
	public TerrainComercialSquare(String name, int price, int fee, Point position, int id) {
		super(name, price, fee, position, id);
		this.message = new Message();
		this.verify = new Vertifies();
	}
	
	@Override
	public void activateEffect(Player p) {
		if(!this.isSold()){ // Caso não esteja vendido, poderá comprar
			int answerPlayer = message.desejaComprarComercialTerrain();
			if(answerPlayer == 1){
				if(verify.verifyBalancePlayerToPay(p, this.getPrice())){ // Caso tenha saldo suficiente
					p.buyTerrain(this);
					message.playerComprouComercial(p, this);
				}else{ // Caso não tenha saldo suficiente
					message.naoFoiPossivelComprar();
				}
			}else{
				message.playerDecidiuNaoComprar();
			}
		}else{ // Caso esteja vendido, vem multa (taxa)
			if(!verify.verifyItsMySquare(p, this)){ // Se não for minha casa...
				int fee = p.payFee(this.getFee());
				this.getOwner().receiveFee(fee);
				message.playerPagouTaxa(p, getOwner());
			}else{
				message.suaCasa();
			}
		}
	}
}
