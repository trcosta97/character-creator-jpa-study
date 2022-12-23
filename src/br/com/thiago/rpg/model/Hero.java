package br.com.thiago.rpg.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="hero")
public class Hero {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long HeroId;
	private String HeroName;
	private int level;
	private int strenght;
	private int hp;
	private int speed;
	@ManyToOne(fetch = FetchType.LAZY)
	private Player playerID;
	@ManyToOne(fetch = FetchType.LAZY)
	private Race RaceId;
	
	
	public Hero() {
	}
	
	public Hero(String charName, int level, int strenght, int hp, int speed, Player player, Race RaceId, Long HeroId) {
		super();
		this.HeroName = charName;
		this.level = level;
		this.strenght = strenght;
		this.hp = hp;
	
		this.speed = speed;
		this.playerID = player;
		this.RaceId = RaceId;
		this.HeroId = HeroId;
	}
	
	
	public Hero(String charName, int level, int strenght, int hp, int speed, Player playerId,Race RaceId) {
		super();
		this.HeroName = charName;
		this.level = level;
		this.strenght = strenght;
		this.hp = hp;
		this.speed = speed;
		this.playerID = playerId;
		this.RaceId = RaceId;
	}

	
	
	public Long getHeroId() {
		return HeroId;
	}

	public void setHeroId(Long heroId) {
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


	public Race getHeroRace() {
		return RaceId;
	}

	public void setHeroRace(Race RaceId) {
		this.RaceId = RaceId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "------------------------" +
				"\nID: " + this.HeroId +
				"\nPlayer ID: " + this.playerID +
				"\nName: " + this.HeroName +
				"\nLevel: " + this.level +
				"\nRace: " + this.RaceId +
				"\nHP: " + this.hp +
				"\nStrenght: " + this.strenght +
				"\nSpeed: " + this.speed +
				"\n------------------------";
				
				
	}
	

	
}
