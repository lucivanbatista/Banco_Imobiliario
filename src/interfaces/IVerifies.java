package interfaces;

import model.ComercialSquare;
import model.Player;

public interface IVerifies {
//	public boolean verifyValidPlayed(String resultado); // Verificar se jogada � v�lida
	
	
	
	public boolean verifyBalancePlayerToPay(Player p, float c); // Verifica se o jogador conseguir� comprar
	public boolean verifyItsMySquare(Player p, ComercialSquare c); // Verifica se a casa � do jogador
	
	
	
	
	
	
	
	
	
	
//	public boolean verificaSeJogadorAindaPossuiSaldo(Jogador jogador);
//	public boolean verificaJogadaNaoNulaOuVazia(String resultado);
//	public boolean verificaSeNumerosDosDadosSaoValidos(int resultadoDados);
//	public boolean verificaQuantidadeJogadoresIsValida(int qtd_jogadores);
//	public boolean verificaNomeIsValido(String nomeJogador);
//	public boolean verificaInputDiferentedeNull(String entrada);
//
//	public boolean verificaSeJogadorEstaPreso(Jogador jogador);
//	public boolean verificaSeJogadorPassouNaPartida(int posicaoAtual, int resultadoDados);
}
