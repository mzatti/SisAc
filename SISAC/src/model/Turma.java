package model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Turma {
	@Id
	private int idTurma;
	private int nroAlunos;
	
	@ManyToOne
	@JoinColumn(name = "professor")
	private Professor professor;
	
	@OneToOne(mappedBy = "aluno")
	private Aluno aluno;


}
