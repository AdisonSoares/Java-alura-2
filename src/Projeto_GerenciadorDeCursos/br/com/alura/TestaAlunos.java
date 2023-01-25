package Projeto_GerenciadorDeCursos.br.com.alura;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");

        boolean pauloMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloMatriculado);

        alunos.remove("Alberto Souza");

        System.out.println(alunos);

        System.out.println(alunos.size());

        for (String aluno : alunos ) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno ->{
            System.out.println(aluno);
        });

        List<String> alunosEmLista = new ArrayList<>(alunos);
    }
}
