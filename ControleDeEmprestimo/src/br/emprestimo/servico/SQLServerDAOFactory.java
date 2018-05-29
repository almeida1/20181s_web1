package br.emprestimo.servico;

import br.emprestimo.modelo.EmprestimoDAO;
import br.emprestimo.modelo.LivroDAO;
import br.emprestimo.modelo.UsuarioDAO;

public class SQLServerDAOFactory extends DAOFactory {

	@Override
	public EmprestimoDAO getEmprestimoDAO() {
		return null;
	}

	@Override
	public LivroDAO getLivroDAO() {
		return null;
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return null;
	}

}
