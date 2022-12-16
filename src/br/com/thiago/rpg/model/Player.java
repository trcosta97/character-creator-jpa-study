package br.com.thiago.rpg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long playerId;
	private String playerName;

	
	
	public Player() {

	}
	
	public Player(Long playerId, String playerNome) {
		this.playerId = playerId;
		this.playerName = playerNome;
	}
	
	public Player(String playerNome) {
		this.playerName = playerNome;
	}
	
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerNome) {
		this.playerName = playerNome;
	}
	
	@Override
	public String toString() {
		
		return "----------------------" +
				"\nID: " + this.playerId +
				"\nName: " + this.playerName +
				"\n----------------------";
	}
}
