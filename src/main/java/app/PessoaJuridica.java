package app;

import java.time.LocalDate;

public class PessoaJuridica {
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
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


    public String exibirInformacoes() {
        return "Nome: " + nome + "\n" +
               "Endereço: " + endereco + "\n" +
               "Nome Fantasia: " + nomeFantasia + "\n" +
               "CNPJ: " + cnpj + "\n" +
               "Data de Criação: " + dataCriacao;
    }
}
