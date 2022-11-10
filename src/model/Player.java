package model;

public class Player {
	private int playerId;
	private String playerName;
	
	
	public Player(int playerId, String playerNome) {
		this.playerId = playerId;
		this.playerName = playerNome;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerNome(String playerNome) {
		this.playerName = playerNome;
	}
}
