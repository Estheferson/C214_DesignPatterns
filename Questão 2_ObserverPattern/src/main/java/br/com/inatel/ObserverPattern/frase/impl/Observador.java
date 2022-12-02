package br.com.inatel.ObserverPattern.frase.impl;
import br.com.inatel.ObserverPattern.frase.interfaces.iObservador;
public class Observador implements iObservador {
	int id;
	public Observador(int id) {

		this.id = id;
	}
	@Override
	public void update(Observavel obs) {
		System.out.println("Usuarios: "+ this.id);

		System.out.println("Quantidade de palavras: "
				+ obs.getQtdPalavras());

		System.out.println("Quantidade de palavras com quantidade de pares de caracteres: "
				+ obs.getQtdPares());

		System.out.println("Quantidade de palavras começadas com letras maiusculas:"
				+ obs.getQtdMaiusculas());
	}
}