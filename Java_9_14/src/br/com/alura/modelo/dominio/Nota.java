package br.com.alura.modelo.dominio;

import java.time.LocalDate;

public class Nota {
	private String nome;
	private LocalDate data;
	private Double valor;

	public Nota(String nome) {
		this.nome = nome;
		this.data = LocalDate.now();
		this.valor = 39.99;
	}

	@Override
	public String toString() {
		return "Nota fiscal gerada no nome de " + nome + " dia " + data + " no valor de " + valor;
	}
}
