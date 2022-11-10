package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Character;
import model.Player;
import enums.RacesEnum;

public class PlayerDAO {

	private Connection conexao;
	
	public void includePlayer(Player player) {
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("insert into PLAYER(PLAYERID, PLAYERNAME) values(?,?)");
			comandoSQL.setInt(1, player.getPlayerId());
			comandoSQL.setString(2, player.getPlayerName());
		
			comandoSQL.executeUpdate();
			comandoSQL.close();
			conexao.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updatePlayer(Player player) {
			
			conexao = GerenciadorBD.obterConexao();
			PreparedStatement comandoSQL = null;
			
			try {
				comandoSQL = conexao.prepareStatement("update PLAYER set PLAYERNAME = ? where PLAYERID = ?");
				comandoSQL.setString(1, player.getPlayerName());
				comandoSQL.setInt(3, player.getPlayerId());
				
				comandoSQL.executeUpdate();
				conexao.close();
				comandoSQL.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
	}
	
	public void excludePlayer(int id) {
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("delete from PLAYER where PLAYERID = ?");
			comandoSQL.setInt(1, id);
			
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}