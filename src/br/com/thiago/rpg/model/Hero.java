package br.com.thiago.rpg.model;

import javax.persistence.Embedded;
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
	private Long heroId;
	private String heroName;
	@Embedded
	private HeroStatus heroStatus;
	@ManyToOne(fetch = FetchType.LAZY)
	private Player playerID;
	@ManyToOne(fetch = FetchType.LAZY)
	private Race RaceId;
	
	
	public Hero() {
	}
	
	public Hero(String charName, HeroStatus heroStatus, Player player, Race RaceId, Long HeroId) {
		super();
		this.heroName = charName;
		this.heroStatus = heroStatus;
		this.playerID = player;
		this.RaceId = RaceId;
		this.heroId = HeroId;
	}
	
	
	public Hero(String charName, HeroStatus heroStatus, Player playerId,Race RaceId) {
		super();
		this.heroName = charName;
		this.heroStatus = heroStatus;
		this.playerID = playerId;
		this.RaceId = RaceId;
	}

	
	
	public Long getHeroId() {
		return heroId;
	}

	public void setHeroId(Long heroId) {
		heroId = heroId;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		heroName = heroName;
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
				"\nID: " + this.heroId +
				"\nPlayer ID: " + this.playerID +
				"\nName: " + this.heroName +
				"\nRace: " + this.RaceId +
				"\n------------------------";
				
				
	}
	

	
}
