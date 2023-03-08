package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import main.java.br.com.alura.tdd.modelo.Funcionario;
import main.java.br.com.alura.tdd.service.BonusService;

public class BonusServiceTest {

	@Test
	public void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto() {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class, 
				() -> service.calcularBonus(new Funcionario("FuncionarioTeste", LocalDate.now(), new BigDecimal("25000"))));                  
		
		
	}
	
	@Test
	public void bonusDeveriaSerDezPorCentoParaFuncionarioComSalarioBaixo() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("FuncionarioTeste", LocalDate.now(), new BigDecimal("2500")));                  
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	public void bonusDeveriaSerDezPorCentoParaSalarioDeExatamenteDezMilReais() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("FuncionarioTeste", LocalDate.now(), new BigDecimal("10000")));                  
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}


























