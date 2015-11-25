package br.univas.si6.es4.edu.command;

//Esta clase a principal função dela é Abrir o portao pelo metodo execute()

public class FecharCommand implements Command {
	private Portao portao;
	
	public FecharCommand(Portao portao){
		this.portao = portao;
	}
	
	
	@Override
	public void execute() {
		portao.fechar();
		
	}

	@Override
	public void undo() {
		portao.abrir();
	}

}
