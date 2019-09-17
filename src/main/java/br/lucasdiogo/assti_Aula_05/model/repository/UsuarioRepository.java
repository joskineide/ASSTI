package br.lucasdiogo.assti_Aula_05.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.lucasdiogo.assti_Aula_05.model.bean.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findOneByLoginAndSenha (String login, String senha);
	
}
