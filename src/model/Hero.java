package model;

import enums.RacesEnum;

public class Hero {
	private int HeroId;
	private String HeroName;
	private int level;
	private int strenght;
	private int hp;
	private int speed;
	private int playerID;
	private RacesEnum heroRace;
	
	
	
	
	public Hero(String charName, int level, int strenght, int hp, int speed, int player, RacesEnum charRace, int charId) {
		super();
		this.HeroName = charName;
		this.level = level;
		this.strenght = strenght;
		this.hp = hp;
	
		this.speed = speed;
		this.playerID = player;
		this.heroRace = charRace;
		this.HeroId = charId;
	}
	
	
	public Hero(String charName, int level, int strenght, int hp, int speed, int playerId, RacesEnum charRace) {
		super();
		this.HeroName = charName;
		this.level = level;
		this.strenght = strenght;
		this.hp = hp;
		this.speed = speed;
		this.playerID = playerId;
		this.heroRace = charRace;
	}

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getCharId() {
		return HeroId;
	}
	public void setCharId(int charId) {
		this.HeroId = charId;
	}
	public String getCharName() {
		return HeroName;
	}
	public void setCharName(String charName) {
		this.HeroName = charName;
	}
	public int getStrenght() {
		return strenght;
	}
	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hpPoints) {
		this.hp = hpPoints;
	}
	
	public int getPlayer() {
		return this.playerID;
	}
	public void setPlayer(int player) {
		this.playerID = player;
	}
	public RacesEnum getCharRace() {
		return heroRace;
	}
	public void setCharRace(RacesEnum charRace) {
		this.heroRace = charRace;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "------------------------" +
				"\nID: " + this.HeroId +
				"\nPlayer ID: " + this.playerID +
				"\nName: " + this.HeroName +
				"\nLevel: " + this.level +
				"\nRace: " + this.heroRace +
				"\nHP: " + this.hp +
				"\nStrenght: " + this.strenght +
				"\nSpeed: " + this.speed +
				"\n------------------------";
				
				
	}
	

	
}
