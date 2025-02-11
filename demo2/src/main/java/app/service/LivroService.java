package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Livro;

@Service
public class LivroService {
	
	public String save(Livro livro) {
		//COMUNICAÇÃO BD
		return "Livro salvo com sucesso!";
	}
	
	public String delete(long id) {
		//CONVERSA COM O BD
		return "Livro deletado com sucesso!";
	}
	
	public Livro findById(long id) {
		//BD
		
		Livro livro = new Livro();
		livro.setTitulo("abc");
		
		return livro;
	}
	
	public String update(long id, Livro livro) {
		//BD
		return "Livro foi atualizado com sucesso!";
	}
	
	public List<Livro> findAll(){
		List<Livro> lista = new ArrayList<>();
		
		Livro livro1 = new Livro();
		livro1.setTitulo("abc");
		
		Livro livro2 = new Livro();
		livro2.setTitulo("bcd");
		
		lista.add(livro1);
		lista.add(livro2);
		
		return lista;
	}

}
