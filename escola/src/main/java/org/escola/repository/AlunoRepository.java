package org.escola.repository;

import java.util.List;

import org.escola.model.EscolaModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlunoRepository extends JpaRepository<EscolaModel, Long>{

	Object deleteByTurma = null;

	List<EscolaModel> findByNome(Long id);

	void deleteByTurma(String turma);

}
