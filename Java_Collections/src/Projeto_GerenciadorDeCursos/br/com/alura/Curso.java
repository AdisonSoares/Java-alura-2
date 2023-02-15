package Projeto_GerenciadorDeCursos.br.com.alura;

import java.util.*;

public class Curso {
    private  String instrutor;
    private String nome;


    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    public String getNome() {
        return nome;
    }
    public String getInstrutor() {
        return instrutor;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "{Curso:"+this.nome+", "+
                "Tempo total: "+this.getTempoTotal()+" minutos, }"+
                "Aulas: "+this.aulas+"}";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int matricula) throws NoSuchFieldException {
        if(!matriculaParaAluno.containsKey(matricula))
            throw new NoSuchFieldException();
        return matriculaParaAluno.get(matricula);
    }
}
