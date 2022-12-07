package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import enums.RacesEnum;
import model.Hero;


public class HeroDAO {
	
	private Connection connection;
	

		public HeroDAO(Connection connection) {
			this.connection = connection;
		}
		
	public void include(Hero character) throws SQLException {
		String sql = "INSERT INTO Hero(HeroName, level, strenght, hp, speed, playerId, HeroRace) VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			
			pstm.setString(1, character.getHeroName());
			pstm.setInt(2, character.getLevel());
			pstm.setInt(3, character.getStrenght());
			pstm.setInt(4, character.getHp());
			pstm.setInt(5,  character.getSpeed());
			pstm.setInt(6, character.getPlayerID());
			pstm.setString(7, character.getHeroRace().toString());
			
			pstm.execute();
			
			try(ResultSet rst = pstm.getGeneratedKeys()){
				while(rst.next()) {
					character.setHeroId(rst.getInt(1));
				}
			}
		}
	}
		
	public List<Hero> listar() throws SQLException{
		
		List<Hero> lista = new ArrayList<>();
		
		String sql = "SELECT * FROM hero";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.execute();
			try(ResultSet rst = pstm.getResultSet()){
				while(rst.next()) {
					Hero h = new Hero();
					h.setHeroId(rst.getInt(1));
					h.setHeroName(rst.getString(2));
					h.setLevel(rst.getInt(3));
					h.setStrenght(rst.getInt(4));
					h.setHp(rst.getInt(5));
					h.setSpeed(rst.getInt(6));
					h.setPlayerID(rst.getInt(7));
					String race = (rst.getString(8).toString());
					if (race.equals("HUMAN")) 
						h.setHeroRace(RacesEnum.HUMAN);
					else if(race.equals("ELF"))
						h.setHeroRace(RacesEnum.ELF);
					else if(race.equals("DWARF")) 
						h.setHeroRace(RacesEnum.DWARF);
					else if(race.equals("FAIRY"))
						h.setHeroRace(RacesEnum.FAIRY);
					else if(race.equals("HALFLING"))
						h.setHeroRace(RacesEnum.HALFLING);
					lista.add(h);
					}
				
				}
			}
	return lista;	
	}
	
	
	public void delete(int id) throws SQLException{
		String sql = "DELETE FROM Hero WHERE HeroID = ?";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			stm.setInt(1, id);
			stm.execute();
			
			Integer linhasModificadas = stm.getUpdateCount();
			System.out.println("O número de linhas modificadas foi " + linhasModificadas);
		}
	}
	
	
}	

