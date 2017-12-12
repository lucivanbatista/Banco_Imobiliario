package model;

import interfaces.IAccount;

public class Account implements IAccount {
	private int balance; // Saldo da Conta
	
	public Account(int balanceOpening) { // Saldo de Abertura necess�rio para inst�nciar a Conta
		this.balance = balanceOpening;
	}
	
	@Override
	public void deposit(int value) {
		this.balance += value;
	}

	@Override
	public boolean withdraw(int value) { // OBSERVA��O SER� QUE DEVO FAZER A VERIFICA��O DO VALOR AQUI ???????
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
