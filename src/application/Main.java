package application;

import entities.AparelhoTelefonico;
import entities.NavegadorInternet;
import entities.ReprodutorMusical;

public class Main {
	
	public static void main(String[] args) {
		ReprodutorMusical reprodutor = new ReprodutorMusical();
		reprodutor.selecionarMusica("Boate Azul");
		reprodutor.tocar();
		reprodutor.pausar();
		
		System.out.println();
		AparelhoTelefonico telefone = new AparelhoTelefonico();
		telefone.ligar("4002-8922");
		telefone.atender();
		telefone.iniciarCorreioVoz();
		
		System.out.println();
		NavegadorInternet navegador = new NavegadorInternet();
		navegador.exibirPagina("https://www.google.com");
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
	}
}
