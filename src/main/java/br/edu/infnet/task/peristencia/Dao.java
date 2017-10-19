package br.edu.infnet.task.peristencia;

import java.util.List;

public interface Dao<T> {

	void save(T entity);

	List<T> getAll();

}
