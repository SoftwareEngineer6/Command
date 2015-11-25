package br.univas.si6.es4.edu.command;

public class Controle {
	private Command[] commands;
	private Command ultimoComand;
	
	
	
	public Controle(Command abrirCommand,Command fecharCommad){
		this.commands = new Command[2];
		commands[0] = abrirCommand;
		commands[1] = fecharCommad;
	}
	
	public void abrirPortao(){
		commands[0].execute();
		ultimoComand = commands[0];
	}
	
	public void fecharPortao(){
		commands[1].execute();
		ultimoComand = commands[1];
	}
	
	public void desfazer(){
		ultimoComand.undo();
	}
	

}
