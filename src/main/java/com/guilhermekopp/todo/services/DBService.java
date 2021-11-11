package com.guilhermekopp.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermekopp.todo.domain.Todo;
import com.guilhermekopp.todo.repositories.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public void instanciaBaseDeDados() throws ParseException {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Todo t1 = new Todo (null, "Estudar", "Estudar Spring Boot 2 e Angular 11", sdf.parse("03/12/2022"), false);
		Todo t2 = new Todo (null, "Ler", "Ler livro de desenvolvimento", sdf.parse("10/11/2021"), true);
		Todo t3 = new Todo (null, "Exercicios", "Praticar exercicios", sdf.parse("10/12/2021"), false);
		Todo t4 = new Todo (null, "Programar", "Meditar durante 30 minutos pela manhã", sdf.parse("09/11/2021"), true);
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}

}
