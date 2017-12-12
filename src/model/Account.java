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
	public boolean withdraw(int value) { // OBSERVAÇÃO SERÁ QUE DEVO FAZER A VERIFICAÇÃO DO VALOR AQUI ???????
		if(this.balance >= value){
			this.balance -= value;
			return true;
		}
		return false;		
	}

	public int getBalance() {
		return balance;
	}

}
