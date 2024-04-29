package src;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibir pagina");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar pagina");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocar");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausar");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionar musica");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligar");
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarCorrerioVoz() {
		// TODO Auto-generated method stub
		
	}
	
}
