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
	
	
	public Hero() {
		
	}
	
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

	
	
	public int getHeroId() {
		return HeroId;
	}

	public void setHeroId(int heroId) {
		HeroId = heroId;
	}

	public String getHeroName() {
		return HeroName;
	}

	public void setHeroName(String heroName) {
		HeroName = heroName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public RacesEnum getHeroRace() {
		return heroRace;
	}

	public void setHeroRace(RacesEnum heroRace) {
		this.heroRace = heroRace;
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
