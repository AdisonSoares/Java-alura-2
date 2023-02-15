package Projeto_GerenciadorDeCursos.br.com.alura;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) throws NoSuchFieldException {
        Curso javaColecoes = new Curso("Dominando coleções do java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",22));

        Aluno aluno1 = new Aluno("Rodrigo Turini", 34572);
        Aluno aluno2 = new Aluno("Guilherme Silveira", 5617);
        Aluno aluno3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(aluno1);
        javaColecoes.matricula(aluno2);
        javaColecoes.matricula(aluno3);

        System.out.println("Quem é o aluno com matricula 5617");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println(aluno);
    }
}
