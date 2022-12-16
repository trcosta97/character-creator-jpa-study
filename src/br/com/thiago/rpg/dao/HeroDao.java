package br.com.thiago.rpg.dao;

import javax.persistence.EntityManager;

import br.com.thiago.rpg.model.Hero;

public class HeroDao {
	
	private EntityManager em;
	
	public HeroDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Hero hero) {
		this.em.persist(hero);
	}
}
