package br.com.thiago.rpg.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.thiago.rpg.model.Hero;
import br.com.thiago.rpg.model.Race;

public class HeroDao {
	
	private EntityManager em;
	
	public HeroDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Hero hero) {
		this.em.persist(hero);
	}
	
	public void atualizar(Hero hero) {
		this.em.merge(hero);
	}
	
	public void remover(Hero hero) {
		hero = em.merge(hero);
		this.em.remove(hero);
	}
	
	public List<Hero> buscarPorTodos(){
		String jpql = "SELECT hero FROM Hero hero";
		return em.createQuery(jpql, Hero.class).getResultList();
	}
	
	public List<Hero> buscarPorNome(String HeroName){
		String jpql = "SELECT hero FROM Hero hero where HeroName = :HeroName";
		return em.createQuery(jpql, Hero.class).setParameter("HeroName", HeroName).getResultList();
	}
	
	public List<Hero> buscarPorId(Long heroId){
		String jpql = "SELECT hero FROM Hero hero where Heroid = :heroId";
		return em.createQuery(jpql, Hero.class).setParameter("heroId", heroId).getResultList();
	}
}
