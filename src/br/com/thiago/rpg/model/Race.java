package br.com.thiago.rpg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="race")
public class Race {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long raceId;
	private String raceName;
	
	public Race() {
		
	}
	
	public Race(String raceName) {
		this.raceName = raceName;
	}
	
	public Race(String raceName, long raceId) {
		this.raceName = raceName;
		this.raceId = raceId;
	}

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	
	
}
