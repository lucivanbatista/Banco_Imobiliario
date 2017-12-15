package prints;

import java.util.ArrayList;
import java.util.List;

public class DescriptionsCards {
	private static DescriptionsCards cardsUnique;
	
	private DescriptionsCards(){
		
	}
	
	public static DescriptionsCards getInstancia(){
		if(cardsUnique == null){
			cardsUnique = new DescriptionsCards();
		}
		return cardsUnique;
	}
	
	public List<String> getLucroDescriptions(){
		List<String> lucros = new ArrayList<>();
		lucros.add(l1());
		lucros.add(l2());
		lucros.add(l3());
		lucros.add(l4());
		lucros.add(l5());
		lucros.add(l6());
		lucros.add(l7());
		lucros.add(l8());
		lucros.add(l9());
		lucros.add(l10());
		lucros.add(l11());
		lucros.add(l12());
		lucros.add(l13());
		lucros.add(l14());
		lucros.add(l15());
		
		return lucros;
	}
	
	public List<String> getPrejuizoDescription(){
		List<String> prejuizos = new ArrayList<>();
		prejuizos.add(p1());
		prejuizos.add(p2());
		prejuizos.add(p3());
		prejuizos.add(p4());
		prejuizos.add(p5());
		prejuizos.add(p6());
		prejuizos.add(p7());
		prejuizos.add(p8());
		prejuizos.add(p9());
		prejuizos.add(p10());
		prejuizos.add(p11());
		prejuizos.add(p12());
		prejuizos.add(p13());
		prejuizos.add(p14());
		prejuizos.add(p15());
		
		return prejuizos;
	}
	
	public String l1(){
		return "Que sorte! Seu Pok�mon encontrou dinheiro na rua";
	}
	
	public String l2(){
		return "Seu pai ganhou na loteria do Pok�Mart e resolveu lhe dar um presente";
	}
	
	public String l3(){
		return "Voc� foi eleito o melhor treinador Pok�mon da sua cidade";
	}
	
	public String l4(){
		return "Seu irm�o mais novo � campe�o do torneio de Pok�mon Kids. Receba o pr�mio pelo garoto ;)";
	}
	
	public String l5(){
		return "Um Pikachu enfurecido destruiu sua bicileta, mas ainda bem que o seguro cobre o preju�zo";
	}
	
	public String l6(){
		return "Parece que ser treinador tem suas vantagens, o l�der de gin�sio da cidade lhe deu uma ajudinha com os gastos";
	}
	
	public String l7(){
		return "Voc� ganhou um pr�mio";
	}
	
	public String l8(){
		return "Parece que participar de Contests pok�mons d� mais dinheiro que gin�sios, receba pela sua �ltima vit�ria";
	}

	public String l9(){
		return "Seus pok�mons atuaram bem na �ltima pe�a de teatro, recebe um patroc�nio";
	}
	
	public String l10(){
		return "Seu ovo pok�mon chocou e voc� recebeu uma Bolsa Pok�mon";
	}
	
	public String l11(){
		return "Parece que ser um campe�o � para poucos, uma f� lhe deu uma ajudinha";
	}
	
	public String l12(){
		return "Se lembra daquele cara que voc� ajudou a treinar o chamander? Ele evoluiu para Charizard e est� lhe dando um 'agradecimento'";
	}
	
	public String l13(){
		return "Sua competi��o de ca�a aos pok�mons insetos foi um sucesso";
	}
	
	public String l14(){
		return "Voc� completou a pok�dex";
	}
	
	public String l15(){
		return "Voc� se tornou campe�o da Elite dos 4, receba uma pr�mio do campe�o antigo";
	}
	
	public String p1(){
		return "Parece que sua pok�dex quebrou, algu�m ter� que pagar";
	}
	
	public String p2(){
		return "Parab�ns � seu anivers�rio! Algu�m vai fazer uma festa e gastar� dinheiro";
	}
	
	public String p3(){
		return "Sua Tv queimou";
	}
	
	public String p4(){
		return "Sua conta banc�ria est� no vermelho, precisa depositar dinheiro";
	}
	
	public String p5(){
		return "N�o pode estacionar seu pok�mon voador na vaga de deficiente, levou multa";
	}
	
	public String p6(){
		return "Parece que seu pok�mon se machucou, gastar� dinheiro com medicamentos";
	}
	
	public String p7(){
		return "Suas pok�bolas est�o chegando ao fim, precisar� gastar comprando novas";
	}
	
	public String p8(){
		return "Come�ou uma nova jornada, precisa de mantimentos";
	}
	
	public String p9(){
		return "Suas berries est�o quase no fim, precisa comprar mais";
	}
	
	public String p10(){
		return "Parece que o Professor Oak est� combrando por manter seus pok�mons no laborat�rio";
	}
	
	public String p11(){
		return "Reuni�o com os amigos, o preju�zo � seu";
	}
	
	public String p12(){
		return "Voc� teve que emprestar dinheiro � um amigo seu";
	}
	
	public String p13(){
		return "Sua vara de pesca est� velha, precisa de uma nova";
	}
	
	public String p14(){
		return "Enfermeira Joy est� cobrando por tratamento";
	}
	
	public String p15(){
		return "Seu pok�mon precisa aprender um golpe novo, esse TM custar� caro";
	}
}
