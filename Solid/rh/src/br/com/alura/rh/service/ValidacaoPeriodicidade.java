package rh.src.br.com.alura.rh.service;
import br.com.alura.rh.model.Funcionario;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste {
    public void validar(Funcionario funcionario, BigDecimal aumento){
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new br.com.alura.rh.ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
