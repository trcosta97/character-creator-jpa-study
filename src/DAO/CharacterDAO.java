package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Character;
import model.Player;
import enums.RacesEnum;


public class CharacterDAO {
	
	private Connection conexao;
	
	public void includeChar(Character character) {
		
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		
		try {
			comandoSQL = conexao.prepareStatement("insert into CHARACTER(IDCHAR, CHARNAME, STRENGHT, INTELIGENCE, LUCK,"
					+ "CHARISMA, HPPOINTS, ARMOR, PLAYER, CHARRACE, SPEED, CHARLEVEL)values(?,?,?,?,?,?,?,?,?,?,?,?)");
			comandoSQL.setInt(1, character.getCharId());
			comandoSQL.setString(2, character.getCharName());
			comandoSQL.setInt(3, character.getStrenght());
			comandoSQL.setInt(4, character.getInteligence());
			comandoSQL.setInt(5, character.getLuck());
			comandoSQL.setInt(6, character.getCharisma());
			comandoSQL.setInt(7, character.getHpPoints());
			comandoSQL.setInt(8, character.getArmor());
			comandoSQL.setInt(9, character.getPlayer().getPlayerId());
			comandoSQL.setString(10, character.getCharRace().toString());
			comandoSQL.setInt(11, character.getSpeed());
			comandoSQL.setInt(12, character.getLevel());
		
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	
	public void excludeChar(Character character) {
		
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("delete from CHARACTER where idChar = ?");
			comandoSQL.setInt(1, character.getCharId());
			
			comandoSQL.executeUpdate();
			comandoSQL.close();
			conexao.close();
			
		}catch(SQLException e){
			e.printStackTrace();
			}
	}
	
	public void changeStrenght(Character character, int newStatus) {
		
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("update CHARACTER set STRENGHT = ? where IDCHAR = ?");
			comandoSQL.setInt(1, newStatus);
			comandoSQL.setInt(2, character.getCharId());
			
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void changeInt(Character character, int newStatus) {
		
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("update CHARACTER set INTELIGENCE = ? where IDCHAR = ?");
			comandoSQL.setInt(1, newStatus);
			comandoSQL.setInt(2, character.getCharId());
			
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void changeLuck(Character character, int newStatus) {
			
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
			
		try {
			comandoSQL = conexao.prepareStatement("update CHARACTER set LUCK = ? where IDCHAR = ?");
			comandoSQL.setInt(1, newStatus);
			comandoSQL.setInt(2, character.getCharId());
				
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void changeCharisma(Character character, int newStatus) {
			
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
			
		try {
			comandoSQL = conexao.prepareStatement("update CHARACTER set CHARISMA = ? where IDCHAR = ?");
			comandoSQL.setInt(1, newStatus);
			comandoSQL.setInt(2, character.getCharId());
				
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void changeHpPoints(Character character, int newStatus) {
		
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("update CHARACTER set HPPOINTS = ? where IDCHAR = ?");
			comandoSQL.setInt(1, newStatus);
			comandoSQL.setInt(2, character.getCharId());
			
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void changeArmor(Character character, int newStatus) {
		
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("update CHARACTER set ARMOR = ? where IDCHAR = ?");
			comandoSQL.setInt(1, newStatus);
			comandoSQL.setInt(2, character.getCharId());
			
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void changeRace(Character character, RacesEnum race) {
		
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("update CHARACTER set CHARRACE = ? where IDCHAR = ?");
			comandoSQL.setString(1, race.toString());
			comandoSQL.setInt(2, character.getCharId());
			
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void changeSpeed(Character character, int newStatus) {
		
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("update CHARACTER set SPEED = ? where IDCHAR = ?");
			comandoSQL.setInt(1, newStatus);
			comandoSQL.setInt(2, character.getCharId());
			
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void levelUp (Character character) {
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement comandoSQL = null;
		
		try {
			comandoSQL = conexao.prepareStatement("update CHARACTER set CHARLEVEL = ? where IDCHAR = ?");
			comandoSQL.setInt(1, character.getLevel() + 1);
			comandoSQL.setInt(2, character.getCharId());
			
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
