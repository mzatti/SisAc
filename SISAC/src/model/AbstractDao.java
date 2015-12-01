package model;

import java.sql.Connection;

import javafx.collections.ObservableList;

public abstract class AbstractDao<T> {
	public static Connection conexao; 
	
	public abstract boolean save(T o);
	
	public abstract int update(T o);
	
	public abstract void remove(T o);
	
	public abstract T find(T o);
	
	public abstract ObservableList<T> findAll();
	
}