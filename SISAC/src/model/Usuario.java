package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuario")
public class Usuario {
	//@Column(name="id")
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	//@NotNull
    //@Size(min=10, max=100)
	//@Column(name="email")
	private String email;
	//@Column(name="senha")
	private String senha;


	/*
	 * 
	 * Usuários que tem dois perfis (Professor e Aluno, por exemplo), possa ter um perfil
	preferencial. Caso o usuário deixe de ser Aluno ou Professor, o sistema iria, automaticamente, fazer
	o outro perfil de preferencial e não ia mais possibilitar a entrada como o perfil inativo.
	
	*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + id + ", email=" + email
				+ ", senha=" + senha + "]";
	}
	
	
}
