package br.univas.si6.es4.edu.command;

//Esta clase a principal função dela é Abrir o portao pelo metodo execute()

public class AbrirCommand implements Command {
	private Portao portao;
	
	public AbrirCommand(Portao portao){
		this.portao = portao;
	}
	
	
	@Override
	public void execute() {
		portao.abrir();
		
	}

	@Override
	public void undo() {
		portao.fechar();
	}

}
