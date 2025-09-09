package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaFisica {
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private LocalDate dataNascimento;
    private String cpf;

    public PessoaFisica(String nome, String endereco, LocalDate dataNascimento, String cpf) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
        this.dataCriacao = LocalDate.now();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String exibirInformacoes() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + nome + "\n" +
               "Endereço: " + endereco + "\n" +
               "CPF: " + cpf + "\n" +
               "Data de Criação: " + dataCriacao + "\n" +
               "Data de Nascimento: " + dataNascimento + "\n" +
               "Data de Nascimento: " + getDataNascimento().format(formatador) + "\n" +
               "---------------------------------";
    }
}