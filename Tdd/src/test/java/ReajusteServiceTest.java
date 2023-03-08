package test.java;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import main.java.br.com.alura.tdd.modelo.Desempenho;
import main.java.br.com.alura.tdd.modelo.Funcionario;
import main.java.br.com.alura.tdd.service.ReajusteService;

public class ReajusteServiceTest {
	private ReajusteService service;
	private Funcionario funcionario;
	
	@Before
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("2000.00"));
	}

	@Test
	public void reajusteDeveriaSerTresPorCentoQuandoDesempenhoADesejar() {
		
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("2060.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerQuinzePorCentoQuandoDesempenhoBom() {
		
		service.concederReajuste(funcionario, Desempenho.BOM);
		
		assertEquals(new BigDecimal("2300.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerVintePorCentoQuandoDesempenhoOtimo() {
		
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("2400.00"), funcionario.getSalario());
	}

}
