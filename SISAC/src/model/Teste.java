package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
		 
	public static void main(String[] args) {
	 
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
	 
		/* Create and populate Entity */
		Usuario u = new Usuario();
		u.setSenha("1234");
		u.setEmail("umEmail@gmail.com");
	 
	    /* Create EntityManager */
		EntityManager em = emf.createEntityManager();
	    
		//Persist entity 
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
	 
		// Buscar entity 
		u = em.find(Usuario.class, 2);
		System.out.println(u); 
		
	 
		/* Update entity - OK */ 
		em.getTransaction().begin();
		u.setSenha("12345");
		System.out.println("Usuário após update : " + u);
		em.getTransaction().commit();
	 
		/* Remover entity */
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
	 
		/* Checar se foi removida */
		u = em.find(Usuario.class, 1);
		System.out.println("Usuário após remoção : " + u);
	 
		
	}
}
