package br.com.thiago.rpg.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.thiago.rpg.dao.HeroDao;
import br.com.thiago.rpg.dao.PlayerDao;
import br.com.thiago.rpg.dao.RaceDao;
import br.com.thiago.rpg.model.Hero;
import br.com.thiago.rpg.model.Player;
import br.com.thiago.rpg.model.Race;

public class CadastroDePlayerEHeros {
	
	public static void main(String[] args) {
		
		Player p = new Player("Thiago");
		Race human = new Race("Human", 1l);
		Hero h1 = new Hero("Karas", 1, 10, 10, 10, p, human);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("rpg");
		EntityManager em = factory.createEntityManager();
		
		PlayerDao playerDao = new PlayerDao(em);
		HeroDao heroDao = new HeroDao(em);
		RaceDao raceDao = new RaceDao(em);
		
		em.getTransaction().begin();
		playerDao.cadastrar(p);
		heroDao.cadastrar(h1);
		em.getTransaction().commit();
		em.close();
	}
}
