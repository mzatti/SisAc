package model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Classe com JavaFX Externalizable
 * 
 * @author Marcio Bigolin <marcio.bigolin@canoas.ifrs.edu.br>
 */
@Entity
public class Disciplina implements Externalizable{

	/*
	 * O aluno precisa estar cadastrado em um curso e turma para se cadastrar em uma disciplina. Fulano
	 * não pode estar em um curso (ex. Análise de Sistemas) sem estar em uma turma (ex. Turma 2016/1)
	 * e vice-versa. 
	 */
	@Id
	@Column(name = "id_disciplina")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDisciplina;
	
	@Column(name = "nome_disciplina", nullable = false)	
	private String nomeDisciplina;
	
	@Column(length = 3000, nullable = true)
	private String descricao;
	
	@OneToOne
	private Curso curso;
	
	private int vagas;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
