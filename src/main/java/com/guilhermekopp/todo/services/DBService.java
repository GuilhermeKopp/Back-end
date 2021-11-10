package com.guilhermekopp.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermekopp.todo.domain.Todo;
import com.guilhermekopp.todo.repositories.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public void instanciaBaseDeDados() {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Todo t1 = new Todo (null, "Estudar", "Estudar Spring Boot 2 e Angular 11", LocalDateTime.parse("03/12/2022 10:25", formatter), false);
		Todo t2 = new Todo (null, "Ler", "Ler livro de desenvolvimento", LocalDateTime.parse("10/11/2021 08:25", formatter), true);
		Todo t3 = new Todo (null, "Exercicios", "Praticar exercicios", LocalDateTime.parse("10/12/2021 15:15", formatter), false);
		Todo t4 = new Todo (null, "Programar", "Meditar durante 30 minutos pela manhã", LocalDateTime.parse("09/11/2021 19:30", formatter), true);
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}

}
