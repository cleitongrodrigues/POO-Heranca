package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaFisica extends Pessoa{
    private LocalDate dataNascimento;
    private String cpf;

    public PessoaFisica(String nome, String endereco, LocalDate dataNascimento, String cpf) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
        this.setDataCriacao(LocalDate.now());
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

    @Override
    public String exibirInformacoes() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + getNome() + "\n" +
               "Endereço: " + getEndereco() + "\n" +
               "CPF: " + getCpf() + "\n" +
               "Data de Criação: " + getDataCriacao().format(formatador) + "\n" +
               "Data de Nascimento: " + getDataNascimento();
    }
}