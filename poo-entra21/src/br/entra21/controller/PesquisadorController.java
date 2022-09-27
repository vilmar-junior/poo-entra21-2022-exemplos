package br.entra21.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.entra21.model.entidade.Pesquisador;
import br.entra21.model.repository.PesquisadorRepository;

/**
 * Classe de controller REST para o CRUD de pesquisadores
 * 
 * @author Vilmar César Pereira Júnior
 */
@RestController
@RequestMapping("/pesquisador")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PesquisadorController {
	
	private PesquisadorRepository repositorio = new PesquisadorRepository();
	
	
	/**
	 * Método GET: geralmente utilizado em consultas
	 * Parâmetros podem ser enviados via URL
	 * 
	 * @return a lista de todas as vacinas
	 */
	@GetMapping
	public List<Pesquisador> pesquisarTodos(){
		return repositorio.pesquisarTodos();
	}
	
	//TODO implementar os demais métodos
}
