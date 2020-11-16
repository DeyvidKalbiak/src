package com.alma.eja;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import java.io.Serializable;

@Named("CadastroTela")
@ViewScoped
public class Cadastro implements Serializable {

	private static final long serialVersionUID = 1L;
	private Professor professor;
	private List<Professor> professores;

	@PostConstruct
	public void iniciar() {
		professor = new Professor();
		professores = new ArrayList<Professor>();
	}

	public void salvar() {
		professores.add(professor);
		System.out.println("Cadastro salvo com sucesso: " + professor.getNome());
		System.out.println("Obrigado!!");
		professor = new Professor();
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Professor> getProfessor1() {
		return professores;
	}
}
