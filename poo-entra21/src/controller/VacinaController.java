package controller;

import exception.VacinaSemResponsavelException;
import model.entidade.Vacina;
import model.repository.VacinaRepository;

public class VacinaController {
	
	private VacinaRepository repositorio = new VacinaRepository();
	
	public Vacina salvar(Vacina novaVacina) throws VacinaSemResponsavelException {
		
		if(novaVacina.getResponsavel() == null) {
			throw new VacinaSemResponsavelException("Informe o pesquisador"
					+ " responsável");
		}
		
		novaVacina = repositorio.inserir(novaVacina);
		
		return novaVacina;
	}
}
