package br.com.thiago.rpg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.thiago.rpg.model.Hero;
import br.com.thiago.rpg.model.Player;
import br.com.thiago.rpg.model.Race;

public class PlayerDao {
	
	private EntityManager em;
	
	public PlayerDao(EntityManager em) {
		this.em = em;
	}


	public void cadastrar(Player player) {
		this.em.persist(player);
	}
	
	public void atualizar(Player player) {
		this.em.merge(player);
	}
	
	public void remove(Player player) {
		player = em.merge(player);
		this.em.remove(player);
	}
	
	public List<Player> buscarPorTodos(){
		String jpql = "SELECT player FROM Player player";
		return em.createQuery(jpql, Player.class).getResultList();
	}
	
	public List<Player> buscarPorId(Long id){
		String jpql = "SELECT player FROM Player player where Playerid = :id ";
		return em.createQuery(jpql, Player.class).setParameter("Playerid", id).getResultList();
	}
	
	public List<Player> buscarPorNome(String nome){
		String jpql = "SELECT player FROM Player player where PlayerName = :nome ";
		return em.createQuery(jpql, Player.class).setParameter("PlayerName", nome).getResultList();
	}
	
	public List<Player> buscarPorParametro(String playerName, Long playerId){
		String jpql = "SELECT p FROM Player p WHERE 1=1 ";
		if (playerName != null && !playerName.trim().isEmpty()) {
			jpql = "AND p.playerName = :playerName ";
		}
		if (playerId != null) {
			jpql = "AND p.playerId = :playerId ";
		}
		TypedQuery<Player> query = em.createQuery(jpql, Player.class);
		
		if (playerName != null && !playerName.trim().isEmpty()) {
			query.setParameter("playerName", playerName);
		}
		if (playerId != null) {
			query.setParameter("playerId", playerId);
		}
		return query.getResultList();
				
	}

}
