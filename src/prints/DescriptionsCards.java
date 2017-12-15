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
