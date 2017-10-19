package br.edu.infnet.task;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.edu.infnet.task.contoller.TarefaController;
import br.edu.infnet.task.modelo.Tarefa;

@Configuration
@ComponentScan(basePackages= {"br.edu.infnet.task"})
public class BeanTarefaTest {
	
	@Bean
	public Tarefa getTask() {
		Tarefa tarefa = new Tarefa();
		tarefa.setNome("jose");
		return tarefa;
	}
	
	
	
	
	
	@Test
	public void testaTarefa() {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(BeanTarefaTest.class);
		assertThat(ctx, notNullValue());
		
		TarefaController controler = ctx.getBean(TarefaController.class);
		controler.consultarTodos();
		
	}






}
