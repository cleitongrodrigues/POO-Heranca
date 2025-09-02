package app;

public class Compromisso extends Atividade {
    private String dataInicial;
    private String dataFinal;

    public String getDataInicial() {
        return this.dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return this.dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Compromisso(long id, String descricao, String dataInicial, String dataFinal){
        this.setId(id);
        this.setDescricao(descricao);
        this.setDataInicial(dataInicial);
        this.setDataFinal(dataFinal);
    }
    
    // Criando um segundo construtor de mesmo nome, mas com menos parâmetros (sobrecarga de métodos)
    public Compromisso(long id, String descricao, String dataInicial){
        this.setId(id);
        this.setDescricao(descricao);
        this.setDataFinal(dataFinal);
    }
}