package br.entra21.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.entra21.model.entidade.Vacina;
import br.entra21.model.repository.VacinaRepository;
import br.entra21.exception.CampoInvalidoException;
import br.entra21.exception.VacinaSemResponsavelException;

@RestController
@RequestMapping("/vacina")
public class VacinaController {
	
	private VacinaRepository repositorio = new VacinaRepository();
	
	@GetMapping
	public List<Vacina> pesquisarTodas(){
		return repositorio.pesquisarTodas();
	}
	
	public Vacina salvar(Vacina novaVacina) throws VacinaSemResponsavelException, CampoInvalidoException {
		
		if(novaVacina.getResponsavel() == null) {
			throw new VacinaSemResponsavelException("Informe o pesquisador"
					+ " responsável");
		}
		//TODO continuar as validações
		if(novaVacina.getPaisOrigem() == null || novaVacina.getPaisOrigem().trim().isEmpty()) {
			throw new CampoInvalidoException("Informe o país de origem da vacina");
		}
		
		novaVacina = repositorio.inserir(novaVacina);
		
		return novaVacina;
	}
}
