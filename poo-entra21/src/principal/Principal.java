package principal;

import java.util.Date;

import model.entidade.Vacina;
import model.repository.VacinaRepository;

public class Principal {

	public static void main(String[] args) {
		//TODO apenas para TESTES! Ainda violando o MVC
		VacinaRepository vacinaRep = new VacinaRepository();
//		if(vacinaRep.excluir(2)) {
//			System.out.println("Vacina 2 excluída.");
//		}
		
//		Vacina senacVac = new Vacina();
//		senacVac.setDataInicioPesquisa(new Date());
//		senacVac.setEstagioPesquisa(1);
//		senacVac.setNomePesquisadorResponsavel("Ronaldinho Gaúcho");
//		senacVac.setPaisOrigem("Brasil");
//		
//		senacVac = vacinaRep.inserir(senacVac);
//		
//		if(senacVac.getId() > 0) {
//			System.out.println("Nova vacina salva.");
//		}
		
		Vacina vacinaQueTemNoBanco = vacinaRep.pesquisarPorId(3);
		System.out.println(vacinaQueTemNoBanco);
		
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
