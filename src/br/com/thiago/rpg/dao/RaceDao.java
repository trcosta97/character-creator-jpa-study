package br.com.thiago.rpg.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.thiago.rpg.model.Player;
import br.com.thiago.rpg.model.Race;

public class RaceDao {
	private EntityManager em;
	
	public RaceDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Race race) {
		this.em.persist(race);
	}
	
	public void atualizar(Race race) {
		this.em.merge(race);
	}
	
	public void remove(Race race) {
		race = em.merge(race);
		this.em.remove(race);
	}
	
	public List<Race> buscarPorTodos(){
		String jpql = "SELECT race FROM Race race";
		return em.createQuery(jpql, Race.class).getResultList();
	}
	
	public List<Player> buscarPorId(Long id){
		String jpql = "SELECT race FROM Race race where RaceId = :id ";
		return em.createQuery(jpql, Player.class).setParameter("RaceId", id).getResultList();
	}
	
	public List<Player> buscarPorNome(String nome){
		String jpql = "SELECT race FROM Race player where RaceName = :nome ";
		return em.createQuery(jpql, Player.class).setParameter("RaceName", nome).getResultList();
	}

}
