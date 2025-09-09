package app;

import java.time.LocalDate;

public abstract class Pessoa{
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;

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

    public LocalDate getDataCriacao(){
        return this.dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public abstract String exibirInformacoes();
}