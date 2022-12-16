package br.com.thiago.rpg.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.thiago.rpg.model.Player;

public class CadastroDePlayerEHeros {
	
	public static void main(String[] args) {
		
		Player p = new Player("Thiago");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("rpg");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}
}
