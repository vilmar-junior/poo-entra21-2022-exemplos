package exception;

public class VacinaSemResponsavelException extends Exception {

	public VacinaSemResponsavelException(String mensagem, Exception e) {
		super(mensagem, e);
	}
	
	public VacinaSemResponsavelException(String mensagem) {
		super(mensagem);
	}
}
