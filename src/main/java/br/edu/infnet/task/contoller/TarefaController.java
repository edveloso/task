package br.edu.infnet.task.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.infnet.task.modelo.Tarefa;
import br.edu.infnet.task.peristencia.Dao;


@Component
public class TarefaController {

	
	@Autowired
	private Dao<Tarefa> tarefaDao;
	
	public void gravar(Tarefa tarefa) {
		tarefaDao.save(tarefa);
	}

	public List<Tarefa> getAll() {
		return tarefaDao.getAll();
	}

	protected Dao<Tarefa> getTarefaDao() {
		return tarefaDao;
	}

	protected void setTarefaDao(Dao<Tarefa> tarefaDao) {
		this.tarefaDao = tarefaDao;
	}

	public List<Tarefa> consultarTodos() {
		return tarefaDao.getAll();
	}

}
