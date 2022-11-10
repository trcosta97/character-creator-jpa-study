package model;

import enums.RacesEnum;

public class Character {
	private String charName;
	private int level;
	private int strenght;
	private int inteligence;
	private int luck;
	private int charisma;
	private int hpPoints;
	private int armor;
	private int speed;
	private Player player;
	private RacesEnum charRace;
	
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
	
	private int charId;
	public int getCharId() {
		return charId;
	}
	public void setCharId(int charId) {
		this.charId = charId;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public int getStrenght() {
		return strenght;
	}
	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}
	public int getInteligence() {
		return inteligence;
	}
	public void setInteligence(int inteligence) {
		this.inteligence = inteligence;
	}

	public int getLuck() {
		return luck;
	}
	public void setLuck(int luck) {
		this.luck = luck;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	public int getHpPoints() {
		return hpPoints;
	}
	public void setHpPoints(int hpPoints) {
		this.hpPoints = hpPoints;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public RacesEnum getCharRace() {
		return charRace;
	}
	public void setCharRace(RacesEnum charRace) {
		this.charRace = charRace;
	}
;
	
}
