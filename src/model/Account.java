package model;

import interfaces.IAccount;

public class Account implements IAccount {
	private int balance; // Saldo da Conta
	
	public Account(int balanceOpening) { // Saldo de Abertura necessário para instânciar a Conta
		this.balance = balanceOpening;
	}
	
	@Override
	public void deposit(int value) {
		this.balance += value;
	}

	@Override
	public void withdraw(int value) { // OBSERVAÇÃO SERÁ QUE DEVO FAZER A VERIFICAÇÃO DO VALOR AQUI (Resposta: Não, pois agora o banco faz "emprestimos")
		//ou seja, apenas a prisão e na compra de outros terrenos ou bens, será feita essa verificação
//		if(this.balance >= value){
//			this.balance -= value;
//			return true;
//		}
//		return false;	
		this.balance -= value;
	}

	public int getBalance() {
		return balance;
	}

}
