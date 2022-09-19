package br.entra21.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.entra21.model.entidade.Vacina;
import br.entra21.model.repository.VacinaRepository;
import br.entra21.exception.CampoInvalidoException;
import br.entra21.exception.VacinaSemResponsavelException;

/**
 * Classe de controller REST para o CRUD de vacinas
 * FONTE: https://spring.io/guides/tutorials/rest/
 * 
 * @author Vilmar César Pereira Júnior
 */
@RestController
@RequestMapping("/vacina")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class VacinaController {
	
	private VacinaRepository repositorio = new VacinaRepository();
	
	
	/**
	 * Método GET: geralmente utilizado em consultas
	 * Parâmetros podem ser enviados via URL
	 * 
	 * @return a lista de todas as vacinas
	 */
	@GetMapping
	public List<Vacina> pesquisarTodas(){
		return repositorio.pesquisarTodas();
	}
	
	/**
	 * Método GET
	 * Parâmetro id foi enviado via URL
	 * @return uma vacina específica, dado o seu id
	 */
	@GetMapping("/detalhe/{id}")
	public Vacina pesquisarPorId(@PathVariable Integer id){
		return repositorio.pesquisarPorId(id);
	}
	
	/**
	 * Método GET
	 * Parâmetro id_responsavel foi enviado via URL
	 * @return todas as vacinas de um determinado pesquisador responsável
	 */
	@GetMapping("/responsavel/{id_responsavel}")
	public List<Vacina> pesquisarPorIdResponsavel(@PathVariable(name = "id_responsavel") Integer idResponsavel){
		return repositorio.pesquisarPorIdResponsavel(idResponsavel);
	}
	
	/**
	 * Método POST: geralmente utilizado para inserir novos registros
	 * Parâmetros são enviados no corpo da requisição HTTP, 
	 * para isso usamos a anotação @RequestBody
	 * 
	 * @return a vacina salva, com id preenchido
	 */
	@PostMapping
	public Vacina salvar(@RequestBody Vacina novaVacina) 
			throws VacinaSemResponsavelException, CampoInvalidoException {
		validarCamposObrigatorios(novaVacina);
		novaVacina = repositorio.inserir(novaVacina);
		return novaVacina;
	}
	
	/**
	 * Método PUT: utilizado para atualizar registros. 
	 * Muitas vezes é usado o POST em seu lugar
	 * Parâmetros são enviados no corpo da requisição HTTP, 
	 * para isso usamos a anotação @RequestBody
	 * 
	 * @return um booleano indicando se a vacina em questão foi atualizada
	 */
	@PutMapping()
	public boolean atualizar(@RequestBody Vacina vacinaParaAtualizar) 
			throws VacinaSemResponsavelException, CampoInvalidoException {
		validarCamposObrigatorios(vacinaParaAtualizar);
		return repositorio.atualizar(vacinaParaAtualizar);
	}
	
	/**
	 * Método DELETE
	 * Parâmetro id foi enviado via URL
	 */
	@DeleteMapping("/{id}")
	public boolean excluir(@PathVariable Integer id) 
			throws VacinaSemResponsavelException, CampoInvalidoException {
		return repositorio.excluir(id);
	}

	//Métodos auxiliares
	private void validarCamposObrigatorios(Vacina vacina) throws VacinaSemResponsavelException, CampoInvalidoException {
		if(vacina.getResponsavel() == null) {
			throw new VacinaSemResponsavelException("Informe o pesquisador"
					+ " responsável");
		}

		String mensagemValidacao = "";
		mensagemValidacao += validarCampoString(vacina.getPaisOrigem(), "país de origem");
		
		if(!mensagemValidacao.isEmpty()) {
			throw new CampoInvalidoException(mensagemValidacao);
		}
	}

	private String validarCampoString(String valorCampo, String nomeCampo) {
		if(valorCampo == null || valorCampo.trim().isEmpty()) {
			return "Informe o " + nomeCampo + " \n";
		}
		return "";
	}
}
