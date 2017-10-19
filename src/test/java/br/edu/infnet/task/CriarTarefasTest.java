package br.edu.infnet.task;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.lang.reflect.Field;

import org.junit.Test;
import org.mockito.Mockito;

import br.edu.infnet.task.contoller.TarefaController;
import br.edu.infnet.task.modelo.Tarefa;
import br.edu.infnet.task.peristencia.TarefaDao;

public class CriarTarefasTest {
	
	@Test
	public void criarTarefas() {
		Tarefa tarefa = new Tarefa();
		tarefa.setNome("Fazer compras");
		
		TarefaController controler = new TarefaController();
		TarefaDao tarefaDao = mock(TarefaDao.class);
		setDependenceForBean("tarefaDao", tarefaDao, controler);
		controler.gravar(tarefa);
		 
		verify(tarefaDao, times(1)).save(Mockito.any(Tarefa.class));;
	}

	private void setDependenceForBean(String campo, Object dependence, Object bean) {
		Class clazz = bean.getClass();
		Field field = null;
		try {
			field = clazz.getDeclaredField(campo);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		field.setAccessible(true);
		try {
			field.set(bean,dependence);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
