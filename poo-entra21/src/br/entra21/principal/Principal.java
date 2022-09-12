package br.entra21.principal;

import java.util.ArrayList;
import java.util.Date;

import br.entra21.model.entidade.Pesquisador;
import br.entra21.model.entidade.Vacina;
import br.entra21.model.repository.PesquisadorRepository;
import br.entra21.model.repository.VacinaRepository;
import br.entra21.controller.VacinaController;
import br.entra21.exception.CampoInvalidoException;
import br.entra21.exception.VacinaSemResponsavelException;

public class Principal {

	public static void main(String[] args) {
//		ArrayList<Vacina> vacinas = vacinaRep.pesquisarTodas();
//		
//		for(Vacina v: vacinas) {
//			System.out.println(v);
//		}
		
		//TODO apenas para TESTES! Ainda violando o MVC
//		if(vacinaRep.excluir(2)) {
//			System.out.println("Vacina 2 excluída.");
//		}
		
		PesquisadorRepository pesqRep = new PesquisadorRepository();
		Pesquisador r10 = pesqRep.pesquisarPorId(3);
		
		Vacina senacVac = new Vacina();
		senacVac.setDataInicioPesquisa(new Date());
		senacVac.setEstagioPesquisa(3);
		senacVac.setResponsavel(r10);
		senacVac.setPaisOrigem("Azerbaijão");
		
//		VacinaController vacinaController = new VacinaController();
//		try {
//			senacVac = vacinaController.salvar(senacVac);
//		} catch (VacinaSemResponsavelException | CampoInvalidoException e) {
//			System.out.println(e.getMessage());
//		} 
//
//		if(senacVac.getId() > 0) {
//			System.out.println("Nova vacina salva.");
//		}
		
//		Vacina vacinaQueTemNoBanco = vacinaRep.pesquisarPorId(3);
//		System.out.println(vacinaQueTemNoBanco);
		
//		vacinaQueTemNoBanco.setNomePesquisadorResponsavel("Marcos André");
//		vacinaQueTemNoBanco.setDataInicioPesquisa(new java.util.Date());
//		vacinaQueTemNoBanco.setPaisOrigem("EUA");
//		vacinaQueTemNoBanco.setEstagioPesquisa(3);
//		
//		if(vacinaRep.atualizar(vacinaQueTemNoBanco)) {
//			System.out.println("Vacina atualizada.");
//		}
		
//		Date dataNascimento = new Date(2000, 8, 30);
//		PessoaFisica novaPessoa = new PessoaFisica("123", "Juca", dataNascimento, 1.75, 'M');
//		
//		System.out.println(novaPessoa.calcularIdade());
		
//		ArrayList<Pessoa> correntistas = new ArrayList<Pessoa>();
//		
//		PessoaFisica pedro = new PessoaFisica("Pedro de Lara", "01233311122");
//		pedro.setDataNascimento("15/08/1802");
//		
//		PessoaJuridica firma1 = new PessoaJuridica("A firma",
//				"22333333000011");
//		
//		correntistas.add(pedro);
//		correntistas.add(firma1);
//		
//		for(int i=0; i < correntistas.size(); i++) {
//			System.out.println("Apelido: " 
//						+ correntistas.get(i).getApelido());
//		}
	}
}
