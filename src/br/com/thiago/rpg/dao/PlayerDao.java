package br.com.thiago.rpg.dao;

import javax.persistence.EntityManager;

import br.com.thiago.rpg.model.Player;

public class PlayerDao {
	
	private EntityManager em;
	
	public PlayerDao(EntityManager em) {
		this.em = em;
	}


	public void cadastrar(Player player) {
		this.em.persist(player);
	}

	



}
