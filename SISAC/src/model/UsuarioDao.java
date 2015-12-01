package model;



import javafx.collections.ObservableList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UsuarioDao extends AbstractDao<Usuario>{
	
	private static UsuarioDao instance; 
	protected EntityManager entityManager; 
	public static UsuarioDao getInstance(){ 
		if (instance == null){ 
			instance = new UsuarioDao(); 
		} 
		return instance; 
		} 
	
	private UsuarioDao() { 
		entityManager = getEntityManager(); 
	} 
	
	private EntityManager getEntityManager() { 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence"); 
		if (entityManager == null) { 
			entityManager = factory.createEntityManager(); 
		} 
		return entityManager; 
		} 
	
	public Usuario getById(final int id) { 
		return entityManager.find(Usuario.class, id); 
		} 
	
	@SuppressWarnings("unchecked") 
	public ObservableList<Usuario> findAll(){ 
		entityManager.createQuery("FROM " + Usuario.class.getName()).getResultList();
		return null;

	} 
	public void persist(Usuario u) {
		try { 
			entityManager.getTransaction().begin(); 
			entityManager.persist(u); 
			entityManager.getTransaction().commit(); 
			} catch (Exception ex) { 
				ex.printStackTrace(); 
				entityManager.getTransaction().rollback(); 
			} 
		} 
	

	public void merge(Usuario usuario) { 
		try { entityManager.getTransaction().begin(); 
		entityManager.merge(usuario); 
		entityManager.getTransaction().commit(); 
		} catch (Exception ex) { 
			ex.printStackTrace(); 
			entityManager.getTransaction().rollback(); 
			} 
		} 
	
	public void remove(Usuario usuario) { 
		try { 
			entityManager.getTransaction().begin(); 
			usuario = entityManager.find(Usuario.class, usuario.getId()); 
			entityManager.remove(usuario); 
			entityManager.getTransaction().commit(); 
			} catch (Exception ex) { 
				ex.printStackTrace(); 
				entityManager.getTransaction().rollback(); 
				} 
		} 
	
	public void removeById(final int id) { 
		try { 
			Usuario usuario = getById(id); 
			remove(usuario); 
			} catch (Exception ex) { 
				ex.printStackTrace(); 
				} 
		}
    
	@Override
	public boolean save(Usuario o) {
		entityManager.getTransaction().begin(); //Inicia transação
		 entityManager.merge(o);
		 entityManager.close(); //fecha EM e libera as entidades (as torna **detached**)
		return true;
	}
	/*
	@Override
    public boolean save(Usuario o){
        this.entityManager.persist(o);
        return true;
    }
    */
	@Override
	public int update(Usuario o) {
		 o.setSenha(o.getSenha());	
		 entityManager.getTransaction().begin(); //Inicia transação
		 entityManager.merge(o);
		 entityManager.close(); //fecha EM e libera as entidades (as torna **detached**)
		return 0;
	}

	@Override
	public Usuario find(Usuario o) {
		// TODO Auto-generated method stub
		return null;
	}



	

	
}
