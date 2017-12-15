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
		return "Que sorte! Seu Pokémon encontrou dinheiro na rua";
	}
	
	public String l2(){
		return "Seu pai ganhou na loteria do PokéMart e resolveu lhe dar um presente";
	}
	
	public String l3(){
		return "Você foi eleito o melhor treinador Pokémon da sua cidade";
	}
	
	public String l4(){
		return "Seu irmão mais novo é campeão do torneio de Pokémon Kids. Receba o prêmio pelo garoto ;)";
	}
	
	public String l5(){
		return "Um Pikachu enfurecido destruiu sua bicileta, mas ainda bem que o seguro cobre o prejuízo";
	}
	
	public String l6(){
		return "Parece que ser treinador tem suas vantagens, o líder de ginásio da cidade lhe deu uma ajudinha com os gastos";
	}
	
	public String l7(){
		return "Você ganhou um prêmio";
	}
	
	public String l8(){
		return "Parece que participar de Contests pokémons dá mais dinheiro que ginásios, receba pela sua última vitória";
	}

	public String l9(){
		return "Seus pokémons atuaram bem na última peça de teatro, recebe um patrocínio";
	}
	
	public String l10(){
		return "Seu ovo pokémon chocou e você recebeu uma Bolsa Pokémon";
	}
	
	public String l11(){
		return "Parece que ser um campeão é para poucos, uma fã lhe deu uma ajudinha";
	}
	
	public String l12(){
		return "Se lembra daquele cara que você ajudou a treinar o chamander? Ele evoluiu para Charizard e está lhe dando um 'agradecimento'";
	}
	
	public String l13(){
		return "Sua competição de caça aos pokémons insetos foi um sucesso";
	}
	
	public String l14(){
		return "Você completou a pokédex";
	}
	
	public String l15(){
		return "Você se tornou campeão da Elite dos 4, receba uma prêmio do campeão antigo";
	}
	
	public String p1(){
		return "Parece que sua pokédex quebrou, alguém terá que pagar";
	}
	
	public String p2(){
		return "Parabéns é seu aniversário! Alguém vai fazer uma festa e gastará dinheiro";
	}
	
	public String p3(){
		return "Sua Tv queimou";
	}
	
	public String p4(){
		return "Sua conta bancária está no vermelho, precisa depositar dinheiro";
	}
	
	public String p5(){
		return "Não pode estacionar seu pokémon voador na vaga de deficiente, levou multa";
	}
	
	public String p6(){
		return "Parece que seu pokémon se machucou, gastará dinheiro com medicamentos";
	}
	
	public String p7(){
		return "Suas pokébolas estão chegando ao fim, precisará gastar comprando novas";
	}
	
	public String p8(){
		return "Começou uma nova jornada, precisa de mantimentos";
	}
	
	public String p9(){
		return "Suas berries estão quase no fim, precisa comprar mais";
	}
	
	public String p10(){
		return "Parece que o Professor Oak está combrando por manter seus pokémons no laboratório";
	}
	
	public String p11(){
		return "Reunião com os amigos, o prejuízo é seu";
	}
	
	public String p12(){
		return "Você teve que emprestar dinheiro à um amigo seu";
	}
	
	public String p13(){
		return "Sua vara de pesca está velha, precisa de uma nova";
	}
	
	public String p14(){
		return "Enfermeira Joy está cobrando por tratamento";
	}
	
	public String p15(){
		return "Seu pokémon precisa aprender um golpe novo, esse TM custará caro";
	}
}
