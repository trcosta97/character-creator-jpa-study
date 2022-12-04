package model;

public class Player {
	private int playerId;
	private String playerName;

	
	
	public Player() {

	}
	
	public Player(int playerId, String playerNome) {
		this.playerId = playerId;
		this.playerName = playerNome;
	}
	
	public Player(String playerNome) {
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
