package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaJuridica extends Pessoa{
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
        this.setDataCriacao(LocalDate.now());
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String exibirInformacoes() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + getNome() + "\n" +
               "Endereço: " + getEndereco() + "\n" +
               "Nome Fantasia: " + getNomeFantasia() + "\n" +
               "CNPJ: " + getCnpj() + "\n" +
               "Data de Criação: " + getDataCriacao().format(formatador);
    }
}
