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
}
