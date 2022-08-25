package controller;

import exception.CampoInvalidoException;
import exception.VacinaSemResponsavelException;
import model.entidade.Vacina;
import model.repository.VacinaRepository;

public class VacinaController {
	
	private VacinaRepository repositorio = new VacinaRepository();
	
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
