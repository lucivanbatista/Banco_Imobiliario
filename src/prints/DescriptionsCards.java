package prints;

import java.util.ArrayList;
import java.util.List;

public class DescriptionsCards {
	private static DescriptionsCards cardsUnique;
	
	private DescriptionsCards(){
		
	}
	
	public static DescriptionsCards getInstance(){
		if(cardsUnique == null){
			cardsUnique = new DescriptionsCards();
		}
		return cardsUnique;
	}
	
	public List<String> getProfitDescriptions(){
		List<String> profit = new ArrayList<>();
		profit.add(l1());
		profit.add(l2());
		profit.add(l3());
		profit.add(l4());
		profit.add(l5());
		profit.add(l6());
		profit.add(l7());
		profit.add(l8());
		profit.add(l9());
		profit.add(l10());
		profit.add(l11());
		profit.add(l12());
		profit.add(l13());
		profit.add(l14());
		profit.add(l15());
		
		return profit;
	}
	
	public List<String> getLostDescription(){
		List<String> lost = new ArrayList<>();
		lost.add(p1());
		lost.add(p2());
		lost.add(p3());
		lost.add(p4());
		lost.add(p5());
		lost.add(p6());
		lost.add(p7());
		lost.add(p8());
		lost.add(p9());
		lost.add(p10());
		lost.add(p11());
		lost.add(p12());
		lost.add(p13());
		lost.add(p14());
		lost.add(p15());
		
		return lost;
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
