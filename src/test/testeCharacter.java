package test;

import DAO.CharacterDAO;
import DAO.PlayerDAO;
import enums.RacesEnum;
import model.Character;
import model.Player;

public class testeCharacter {
	
	public static void main(String[] args) {
		Player p1 = new Player(01, "Thiago");
		Character c1 = new Character();
		
		c1.setCharId(01);
		c1.setCharName("Talion");
		c1.setStrenght(10);
		c1.setInteligence(10);
		c1.setLuck(0);
		c1.setCharisma(0);
		c1.setHpPoints(100);
		c1.setArmor(10);
		c1.setPlayer(p1);
		c1.setCharRace(RacesEnum.HUMAN);
		c1.setSpeed(10);
		c1.setLevel(1);
		
		CharacterDAO cDAO = new CharacterDAO();
		PlayerDAO pDAO = new PlayerDAO();
//		pDAO.includePlayer(p1);
		cDAO.includeChar(c1);
		
	}
	
	
}
