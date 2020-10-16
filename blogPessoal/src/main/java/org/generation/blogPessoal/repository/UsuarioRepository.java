package org.generation.blogPessoal.repository;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.expression.spel.ast.OpInc;

import com.google.common.base.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
	

}
