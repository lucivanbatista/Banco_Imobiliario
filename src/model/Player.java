package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.IPlayerFee;
import interfaces.IPlayerTerrain;

public class Player implements IPlayerFee, IPlayerTerrain{
	//---
	private int id; // Identificador do Jogador
	private String name; // Nome do Jogador
	private Account account;
	private List<ComercialSquare> myComercialSquares;
	//---
	private Square positionPlayer; // Em qual Casa o Jogador está
	//---
	
	public Player(String name, Account account, Square positionPlayer) {
		this.name = name;
		this.account = account;
		this.myComercialSquares = new ArrayList<>();
		this.positionPlayer = positionPlayer;
	}
	
	@Override
	public void payFee(int fee) {
		this.account.withdraw(fee); // Agora irá ficar negativo
//		if(this.getBalance() >= fee){
//			this.account.withdraw(fee);
//		}
//		int myBalance = this.account.getBalance(); // Não faz sentido eu retirar dinheiro que não possuo, MAS mudei de ideia... pensa nos emprestimos kkk
//		this.account.withdraw(myBalance);
//		return myBalance;
	}

	@Override
	public void receiveFee(int fee) {
		this.account.deposit(fee);
	}

	@Override
	public int getQtdTerrain() {
		
		return 0;
	}

	@Override
	public void buyTerrain(ComercialSquare c) {
		c.setOwner(this);
		c.setSold(true);
		account.withdraw(c.getPrice());
		addTerrain(c);
	}

	@Override
	public void addTerrain(ComercialSquare c) {
		this.myComercialSquares.add(c);
	}
	
	public float getBalance(){
		return this.account.getBalance();
	}

	public Square getPositionPlayer() {
		return positionPlayer;
	}

	public void setPositionPlayer(Square positionPlayer) {
		this.positionPlayer = positionPlayer;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Account getAccount() {
		return account;
	}

	public List<ComercialSquare> getMyComercialSquares() {
		return myComercialSquares;
	}
}
