package test;

import java.sql.Connection;
import java.sql.SQLException;

import DAO.ConnectionFactory;
import DAO.HeroDAO;
import DAO.PlayerDAO;
import enums.RacesEnum;
import model.Hero;
import model.Player;

public class testeCharacter {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		Player p1 = new Player("Thiago");
		PlayerDAO pDAO = new PlayerDAO(connection);
//		
		Hero h1 = new Hero("Kaaras", 1, 10, 50, 10, 3, RacesEnum.ELF);
		Hero h2 = new Hero("Jiiuj", 1, 10, 50, 10, 3, RacesEnum.FAIRY);
		HeroDAO hDAO = new HeroDAO(connection);
		
//		pDAO.include(p1);
//		hDAO.include(h2);		
//		pDAO.deleteById(2);
		
		hDAO.delete(5);
		System.out.println(hDAO.listar());

	
	
	
	

		
		
		
	}	
}
	
	

