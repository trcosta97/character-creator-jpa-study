package test;

import DAO.GerenciadorBD;

public class TestaConexao {

	public static void main(String[] args) {
		if(GerenciadorBD.obterConexao() == null) {
			System.out.println("Erro ao estabelecer conex�o");
		}
		else {
			System.out.println("Conex�o estabelecida com sucesso!");
			
		}

	}

}
