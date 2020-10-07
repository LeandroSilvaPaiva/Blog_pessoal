package org.escola.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EscolaModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	@Column
	private String nome;
	@Column
	private boolean matriculado;
	@Column
	private String turma;
	
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

}
