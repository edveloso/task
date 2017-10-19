package br.edu.infnet.task.peristencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.edu.infnet.task.modelo.Tarefa;


@Component
public class TarefaDao implements Dao<Tarefa> {

	private static List<Tarefa> tarefas = new ArrayList<Tarefa>();
	
	public void save(Tarefa entity) {
		tarefas.add(entity);
	}

	public List<Tarefa> getAll() {
		return tarefas;
	}

}
