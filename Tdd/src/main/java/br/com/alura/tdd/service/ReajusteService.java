package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;

import main.java.br.com.alura.tdd.modelo.Desempenho;
import main.java.br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
			BigDecimal porcentagem = desempenho.percentualReajuste();
			BigDecimal reajuste = funcionario.getSalario().multiply(porcentagem);
			funcionario.reajuste(reajuste);
	}
}
