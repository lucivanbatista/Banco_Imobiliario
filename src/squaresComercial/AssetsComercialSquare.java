package squaresComercial;

import logic.Vertifies;
import model.ComercialSquare;
import model.Player;
import prints.Message;

public class AssetsComercialSquare extends ComercialSquare{	
	private Message message;
	private Vertifies verify;

	public AssetsComercialSquare(String name, int price, int id) {
		super(name, price, id);
		this.message = Message.getInstance();
		this.verify = Vertifies.getInstance();
		this.setFee(calcFee());
	}

	@Override
	public void activateEffect(Player p) {
		if(!this.isSold()){ // Caso não esteja vendido, poderá comprar
			int answerPlayer = message.desejaComprarComercialAssets();
			if(answerPlayer == 1){
				if(verify.verifyBalancePlayerToPay(p, this.getPrice())){ // Caso tenha saldo suficiente
					p.buyComercialSquare(this);
					message.playerComprouComercial(p, this);
				}else{ // Caso não tenha saldo suficiente
					message.naoFoiPossivelComprar();
				}
			}else{
				message.playerDecidiuNaoComprar();
			}
		}else{ // Caso esteja vendido, vem multa (taxa)
			if(!verify.verifyItsMySquare(p, this)){ // Se não for minha casa...
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
		return this.getPrice() / 4; // Ou seja 25% do valor original
	}

}
