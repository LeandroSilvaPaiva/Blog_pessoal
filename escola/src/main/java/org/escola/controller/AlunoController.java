package org.escola.controller;

import java.util.List;

import org.escola.model.EscolaModel;
import org.escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping("/aluno")
	public List<EscolaModel> PegarTodos(){
		return repository.findAll();		
	}
	@PostMapping("/aluno")
	public EscolaModel criar (@RequestBody EscolaModel model) {
		repository.save(model);
		return model;
	}
	@GetMapping("/aluno/nome/{nome}")
	public List<EscolaModel> buscarPorNome (@PathVariable Long id){
		return repository.findByNome(id);
	}
	@PostMapping("/turma")
	public EscolaModel novaTurma (@RequestBody EscolaModel turma) {
		repository.save(turma);
		return turma;
	}	
	@PutMapping("/turma/{turma}")
	public EscolaModel atualizar (@PathVariable String turma, @RequestBody EscolaModel model) {
		model.setTurma(turma);
		repository.save(model);
		return model;
	}
	@DeleteMapping("/turma/{turma}")
	public String remover (@PathVariable String turma) {
		repository.deleteByTurma(turma);
		return "sucesso";
	}
	
	

}
