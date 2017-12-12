package model;

import interfaces.IPlayerFee;
import interfaces.IPlayerTerrain;

public class Player implements IPlayerFee, IPlayerTerrain{
	//---
	private int id; // Identificador do Jogador
	private String name; // Nome do Jogador
	private Account account;
	//---
	//---
	private Square positionPlayer; // Em qual Casa o Jogador está
	//---
	
	public Player(String name, Account account, Square positionPlayer) {
		this.name = name;
		this.account = account;
		this.positionPlayer = positionPlayer;
		
	}
	
	@Override
	public boolean payFee(int fee) {
		if(this.account.withdraw(fee) == true){
			return true;
		}
		return false;
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
	public boolean buyTerrain() {
		return false;
	}

	@Override
	public void addTerrain() {
		
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
}
