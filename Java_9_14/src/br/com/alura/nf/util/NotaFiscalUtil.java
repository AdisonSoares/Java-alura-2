package br.com.alura.nf.util;

import java.util.concurrent.SubmissionPublisher;

import br.com.alura.model.NotaFiscal;
import br.com.alura.nf.subscriber.NotaFiscalSubscriber;

/*OBS - A classe TesteEnvioBloqueante não vai executar com sucesso pois essa classe precisa implementar
* a classe  principal, indicando no generics se a nota vai ser do tipo Nota ou NotaFiscal,
* esta acontecendo um problema de ambiguidade, as classes que formam o sistema de emissao de notas
* dos livros e emissao de notas subscriber usam a classe principal a solucao seria separar os projetos,
* deixar um sistema para cada projeto, mas como o intuito é organizar em um pacote para organizaçao e
* ao mesmo tempo aprendizado com essas falhas vai ser preservada essa organizaçao sendo que nas
* anotacoes o ensinamento sobre o funcionamento paralalo por meio da criacao de subscriber proprias
* esta preservado.*/
public class NotaFiscalUtil {

	private SubmissionPublisher<NotaFiscal> publisher;

	public NotaFiscalUtil() {
		this.publisher = new SubmissionPublisher<NotaFiscal>();
		this.publisher.subscribe(new NotaFiscalSubscriber());
	}

	public void emitir(NotaFiscal nf) {
		this.publisher.submit(nf);
	}

	public void fechar() {
		this.publisher.close();
	}
}
