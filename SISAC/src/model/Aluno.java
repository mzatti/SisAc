package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;



@Entity
public class Aluno {
	@Id
	private int idAluno;//matrícula
	@NotNull
    @Size(min=10, max=100)
	private String nome;
    @Past
    private Date dataNascimento;
    
    //OneToMany turmas
    
}
