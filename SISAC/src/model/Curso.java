package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {
	@Id
	private int idCurso;
	private String nome;
	private int duracao;
	private int vagas;
	private String descricao;
	
}

//Curso tem lista de alunos

/*create table curso(
 * id_curso integer primary key,
 * nome varchar2(20),
 * descricao varchar2(100),
 * duracao number
 * )
 */
