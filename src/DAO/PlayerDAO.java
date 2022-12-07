package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;

public class PlayerDAO {

	private Connection connection;
	
	public PlayerDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void include(Player player) throws SQLException{
		String sql = "INSERT INTO PLAYER (playername) VALUES (?)";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			
			pstm.setString(1, player.getPlayerName());
			
			pstm.execute();
			
			try(ResultSet rst = pstm.getGeneratedKeys()){
				while(rst.next()) {
					player.setPlayerId(rst.getInt(1));
				}
			}
		}
	}
	
	public List<Player> listar() throws SQLException{
		
		List<Player> lista = new ArrayList<>();
		
		String sql = "SELECT * FROM player";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.execute();
			try(ResultSet rst = pstm.getResultSet()){
				while(rst.next()) {
					Player player = new Player (rst.getString(1));
					lista.add(player);
				}
			}		
		}
		return lista;
	}

	public void deleteById(int id) throws SQLException{
		String sql = "DELETE FROM player WHERE playerid = ?";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			stm.setInt(1, id);
			stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("O número de linhas modificadas foi de " + linhasModificadas);
		
		}
	}

}