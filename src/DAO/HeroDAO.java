package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Hero;


public class HeroDAO {
	
	private Connection connection;
	

		public HeroDAO(Connection connection) {
			this.connection = connection;
		}
		
	public void include(Hero character) throws SQLException {
		String sql = "INSERT INTO Hero(HeroName, level, strenght, hp, speed, playerId, HeroRace) VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			
			pstm.setString(1, character.getCharName());
			pstm.setInt(2, character.getLevel());
			pstm.setInt(3, character.getStrenght());
			pstm.setInt(4, character.getHp());
			pstm.setInt(5,  character.getSpeed());
			pstm.setInt(6, character.getPlayer());
			pstm.setString(7, character.getCharRace().toString());
			
			pstm.execute();
			
			try(ResultSet rst = pstm.getGeneratedKeys()){
				while(rst.next()) {
					character.setCharId(rst.getInt(1));
				}
			}
		}
	}
		
//	public List<Hero> listar() throws SQLException{
//		
//		List<Hero> lista = new ArrayList<>();
//		
//		String sql = "SELECT * FROM hero";
//		
//		try(PreparedStatement pstm = connection.prepareStatement(sql)){
//			pstm.execute();
//			
//			try(ResultSet rst = pstm.getResultSet()){
//				while(rst.next()) {
//					Hero hero = new Hero(rst.getString(1), rst.getInt(2), rst.getInt(3), rst.getInt(4), rst.getInt(5), rst.getInt(6), rst.getString(7).toString());
//				}
//			}
//		}
//	}
	
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

