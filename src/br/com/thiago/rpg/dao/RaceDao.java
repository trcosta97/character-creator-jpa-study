package br.com.thiago.rpg.dao;

import javax.persistence.EntityManager;

public class RaceDao {
	private EntityManager em;
	
	public RaceDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(RaceDao race) {
		this.em.persist(race);
	}
}
