package app;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tarefa[] tarefas = new Tarefa[5];
        Compromisso[] compromissos = new Compromisso[5];

        compromissos[2] = new Compromisso(2, "Compromisso1", "01/09/2025", "02/09/2025");

        tarefas[0] = new Tarefa(0, "Teste", false);
        tarefas[4] = new Tarefa(4, "Number4", false);

        PessoaFisica pessoaFisica1 = new PessoaFisica("Cleiton", "Queiroz", LocalDate.of(2000, 10, 15), "12345678912");


        System.out.println(tarefas[0].getDescricao());
        System.out.println(tarefas[4].getDescricao());
        System.out.println(compromissos[2].getDescricao());
        System.out.println(pessoaFisica1.getNome());
        System.out.println(pessoaFisica1.exibirInformacoes());
    }
}
