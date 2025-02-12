package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Livro;
import app.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	
	public String save(Livro livro) {
		this.livroRepository.save(livro); // -> qto não tem ID vira INSERT INTO livro...
		return "Livro salvo com sucesso!";
	}
	

	public String update(long id, Livro livro) {
		livro.setId(id);
		this.livroRepository.save(livro); //-> qdo tem ID vira UPDATE livro SET ....
		return "Livro foi atualizado com sucesso!";
	}
	
	public String delete(long id) {
		this.livroRepository.deleteById(id);
		return "Livro deletado com sucesso!";
	}
	
	public Livro findById(long id) {
		return this.livroRepository.findById(id).get();
	}
	
	public List<Livro> findAll(){
		return this.livroRepository.findAll();
	}

}
