package br.edu.infnet.task;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import br.edu.infnet.task.contoller.TarefaController;
import br.edu.infnet.task.modelo.Tarefa;
import br.edu.infnet.task.peristencia.Dao;
import br.edu.infnet.task.peristencia.TarefaDao;

public class ConsultaTarefasTest {
	
	
	@Test
	public void consultaTarefasTest() {
		TarefaController controler = new TarefaController();
		Dao<Tarefa> dao = Mockito.mock(TarefaDao.class);
		

		
		when(dao.getAll()).thenReturn(Arrays.asList(new Tarefa()));
		
		List<Tarefa> tarefas = controler.getAll();
		
		assertThat(tarefas.size(), greaterThan(0));
	}
	
}
