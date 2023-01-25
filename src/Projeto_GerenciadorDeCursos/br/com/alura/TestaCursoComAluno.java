package Projeto_GerenciadorDeCursos.br.com.alura;

public class TestaCursoComAluno {
    public static void main(String[] args) {
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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.print("Aluno "+aluno1+" está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(aluno1));

        Aluno turini = new Aluno("Rodrigo Turini",34672);
        System.out.print("Essa aluno está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.print("O aluno1 é equals ao Turini ");
        System.out.println(aluno1.equals(turini));

        System.out.print("O hashcode do aluno1 é semelhando ao hashcode de turini? ");
        System.out.println(aluno1.hashCode() == turini.hashCode());
    }
}
