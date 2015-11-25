package br.univas.si6.es4.edu.command;

public class Runner {

	public static void main(String[] args) {
		
		//Criando o portao
		Portao portao = new Portao();
		
		//Criando as classe para executar as funçoes
		AbrirCommand ab = new AbrirCommand(portao);
		FecharCommand fc = new FecharCommand(portao);
		
		//Controle para que centralize as execuções
		Controle control = new Controle(ab, fc);
		
		control.abrirPortao();
		control.fecharPortao();
		control.desfazer();
		

	}

}
