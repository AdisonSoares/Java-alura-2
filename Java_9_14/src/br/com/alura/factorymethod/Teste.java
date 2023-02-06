package br.com.alura.factorymethod;

import java.util.*;
public class Teste {
	public static void main(String[] args) {
		List<String> nomes = List.of("primeiroNome", "segundoNome");
		Set.of("terceiroNome");
		Map.of("nome", "Joao");
		System.out.println(nomes);

		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);*/
	}
}
